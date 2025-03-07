package fish.pwn.hanami;

import fish.pwn.hanami.block.FacingBlock;
import fish.pwn.hanami.block.FacingSlab;
import fish.pwn.hanami.block.TatamiBlock;
import fish.pwn.hanami.block.TatamiSlab;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class HanamiBlocks {
	public static void initialize() {
		ItemGroupEvents.modifyEntriesEvent(HanamiItems.ITEM_GROUP_KEY).register(
			itemGroup -> {
				itemGroup.add(SUNBURNT_TATAMI.asItem());
				itemGroup.add(SUNBURNT_TATAMI_SLAB.asItem());
				itemGroup.add(TATAMI.asItem());
				itemGroup.add(TATAMI_SLAB.asItem());
			}
		);
	}

	private static Block register(
		String name,
		Function<AbstractBlock.Settings, Block> blockFactory,
		AbstractBlock.Settings settings,
		boolean shouldRegisterItem
	) {
		Identifier id = new Identifier(Hanami.MOD_ID, name);
		Block block = blockFactory.apply(settings);

		if (shouldRegisterItem) {
			BlockItem blockItem = new BlockItem(block, new Item.Settings());
			Registry.register(Registries.ITEM, id, blockItem);
		}

		return Registry.register(Registries.BLOCK, id, block);
	}

	public static final Block SUNBURNT_TATAMI = register(
		"sunburnt_tatami",
		FacingBlock::new,
		AbstractBlock.Settings.create()
			.sounds(BlockSoundGroup.BAMBOO)
			.resistance(2)
			.hardness(2),
		true
	);
	public static final Block SUNBURNT_TATAMI_SLAB = register(
		"sunburnt_tatami_slab",
		FacingSlab::new,
		AbstractBlock.Settings.create()
			.sounds(BlockSoundGroup.BAMBOO)
			.resistance(2)
			.hardness(2),
		true
	);
	public static final Block TATAMI = register(
		"tatami",
		TatamiBlock::new,
		AbstractBlock.Settings.create()
			.sounds(BlockSoundGroup.BAMBOO)
			.ticksRandomly()
			.resistance(2)
			.hardness(2),
		true
	);
	public static final Block TATAMI_SLAB = register(
		"tatami_slab",
		TatamiSlab::new,
		AbstractBlock.Settings.create()
			.sounds(BlockSoundGroup.BAMBOO)
			.ticksRandomly()
			.resistance(2)
			.hardness(2),
		true
	);
}

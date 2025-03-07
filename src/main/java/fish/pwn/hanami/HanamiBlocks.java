package fish.pwn.hanami;

import fish.pwn.hanami.block.*;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class HanamiBlocks {
	public static void initialize() {
		ItemGroupEvents.modifyEntriesEvent(HanamiItems.ITEM_GROUP_KEY).register(
			itemGroup -> {
				itemGroup.add(SUNBURNT_TATAMI.asItem());
				itemGroup.add(SUNBURNT_TATAMI_SLAB.asItem());
				itemGroup.add(TATAMI.asItem());
				itemGroup.add(TATAMI_SLAB.asItem());
				itemGroup.add(KUDZU.asItem());
			}
		);
	}

	private static Block register(
		String name,
		Block block,
		boolean shouldRegisterItem
	) {
		Identifier id = new Identifier(Hanami.MOD_ID, name);

		if (shouldRegisterItem) {
			BlockItem blockItem = new BlockItem(block, new Item.Settings());
			Registry.register(Registries.ITEM, id, blockItem);
		}

		return Registry.register(Registries.BLOCK, id, block);
	}

	public static final Block SUNBURNT_TATAMI = register(
		"sunburnt_tatami",
		new FacingBlock(AbstractBlock.Settings.create()
			.sounds(BlockSoundGroup.BAMBOO)
			.resistance(2)
			.hardness(2)),
		true
	);
	public static final Block SUNBURNT_TATAMI_SLAB = register(
		"sunburnt_tatami_slab",
		new FacingSlab(AbstractBlock.Settings.create()
			.sounds(BlockSoundGroup.BAMBOO)
			.resistance(2)
			.hardness(2)),
		true
	);
	public static final Block TATAMI = register(
		"tatami",
		new TatamiBlock(AbstractBlock.Settings.create()
			.sounds(BlockSoundGroup.BAMBOO)
			.ticksRandomly()
			.resistance(2)
			.hardness(2)),
		true
	);
	public static final Block TATAMI_SLAB = register(
		"tatami_slab",
		new TatamiSlab(AbstractBlock.Settings.create()
			.sounds(BlockSoundGroup.BAMBOO)
			.ticksRandomly()
			.resistance(2)
			.hardness(2)),
		true
	);
	public static final Block KUDZU = register(
		"kudzu",
		new KudzuBlock(AbstractBlock.Settings.create()
			.mapColor(MapColor.DARK_GREEN)
			.replaceable()
			.noCollision()
			.nonOpaque()
			.ticksRandomly()
			.strength(0.2F)
			.sounds(BlockSoundGroup.VINE)
			.burnable()
			.pistonBehavior(PistonBehavior.DESTROY)
		),
		true
	);
}

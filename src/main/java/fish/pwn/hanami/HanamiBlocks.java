package fish.pwn.hanami;

import fish.pwn.hanami.block.*;
import fish.pwn.hanami.block.FacingBlock;
import fish.pwn.hanami.world.tree.MapleSaplingGenerator;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
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

	public static final Block MAPLE_LEAVES = register(
		"maple_leaves",
		new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)),
		true
	);
	public static final Block MAPLE_LOG = register(
		"maple_log",
		new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)),
		true
	);
	public static final Block MAPLE_WOOD = register(
		"maple_wood",
		new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)),
		true
	);
	public static final Block STRIPPED_MAPLE_LOG = register(
		"stripped_maple_log",
		new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)),
		true
	);
	public static final Block STRIPPED_MAPLE_WOOD = register(
		"stripped_maple_wood",
		new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)),
		true
	);
	public static final Block MAPLE_PLANKS = register(
		"maple_planks",
		new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)),
		true
	);
	public static final Block MAPLE_SAPLING = register(
		"maple_sapling",
		new SaplingBlock(new MapleSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)),
		true
	);

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
}

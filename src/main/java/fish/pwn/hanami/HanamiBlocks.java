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
				itemGroup.add(MAPLE_BUTTON.asItem());
				itemGroup.add(MAPLE_DOOR.asItem());
				itemGroup.add(MAPLE_FENCE.asItem());
				itemGroup.add(MAPLE_FENCE_GATE.asItem());
				itemGroup.add(MAPLE_HANGING_SIGN.asItem());
				itemGroup.add(MAPLE_LEAVES.asItem());
				itemGroup.add(MAPLE_LOG.asItem());
				itemGroup.add(MAPLE_PLANKS.asItem());
				itemGroup.add(MAPLE_PRESSURE_PLATE.asItem());
				itemGroup.add(MAPLE_SAPLING.asItem());
				itemGroup.add(MAPLE_SIGN.asItem());
				itemGroup.add(MAPLE_SLAB.asItem());
				itemGroup.add(MAPLE_STAIRS.asItem());
				itemGroup.add(MAPLE_TRAPDOOR.asItem());
				itemGroup.add(MAPLE_WALL_HANGING_SIGN.asItem());
				itemGroup.add(MAPLE_WALL_SIGN.asItem());
				itemGroup.add(MAPLE_WOOD.asItem());
				itemGroup.add(POTTED_MAPLE_SAPLING.asItem());
				itemGroup.add(STRIPPED_MAPLE_LOG.asItem());
				itemGroup.add(STRIPPED_MAPLE_WOOD.asItem());

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

	public static final Block MAPLE_BUTTON = register(
		"maple_button",
		new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON).strength(4f),
			BlockSetType.OAK, 5, true),
		true
	);
	public static final Block MAPLE_DOOR = register(
		"maple_door",
		new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR).strength(4f), BlockSetType.OAK),
		true
	);
	public static final Block MAPLE_FENCE = register(
		"maple_fence",
		new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).strength(4f)),
		true
	);
	public static final Block MAPLE_FENCE_GATE = register(
		"maple_fence_gate",
		new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).strength(4f), WoodType.OAK),
		true
	);
	public static final Block MAPLE_HANGING_SIGN = register(
		"maple_hanging_sign",
		new HangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).strength(4f), WoodType.OAK),
		true
	);
	public static final Block MAPLE_LEAVES = register(
		"maple_leaves",
		new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(4f).nonOpaque()),
		true
	);
	public static final Block MAPLE_LOG = register(
		"maple_log",
		new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4f)),
		true
	);
	public static final Block MAPLE_PLANKS = register(
		"maple_planks",
		new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(4f)),
		true
	);
	public static final Block MAPLE_PRESSURE_PLATE = register(
		"maple_pressure_plate",
		new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
			FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(4f), BlockSetType.OAK),
		true
	);
	public static final Block MAPLE_SAPLING = register(
		"maple_sapling",
		new SaplingBlock(new MapleSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)),
		true
	);
	public static final Block MAPLE_SIGN = register(
		"maple_sign",
		new SignBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).strength(4f), WoodType.OAK),
		true
	);
	public static final Block MAPLE_SLAB = register(
		"maple_slab",
		new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).strength(4f)),
		true
	);
	public static final Block MAPLE_STAIRS = register(
		"maple_stairs",
		new StairsBlock(HanamiBlocks.MAPLE_PLANKS.getDefaultState(),
			FabricBlockSettings.copyOf(Blocks.OAK_FENCE).strength(4f)),
		true
	);
	public static final Block MAPLE_TRAPDOOR = register(
		"maple_trapdoor",
		new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(4f), BlockSetType.OAK),
		true
	);
	public static final Block MAPLE_WALL_HANGING_SIGN = register(
		"maple_wall_hanging_sign",
		new WallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).strength(4f), WoodType.OAK),
		true
	);
	public static final Block MAPLE_WALL_SIGN = register(
		"maple_wall_sign",
		new WallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).strength(4f), WoodType.OAK),
		true
	);
	public static final Block MAPLE_WOOD = register(
		"maple_wood",
		new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(4f)),
		true
	);
	public static final Block POTTED_MAPLE_SAPLING = register(
		"potted_maple_sapling",
		new FlowerPotBlock(MAPLE_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)),
		true
	);
	public static final Block STRIPPED_MAPLE_LOG = register(
		"stripped_maple_log",
		new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(4f)),
		true
	);
	public static final Block STRIPPED_MAPLE_WOOD = register(
		"stripped_maple_wood",
		new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f)),
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

package fish.pwn.hanami.datagen;

import fish.pwn.hanami.Hanami;
import fish.pwn.hanami.HanamiBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class HanamiLootTableProvider extends FabricBlockLootTableProvider {
	public HanamiLootTableProvider(FabricDataOutput dataOutput) {
		super(dataOutput);
	}

	@Override
	public void generate() {
		addDrop(HanamiBlocks.MAPLE_BUTTON);
		addDrop(HanamiBlocks.MAPLE_DOOR, doorDrops(HanamiBlocks.MAPLE_DOOR));
		addDrop(HanamiBlocks.MAPLE_FENCE);
		addDrop(HanamiBlocks.MAPLE_FENCE_GATE);
		addDrop(HanamiBlocks.MAPLE_HANGING_SIGN);
		addDrop(HanamiBlocks.MAPLE_LEAVES, leavesDrops(HanamiBlocks.MAPLE_LEAVES, HanamiBlocks.MAPLE_SAPLING, 0.005F));
		addDrop(HanamiBlocks.MAPLE_LOG);
		addDrop(HanamiBlocks.MAPLE_PLANKS);
		addDrop(HanamiBlocks.MAPLE_PRESSURE_PLATE);
		addDrop(HanamiBlocks.MAPLE_SAPLING);
		addDrop(HanamiBlocks.MAPLE_SIGN);
		addDrop(HanamiBlocks.MAPLE_SLAB, slabDrops(HanamiBlocks.MAPLE_SLAB));
		addDrop(HanamiBlocks.MAPLE_STAIRS);
		addDrop(HanamiBlocks.MAPLE_TRAPDOOR);
		addDrop(HanamiBlocks.MAPLE_WALL_HANGING_SIGN);
		addDrop(HanamiBlocks.MAPLE_WALL_SIGN);
		addDrop(HanamiBlocks.MAPLE_WOOD);
		addDrop(HanamiBlocks.POTTED_MAPLE_SAPLING, pottedPlantDrops(HanamiBlocks.POTTED_MAPLE_SAPLING));
		addDrop(HanamiBlocks.STRIPPED_MAPLE_LOG);
		addDrop(HanamiBlocks.STRIPPED_MAPLE_WOOD);

		addDrop(HanamiBlocks.SUNBURNT_TATAMI);
		addDrop(HanamiBlocks.SUNBURNT_TATAMI_SLAB, slabDrops(HanamiBlocks.SUNBURNT_TATAMI_SLAB));
		addDrop(HanamiBlocks.TATAMI);
		addDrop(HanamiBlocks.TATAMI_SLAB, slabDrops(HanamiBlocks.TATAMI_SLAB));
	}
}

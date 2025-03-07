package fish.pwn.hanami.datagen;

import fish.pwn.hanami.HanamiBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class HanamiLootTableProvider extends FabricBlockLootTableProvider {
	public HanamiLootTableProvider(FabricDataOutput dataOutput) {
		super(dataOutput);
	}

	@Override
	public void generate() {
		addDrop(HanamiBlocks.SUNBURNT_TATAMI);
		addDrop(HanamiBlocks.SUNBURNT_TATAMI_SLAB, slabDrops(HanamiBlocks.SUNBURNT_TATAMI_SLAB));
		addDrop(HanamiBlocks.TATAMI);
		addDrop(HanamiBlocks.TATAMI_SLAB, slabDrops(HanamiBlocks.TATAMI_SLAB));
	}
}

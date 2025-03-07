package fish.pwn.hanami.datagen;

import fish.pwn.hanami.HanamiBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class HanamiBlockTagProvider extends FabricTagProvider.BlockTagProvider {
	public HanamiBlockTagProvider(
		FabricDataOutput dataOutput,
		CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture
	) {
		super(dataOutput, registriesFuture);
	}

	@Override
	public void configure(RegistryWrapper.WrapperLookup arg) {
		getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
			.add(HanamiBlocks.MAPLE_LOG)
			.add(HanamiBlocks.MAPLE_PLANKS)
			.add(HanamiBlocks.MAPLE_WOOD)
			.add(HanamiBlocks.STRIPPED_MAPLE_LOG)
			.add(HanamiBlocks.STRIPPED_MAPLE_WOOD)
			.add(HanamiBlocks.SUNBURNT_TATAMI)
			.add(HanamiBlocks.SUNBURNT_TATAMI_SLAB)
			.add(HanamiBlocks.TATAMI)
			.add(HanamiBlocks.TATAMI_SLAB);

		getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
			.add(HanamiBlocks.MAPLE_LEAVES);

		getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
			.add(HanamiBlocks.MAPLE_LOG)
			.add(HanamiBlocks.MAPLE_WOOD)
			.add(HanamiBlocks.STRIPPED_MAPLE_LOG)
			.add(HanamiBlocks.STRIPPED_MAPLE_WOOD);

	}
}

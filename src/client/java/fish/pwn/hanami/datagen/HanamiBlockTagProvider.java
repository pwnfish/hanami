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
			.add(HanamiBlocks.SUNBURNT_TATAMI)
			.add(HanamiBlocks.SUNBURNT_TATAMI_SLAB)
			.add(HanamiBlocks.TATAMI)
			.add(HanamiBlocks.TATAMI_SLAB);
	}
}

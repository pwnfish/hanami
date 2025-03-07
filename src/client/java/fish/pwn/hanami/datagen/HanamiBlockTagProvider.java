package fish.pwn.hanami.datagen;

import fish.pwn.hanami.HanamiBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

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

		getOrCreateTagBuilder(BlockTags.FENCE_GATES)
			.add(HanamiBlocks.MAPLE_FENCE_GATE);

		getOrCreateTagBuilder(BlockTags.FLOWER_POTS)
			.add(HanamiBlocks.POTTED_MAPLE_SAPLING);

		getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
			.add(HanamiBlocks.MAPLE_LEAVES);

		getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
			.add(HanamiBlocks.MAPLE_LOG)
			.add(HanamiBlocks.MAPLE_WOOD)
			.add(HanamiBlocks.STRIPPED_MAPLE_LOG)
			.add(HanamiBlocks.STRIPPED_MAPLE_WOOD);

		getOrCreateTagBuilder(BlockTags.WALL_HANGING_SIGNS)
			.add(HanamiBlocks.MAPLE_WALL_HANGING_SIGN);
		getOrCreateTagBuilder(BlockTags.WALL_SIGNS)
			.add(HanamiBlocks.MAPLE_WALL_SIGN);

		getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS)
			.add(HanamiBlocks.MAPLE_BUTTON);
		getOrCreateTagBuilder(BlockTags.WOODEN_DOORS)
			.add(HanamiBlocks.MAPLE_DOOR);
		getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
			.add(HanamiBlocks.MAPLE_FENCE);
		getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
			.add(HanamiBlocks.MAPLE_PRESSURE_PLATE);
		getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
			.add(HanamiBlocks.MAPLE_SLAB);
		getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS)
			.add(HanamiBlocks.MAPLE_STAIRS);
		getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS)
			.add(HanamiBlocks.MAPLE_TRAPDOOR);

	}
}

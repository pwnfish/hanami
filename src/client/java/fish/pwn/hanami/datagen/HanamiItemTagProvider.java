package fish.pwn.hanami.datagen;

import fish.pwn.hanami.HanamiBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class HanamiItemTagProvider extends FabricTagProvider.ItemTagProvider {

	public static final TagKey<Item> MAPLE_LOGS = TagKey.of(RegistryKeys.ITEM, new Identifier("hanami", "maple_logs"));

	public HanamiItemTagProvider(
		FabricDataOutput dataOutput,
		CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture
	) {
		super(dataOutput, registriesFuture);
	}

	@Override
	public void configure(RegistryWrapper.WrapperLookup arg) {
		getOrCreateTagBuilder(MAPLE_LOGS)
			.add(HanamiBlocks.MAPLE_LOG.asItem())
			.add(HanamiBlocks.MAPLE_WOOD.asItem())
			.add(HanamiBlocks.STRIPPED_MAPLE_LOG.asItem())
			.add(HanamiBlocks.STRIPPED_MAPLE_WOOD.asItem());
		getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
			.add(HanamiBlocks.MAPLE_LOG.asItem())
			.add(HanamiBlocks.MAPLE_WOOD.asItem())
			.add(HanamiBlocks.STRIPPED_MAPLE_LOG.asItem())
			.add(HanamiBlocks.STRIPPED_MAPLE_WOOD.asItem());

		getOrCreateTagBuilder(ItemTags.PLANKS)
			.add(HanamiBlocks.MAPLE_PLANKS.asItem());

		getOrCreateTagBuilder(ItemTags.WOODEN_BUTTONS)
			.add(HanamiBlocks.MAPLE_BUTTON.asItem());
		getOrCreateTagBuilder(ItemTags.WOODEN_DOORS)
			.add(HanamiBlocks.MAPLE_DOOR.asItem());
		getOrCreateTagBuilder(ItemTags.WOODEN_FENCES)
			.add(HanamiBlocks.MAPLE_FENCE.asItem());
		getOrCreateTagBuilder(ItemTags.WOODEN_PRESSURE_PLATES)
			.add(HanamiBlocks.MAPLE_PRESSURE_PLATE.asItem());
		getOrCreateTagBuilder(ItemTags.WOODEN_SLABS)
			.add(HanamiBlocks.MAPLE_SLAB.asItem());
		getOrCreateTagBuilder(ItemTags.WOODEN_STAIRS)
			.add(HanamiBlocks.MAPLE_STAIRS.asItem());
		getOrCreateTagBuilder(ItemTags.WOODEN_TRAPDOORS)
			.add(HanamiBlocks.MAPLE_TRAPDOOR.asItem());


	}
}

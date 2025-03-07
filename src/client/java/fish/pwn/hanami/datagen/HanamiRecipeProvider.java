package fish.pwn.hanami.datagen;

import fish.pwn.hanami.HanamiBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class HanamiRecipeProvider extends FabricRecipeProvider {
	public HanamiRecipeProvider(FabricDataOutput dataOutput) {
		super(dataOutput);
	}

	@Override
	public void generate(Consumer<RecipeJsonProvider> exporter) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, HanamiBlocks.TATAMI, 1)
			.pattern(" s ")
			.pattern("shs")
			.pattern(" s ")
			.input('s', Items.STRING)
			.input('h', Items.HAY_BLOCK)
			.criterion(hasItem(Items.STRING), conditionsFromItem(Items.STRING))
			.criterion(hasItem(Items.HAY_BLOCK), conditionsFromItem(Items.HAY_BLOCK))
			.offerTo(exporter);
		offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HanamiBlocks.TATAMI_SLAB, HanamiBlocks.TATAMI);
	}
}

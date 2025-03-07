package fish.pwn.hanami.world;

import fish.pwn.hanami.Hanami;
import fish.pwn.hanami.HanamiBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.CherryTrunkPlacer;


public class HanamiConfiguredFeatures {

	private static <FC extends FeatureConfig, F extends Feature<FC>> void register(
		Registerable<ConfiguredFeature<?, ?>> context,
		RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {

		context.register(key, new ConfiguredFeature<>(feature, configuration));
	}


	public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
		return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(Hanami.MOD_ID, name));
	}



	public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
		register(context, MAPLE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
			BlockStateProvider.of(HanamiBlocks.MAPLE_LOG),
			new CherryTrunkPlacer(5, 4, 3, ConstantIntProvider.create(3), ConstantIntProvider.create(2),
				UniformIntProvider.create(1, 3), ConstantIntProvider.create(1)),
			BlockStateProvider.of(HanamiBlocks.MAPLE_LEAVES),
			new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
			new TwoLayersFeatureSize(1, 0, 2)).build());
	}

	public static final RegistryKey<ConfiguredFeature<?, ?>> MAPLE_KEY = registerKey("maple");

}

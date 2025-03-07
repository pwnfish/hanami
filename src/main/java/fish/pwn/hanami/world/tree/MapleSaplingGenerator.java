package fish.pwn.hanami.world.tree;

import fish.pwn.hanami.world.HanamiConfiguredFeatures;
import net.minecraft.registry.RegistryKey;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import org.jetbrains.annotations.Nullable;

public class MapleSaplingGenerator extends SaplingGenerator {
	@Nullable
	@Override
	protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
		return HanamiConfiguredFeatures.MAPLE_KEY;
	}
}

package fish.pwn.hanami.block;

import fish.pwn.hanami.HanamiBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;

public class TatamiSlab extends FacingSlab {
	public TatamiSlab(Settings settings) {
		super(settings);
	}

	@SuppressWarnings("deprecation")
	@Override
	public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
		super.randomTick(state, world, pos, random);

		if (world.isSkyVisible(pos.up()) && world.isDay() && random.nextInt(100) > 50) {
			world.setBlockState(pos, HanamiBlocks.SUNBURNT_TATAMI_SLAB.getStateWithProperties(state));
		}
	}
}

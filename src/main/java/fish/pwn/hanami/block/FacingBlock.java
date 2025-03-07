package fish.pwn.hanami.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.Direction;

import java.util.Objects;

public class FacingBlock extends Block {
	public FacingBlock(Settings settings) {
		super(settings);
	}

	public static final EnumProperty<Direction> FACING = Properties.HORIZONTAL_FACING;

	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	@Override
	public BlockState getPlacementState(ItemPlacementContext ctx) {
		return Objects.requireNonNull(super.getPlacementState(ctx)).with(
			FACING,
			ctx.getHorizontalPlayerFacing().getOpposite()
		);
	}
}

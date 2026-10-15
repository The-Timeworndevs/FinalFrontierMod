package net.tws.final_frontier.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.AbstractFurnaceBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.tws.final_frontier.common.init.FFBlockEntities;
import org.jspecify.annotations.Nullable;

public class AlloyFurnaceBlock extends AbstractFurnaceBlock {

    public AlloyFurnaceBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected void openContainer(Level level, BlockPos pos, Player player) {

    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos worldPosition, BlockState blockState) {
        return null;
    }

    @Override
    public @Nullable <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState blockState, BlockEntityType<T> type) {
        if (!level.isClientSide()) {
            return null;
        }

        //return createTickerHelper(type, FFBlockEntities.ALLOY_FURNACE_BE, ((level1, pos, state, entity) -> ))
        return null;
    }
}

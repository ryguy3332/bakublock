package com.oddeyes3.bakublock.customblock;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class GateCard extends Block
{
    public static final VoxelShape SHAPE = BaseEntityBlock.box(   4.9 / 16.0,  // "from" x coordinate divided by 16
            0.0 / 16.0,  // "from" y coordinate divided by 16
            4.0 / 16.0,  // "from" z coordinate divided by 16
            10.15 / 16.0,  // "to" x coordinate divided by 16
            0.25 / 16.0,  // "to" y coordinate divided by 16
            12.0 / 16.0   // "to" z coordinate divided by 16
    );

    public GateCard (BlockBehaviour.Properties Properties)
    {
        super(Properties);
    }

    @Override
    public VoxelShape getShape(BlockState p_60555_, BlockGetter p_60556_, BlockPos p_60557_, CollisionContext p_60558_) {
        return SHAPE;
    }

    @Override
    public RenderShape getRenderShape(BlockState p_49232_) {
        return RenderShape.MODEL;
    }

}

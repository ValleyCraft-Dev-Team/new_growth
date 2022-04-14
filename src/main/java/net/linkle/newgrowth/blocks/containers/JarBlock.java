package net.linkle.newgrowth.blocks.containers;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class JarBlock extends Block {

    private static final VoxelShape SHAPE = Block.createCuboidShape(2, 0, 2, 14, 14, 14);

    public JarBlock(FabricBlockSettings setting) {
        super(FabricBlockSettings.of(Material.GLASS)
                .breakInstantly()
                .sounds(BlockSoundGroup.GLASS)
                .strength(0.5f, 2.5f));
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
}
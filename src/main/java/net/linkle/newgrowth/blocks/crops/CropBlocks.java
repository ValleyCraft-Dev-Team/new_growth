package net.linkle.newgrowth.blocks.crops;

import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;

public class CropBlocks extends CropBlock {
    
    //private final VoxelShape[] ageToShape = new VoxelShape[MAX_AGE+1];
    
    public CropBlocks() {
        super(Settings.copy(Blocks.WHEAT));
    }

    /*
    public CropBlocks(Settings settings) {
        super(settings);
        var array = getShapes();
        for (int i = 0; i < MAX_AGE; i++) {
            ageToShape[i] = createCuboidShape(0, 0, 0, 16, array[i], 16);
        }
    }
    
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return ageToShape[state.get(getAgeProperty())];
    } */
    
    /** An array int of heights for a hitbox. */
    //protected abstract int[] getShapes();
    
    
    @Override
    protected ItemConvertible getSeedsItem() {
        return this;
    }
}

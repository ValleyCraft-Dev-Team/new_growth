package net.linkle.newgrowth.blocks.crops;

import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;
import net.minecraft.block.Fertilizable;
import net.minecraft.item.ItemConvertible;
import net.minecraft.util.shape.VoxelShape;

public abstract class CropBlocks extends CropBlock implements Fertilizable {
    
    private final VoxelShape[] ageToShape = new VoxelShape[MAX_AGE+1];
    
    public CropBlocks() {
        this(Settings.copy(Blocks.WHEAT));
    }

    public CropBlocks(Settings settings) {
        super(settings);
        var array = getShapes();
        for (int i = 0; i < MAX_AGE; i++) {
            ageToShape[i] = createCuboidShape(0, 0, 0, 16, array[i], 16);
        }
    }
    
    /** An array int of heights for a hitbox. */
    protected abstract int[] getShapes();
    
    @Override
    protected abstract ItemConvertible getSeedsItem();
}

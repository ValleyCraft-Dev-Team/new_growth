package net.linkle.newgrowth.z_INIT;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;

@Environment(EnvType.CLIENT)
public class RenderLayers {
    
    @SuppressWarnings("unused")
    public static void initialize() {
        // Only use cullout if the block's texture contains empty pixels.
        var cullout = RenderLayer.getCutout();
        
        // Only use translucent if the block's texture contains transparent pixels.
        var translucent = RenderLayer.getTranslucent();
        
        // Put block with any RenderLayer one at a time. 
        // You can't use multiple RenderLayer on a single block. It doesn't work.
        // I Removed the JAR block because it doesn't contains any transparent pixels in their texture.
        
        put(NG_Blocks.AMETHYST_GLASS, translucent);
        put(NG_Blocks.SPIKE_TRAP, cullout); 
    }
    
    private static void put(Block block, RenderLayer layer) {
        BlockRenderLayerMap.INSTANCE.putBlock(block, layer);
    }
}

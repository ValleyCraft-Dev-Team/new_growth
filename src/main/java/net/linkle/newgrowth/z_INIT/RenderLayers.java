package net.linkle.newgrowth.z_INIT;

import static net.linkle.newgrowth.z_INIT.NG_Blocks.*;
import static net.linkle.newgrowth.z_INIT.NG_Crops.*;

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
        
        put(AMETHYST_GLASS, translucent);
        put(SPIKE_TRAP, cullout);
        
        put(SHORT_LILAC, cullout);
        put(SHORT_PEONY, cullout);
        put(SHORT_ROSE_BUSH, cullout);
        put(SHORT_SUNFLOWER, cullout);
        put(SILENT_FAIRY_FLOWER, cullout);
        
        put(AMETHYSTLES, cullout);
        put(ANCIENT_FLOWERS, cullout);
        put(CLAY_SPROUTLETS, cullout);
        put(FIRE_PEPPERS, cullout);
        put(ONIONS, cullout);
        put(PUFF_BALLS, cullout);
        put(WILD_RICES, cullout);
        
        put(WILD_AMETHYSTLE, cullout);
        put(WILD_ANCIENT_FLOWER, cullout);
        put(WILD_BEET, cullout);
        put(WILD_CARROT, cullout);
        put(WILD_CLAY_SPROUTLET, cullout);
        put(WILD_FIRE_PEPPER, cullout);
        put(WILD_ONION, cullout);
        put(WILD_POTATO, cullout);
        put(WILD_PUFF_BALL, cullout);
        put(WILD_RICE, cullout);
        put(WILD_WHEAT, cullout);
    }
    
    private static void put(Block block, RenderLayer layer) {
        BlockRenderLayerMap.INSTANCE.putBlock(block, layer);
    }
}

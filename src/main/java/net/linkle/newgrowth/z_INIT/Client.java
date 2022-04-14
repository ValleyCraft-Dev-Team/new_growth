package net.linkle.newgrowth.z_INIT;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;

import java.util.ArrayList;

import static net.linkle.newgrowth.z_INIT.NG_Blocks.JAR;

@Environment(EnvType.CLIENT)
public class Client implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        renderLayer();
    }

    private static void renderLayer() {
        var culloutBlocks = new ArrayList<Block>(100);
        var translucentBlocks = new ArrayList<Block>(100);

        translucentBlocks.add(JAR);
        culloutBlocks.add(JAR);

        var layerMap = BlockRenderLayerMap.INSTANCE;
        for (var block : culloutBlocks) {
            layerMap.putBlock(block, RenderLayer.getCutout());
        }
        for (var block : translucentBlocks) {
            layerMap.putBlock(block, RenderLayer.getTranslucent());
        }
    }
}
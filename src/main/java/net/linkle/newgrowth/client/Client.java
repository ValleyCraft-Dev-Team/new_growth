package net.linkle.newgrowth.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.linkle.newgrowth.z_INIT.RenderLayers;

@Environment(EnvType.CLIENT)
public class Client implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        RenderLayers.initialize();
    }
}
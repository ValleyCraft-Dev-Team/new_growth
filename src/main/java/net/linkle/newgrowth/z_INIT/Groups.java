package net.linkle.newgrowth.z_INIT;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.linkle.newgrowth.NewGrowth;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class Groups {
    public static final ItemGroup TEST_GROUP = FabricItemGroupBuilder.create(
            new Identifier(NewGrowth.MOD_ID, "test_group")).icon(() -> new ItemStack(Items.BREAD)).build();

    public static void initialize() {
    }
}

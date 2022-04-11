package net.linkle.newgrowth.z_INIT;

import net.linkle.newgrowth.blocks.stone_blocks.StoneBlock;
import net.linkle.newgrowth.utils.Util;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.OreBlock;
import net.minecraft.item.Item;
import net.minecraft.util.math.intprovider.UniformIntProvider;

import static net.linkle.newgrowth.z_INIT.itemgroups.TEST_GROUP;

public class blocks {
    public static final Block SALT_ORE = new OreBlock(Block.Settings.copy(Blocks.COAL_ORE), UniformIntProvider.create(0, 2));
    public static final Block SALT_BLOCK = new StoneBlock();
    public static final Block NETHER_SALT = new OreBlock(Block.Settings.copy(Blocks.NETHER_QUARTZ_ORE), UniformIntProvider.create(0, 2));
    public static final Block NETHER_COAL_ORE = new OreBlock(Block.Settings.copy(Blocks.NETHER_QUARTZ_ORE), UniformIntProvider.create(0, 2));

    public static void initialize() {
        var testGroup = new Item.Settings().group(TEST_GROUP);

        Util.registerWithItem("salt_ore", SALT_ORE, testGroup);
        Util.registerWithItem("salt_block", SALT_BLOCK, testGroup);
    }
}

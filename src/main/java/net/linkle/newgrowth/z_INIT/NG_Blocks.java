package net.linkle.newgrowth.z_INIT;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.linkle.newgrowth.blocks.containers.JarBlock;
import net.linkle.newgrowth.blocks.misc.SpikeTrapBlock;
import net.linkle.newgrowth.blocks.stones.StoneBlock;
import net.linkle.newgrowth.utils.Reg;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.GlassBlock;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.block.PaneBlock;
import net.minecraft.block.PillarBlock;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Settings;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.intprovider.UniformIntProvider;

import static net.linkle.newgrowth.z_INIT.NG_Groups.TEST_GROUP;

public class NG_Blocks {
    public static final Block SALT_ORE = new OreBlock(Block.Settings.copy(Blocks.COAL_ORE), UniformIntProvider.create(0, 2));
    public static final Block SALT_BLOCK = new StoneBlock();
    public static final Block CHARCOAL_BLOCK = new StoneBlock();

    public static final Block NETHER_SALT = new OreBlock(Block.Settings.copy(Blocks.NETHER_QUARTZ_ORE), UniformIntProvider.create(0, 2));
    public static final Block NETHER_COAL_ORE = new OreBlock(Block.Settings.copy(Blocks.NETHER_QUARTZ_ORE), UniformIntProvider.create(0, 2));
    
    public static final Block FIBER_BALE = new PillarBlock(Block.Settings.copy(Blocks.HAY_BLOCK));
    public static final Block SUGARCANE_BALE = new PillarBlock(Block.Settings.copy(Blocks.HAY_BLOCK));

    public static final Block JAR = new JarBlock(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).breakInstantly().strength(1f, 5f));

    // Misc
    public static final Block AMETHYST_GLASS = new GlassBlock(Block.Settings.copy(Blocks.GLASS).strength(0.5f));
    public static final Block BARK_PLANKS = new Block(Block.Settings.copy(Blocks.OAK_PLANKS));
    public static final Block SPIKE_TRAP = new SpikeTrapBlock(
            Block.Settings.of(Material.WOOD)
            .sounds(BlockSoundGroup.WOOD)
            .strength(0.5f, 1.0f));
    
    public static void initialize() {
        var testGroup = new Item.Settings().group(TEST_GROUP);

        Reg.registerWithItem("jar", JAR, testGroup);

        Reg.registerWithItem("salt_ore", SALT_ORE, testGroup);
        Reg.registerWithItem("salt_block", SALT_BLOCK, testGroup);
        Reg.registerWithItem("charcoal_block", CHARCOAL_BLOCK, testGroup);

        Reg.registerWithItem("nether_salt_ore", NETHER_SALT, testGroup);
        Reg.registerWithItem("nether_coal_ore", NETHER_COAL_ORE, testGroup);
        
        Reg.registerWithItem("fiber_bale", FIBER_BALE, testGroup);
        Reg.registerWithItem("sugarcane_bale", SUGARCANE_BALE, testGroup);
        
        // Misc
        Reg.registerWithItem("amethyst_glass", AMETHYST_GLASS, testGroup);
        Reg.registerWithItem("bark_planks", BARK_PLANKS, testGroup);
        Reg.registerWithItem("spike_trap", SPIKE_TRAP, testGroup);
    }
}

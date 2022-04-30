package net.linkle.newgrowth.z_INIT;

import net.linkle.newgrowth.blocks.crops.CropBlocks;
import net.linkle.newgrowth.items.foods.BaseFood;
import net.linkle.newgrowth.utils.Reg;
import net.minecraft.block.Block;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;

public class NG_Crops {
    public static final Block AMETHYSTLES = new CropBlocks();
    public static final Item AMETHYSTLE_SEEDS = new AliasedBlockItem(AMETHYSTLES, itemSettings());
    public static final Item AMETHYSTLE = new BaseFood(itemSettings(), 4, 2);
    
    public static final Block ANCIENT_FLOWERS = new CropBlocks();
    public static final Item ANCIENT_FLOWER_SEED_BULBS = new AliasedBlockItem(ANCIENT_FLOWERS, itemSettings());
    public static final Item ANCIENT_FLOWER = new Item(itemSettings());
    
    public static final Block CLAY_SPROUTLETS = new CropBlocks();
    public static final Item CLAY_SPROUTLET = new Item(itemSettings());
    
    public static final Block FIRE_PEPPERS = new CropBlocks();
    public static final Item FIRE_PEPPER_SEEDS = new AliasedBlockItem(FIRE_PEPPERS, itemSettings());
    public static final Item FIRE_PEPPER = new BaseFood(itemSettings(), 4, 2);
    
    public static final Block ONIONS = new CropBlocks();
    public static final Item ONION_SEEDS = new AliasedBlockItem(ONIONS, itemSettings());
    public static final Item ONION = new BaseFood(itemSettings(), 4, 2);
    
    public static final Block PUFF_BALLS = new CropBlocks();
    public static final Item PUFF_BALL_SEEDS = new AliasedBlockItem(PUFF_BALLS, itemSettings());
    public static final Item PUFF_BALL = new Item(itemSettings());
    
    public static final Block WILD_RICES = new CropBlocks();
    public static final Item WILD_RICE_SEED_SPROUTS = new AliasedBlockItem(WILD_RICES, itemSettings());
    public static final Item RICE = new Item(itemSettings());
    
    public static void initialize() {
        Reg.register("amethystles", AMETHYSTLES);
        Reg.register("amethystle_seeds", AMETHYSTLE_SEEDS);
        Reg.register("amethystle", AMETHYSTLE);
        
        Reg.register("ancient_flowers", ANCIENT_FLOWERS);
        Reg.register("ancient_flower_seed_bulbs", ANCIENT_FLOWER_SEED_BULBS);
        Reg.register("ancient_flower", ANCIENT_FLOWER);
        
        Reg.register("clay_sproutlets", CLAY_SPROUTLETS);
        Reg.register("clay_sproutlet", CLAY_SPROUTLET);
        
        Reg.register("fire_peppers", FIRE_PEPPERS);
        Reg.register("fire_pepper_seeds", FIRE_PEPPER_SEEDS);
        Reg.register("fire_pepper", FIRE_PEPPER);
        
        Reg.register("onions", ONIONS);
        Reg.register("onion_seeds", ONION_SEEDS);
        Reg.register("onion", ONION);
        
        Reg.register("puff_balls", PUFF_BALLS);
        Reg.register("puff_ball_seeds", PUFF_BALL_SEEDS);
        Reg.register("puff_ball", PUFF_BALL);
        
        Reg.register("wild_rices", WILD_RICES);
        Reg.register("wild_rice_seed_sprouts", WILD_RICE_SEED_SPROUTS);
        Reg.register("rice", RICE);
    }
    
    private static Item.Settings itemSettings() {
        return new Item.Settings().group(NG_Groups.TEST_GROUP);
    }
}

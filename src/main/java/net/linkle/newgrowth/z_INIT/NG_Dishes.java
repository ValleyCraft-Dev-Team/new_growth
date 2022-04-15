package net.linkle.newgrowth.z_INIT;

import static net.minecraft.item.Items.GLASS_BOTTLE;

import net.linkle.newgrowth.items.drinks.BaseDrinkBottle;
import net.linkle.newgrowth.items.drinks.MilkBottle;
import net.linkle.newgrowth.items.foods.BaseBowl;
import net.linkle.newgrowth.items.foods.BaseFood;
import net.linkle.newgrowth.items.foods.BaseGoldenFood;
import net.linkle.newgrowth.items.foods.tier1dishes.BaseTierOneNormal;
import net.linkle.newgrowth.items.foods.tier2dishes.BaseTierTwoNormal;
import net.linkle.newgrowth.items.foods.tier3dishes.BaseTierThreeBowl;
import net.linkle.newgrowth.utils.Reg;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;

public class NG_Dishes {
    
    // bakes
    public static final Item BAKED_APPLE = new BaseFood(settings(), 4, 2);
    public static final Item BAKED_BEET = new BaseFood(settings(), 4, 2);
    public static final Item BAKED_CARROT = new BaseFood(settings(), 4, 2);
    public static final Item BAKED_ENDURA_CARROT = new BaseFood(settings(), 4, 2);
    public static final Item BAKED_FIRE_PEPPER = new BaseFood(settings(), 4, 2);
    public static final Item BAKED_GLOW_BERRIES = new BaseFood(settings(), 4, 2);
    public static final Item BAKED_HEARTY_BEET = new BaseFood(settings(), 4, 2);
    public static final Item BAKED_MELON_SLICE = new BaseFood(settings(), 4, 2);
    public static final Item BAKED_ONION = new BaseFood(settings(), 4, 2);
    public static final Item BAKED_PUMPKIN_SLICE = new BaseFood(settings(), 4, 2);
    public static final Item BAKED_SEEDS = new BaseFood(settings(), 4, 2);
    public static final Item BAKED_SWEET_BERRIES = new BaseFood(settings(), 4, 2);
    public static final Item STEAMED_RICE = new BaseFood(settings(), 4, 2);
    
    // doughs
    public static final Item APPLE_PIE_DOUGH = new BaseFood(settings(), 4, 2);
    public static final Item BREAD_DOUGH = new BaseFood(settings(), 4, 2);
    public static final Item CAKE_DOUGH = new BaseFood(settings(), 4, 2);
    public static final Item CHORUS_FRUIT_PIE_DOUGH = new BaseFood(settings(), 4, 2);
    public static final Item GLOW_BERRY_PIE_DOUGH = new BaseFood(settings(), 4, 2);
    public static final Item HARDTACK_DOUGH = new BaseFood(settings(), 4, 2);
    public static final Item PUMPKIN_PIE_DOUGH = new BaseFood(settings(), 4, 2);
    public static final Item SWEET_BERRY_PIE_DOUGH = new BaseFood(settings(), 4, 2);
    
    // pastries & pies
    public static final Item APPLE_PIE = new BaseFood(settings(), 4, 2);
    public static final Item CAKE_SLICE = new BaseFood(settings(), 4, 2);
    public static final Item CHORUS_FRUIT_PIE = new BaseFood(settings(), 4, 2);
    public static final Item GLOW_BERRY_PIE = new BaseFood(settings(), 4, 2);
    public static final Item HARDTACK = new BaseFood(settings(), 4, 2);
    public static final Item SWEET_BERRY_PIE = new BaseFood(settings(), 4, 2);
    
    // golden foods
    public static final Item GLISTERING_WATERMELON_JUICE = new BaseDrinkBottle(settings().maxCount(16).recipeRemainder(GLASS_BOTTLE), 4, 2);
    public static final Item GOLDEN_BEET = new BaseGoldenFood(settings(), 4, 2);
    public static final Item GOLDEN_CHORUS_FRUIT = new BaseGoldenFood(settings(), 4, 2);
    public static final Item GOLDEN_ENDURA_CARROT = new BaseGoldenFood(settings(), 4, 2);
    public static final Item GOLDEN_FIRE_PEPPER = new BaseGoldenFood(settings(), 4, 2);
    public static final Item GOLDEN_GLOW_BERRIES = new BaseGoldenFood(settings(), 4, 2);
    public static final Item GOLDEN_HEARTY_BEET = new BaseGoldenFood(settings(), 4, 2);
    public static final Item GOLDEN_ONION = new BaseGoldenFood(settings(), 4, 2);
    public static final Item GOLDEN_POTATO = new BaseGoldenFood(settings(), 4, 2);
    public static final Item GOLDEN_PUMPKIN_SLICE = new BaseGoldenFood(settings(), 4, 2);
    public static final Item GOLDEN_SWEET_BERRIES = new BaseGoldenFood(settings(), 4, 2);
    
    // tier 1
    public static final Item AMETHYSTLE_SALAD = new BaseTierOneNormal(settings(), 4, 2, StatusEffects.HASTE);
    public static final Item CARROT_SALAD = new BaseTierOneNormal(settings(), 4, 2, StatusEffects.SPEED);
    public static final Item DRIED_SPICY_GLOW_BERRIES = new BaseTierOneNormal(settings(), 4, 2, StatusEffects.NIGHT_VISION);
    public static final Item FRUIT_AND_VEGGIE_MIX = new BaseTierOneNormal(settings(), 4, 2, StatusEffects.HEALTH_BOOST);
    public static final Item HEARTY_SKEWER = new BaseTierOneNormal(settings(), 4, 2, StatusEffects.STRENGTH);
    public static final Item HONEYED_APPLE = new BaseTierOneNormal(settings(), 4, 2, StatusEffects.REGENERATION);
    public static final Item SAVORY_SHROOM_SKEWER = new BaseTierOneNormal(settings(), 4, 2, StatusEffects.RESISTANCE);
    public static final Item SHIVERCAP_SKEWER = new BaseTierOneNormal(settings(), 4, 2, StatusEffects.FIRE_RESISTANCE);
    public static final Item SPICY_CALAMARI_SKEWER = new BaseTierOneNormal(settings(), 4, 2, StatusEffects.WATER_BREATHING);
    
    // tier 2
    public static final Item GLOW_BERRY_EGG_PUDDING = new BaseTierTwoNormal(settings(), 4, 2, StatusEffects.NIGHT_VISION);
    public static final Item GLOW_SQUID_SUSHI = new BaseTierTwoNormal(settings(), 4, 2, StatusEffects.WATER_BREATHING);
    public static final Item HONEY_GLAZED_CREPE = new BaseTierTwoNormal(settings(), 4, 2, StatusEffects.REGENERATION);
    public static final Item SPICY_GRILLED_LAMB = new BaseTierTwoNormal(settings(), 4, 2, StatusEffects.HASTE);
    public static final Item SPICY_SALMON_AND_CARROTS = new BaseTierTwoNormal(settings(), 4, 2, StatusEffects.SPEED);
    public static final Item STEAMED_VEGETABLES = new BaseTierTwoNormal(settings(), 4, 2, StatusEffects.HEALTH_BOOST);
    public static final Item STUFFED_BAKED_POTATO = new BaseTierTwoNormal(settings(), 4, 2, StatusEffects.STRENGTH);
    public static final Item STUFFED_ONION = new BaseTierTwoNormal(settings(), 4, 2, StatusEffects.RESISTANCE);
    public static final Item SWEET_RABBIT_STEAK = new BaseTierTwoNormal(settings(), 4, 2, StatusEffects.FIRE_RESISTANCE);
    
    // tier 3
    public static final Item ANCIENT_FLOWER_SOUP = new BaseTierThreeBowl(settings().maxCount(1), 4, 2, StatusEffects.HEALTH_BOOST);
    public static final Item CARROT_STEW = new BaseTierThreeBowl(settings().maxCount(1), 4, 2, StatusEffects.SPEED);
    public static final Item COD_CHOWDER = new BaseTierThreeBowl(settings().maxCount(1), 4, 2, StatusEffects.RESISTANCE);
    public static final Item CREAMY_HEART_STEW = new BaseTierThreeBowl(settings().maxCount(1), 4, 2, StatusEffects.STRENGTH);
    public static final Item GLOW_BERRY_STEW = new BaseTierThreeBowl(settings().maxCount(1), 4, 2, StatusEffects.NIGHT_VISION);
    public static final Item GLOW_SQUID_SOUP = new BaseTierThreeBowl(settings().maxCount(1), 4, 2, StatusEffects.WATER_BREATHING);
    public static final Item SHIVERCAP_STIR_FRY = new BaseTierThreeBowl(settings().maxCount(1), 4, 2, StatusEffects.FIRE_RESISTANCE);
    public static final Item SPICY_BEEF_RISOTTO = new BaseTierThreeBowl(settings().maxCount(1), 4, 2, StatusEffects.HASTE);
    public static final Item SWEET_CHICKEN_RISOTTO = new BaseTierThreeBowl(settings().maxCount(1), 4, 2, StatusEffects.REGENERATION);
    
    // misc foods
    public static final Item COOKED_EGG = new BaseBowl(settings(), 4, 2);
    public static final Item FRUIT_MIX = new BaseBowl(settings(), 4, 2);
    public static final Item FUNGUS_STEW = new BaseBowl(settings(), 4, 2);
    public static final Item PUMPKIN_SOUP = new BaseBowl(settings(), 4, 2);
    public static final Item RAW_EGG = new BaseBowl(settings(), 4, 2);
    public static final Item SAVORY_BREAKFAST = new BaseBowl(settings(), 4, 2);
    public static final Item SLIME_SOUP = new BaseBowl(settings(), 4, 2);
    public static final Item SUSPICIOUS_STEW = new BaseBowl(settings(), 4, 2);
    public static final Item VEGETABLE_MIX = new BaseBowl(settings(), 4, 2);
    public static final Item COOKED_BACON = new BaseFood(settings(), 4, 2);
    public static final Item MUSHROOM_SKEWER = new BaseFood(settings(), 4, 2);
    public static final Item PUMPKIN_SLICE = new BaseFood(settings(), 4, 2);
    public static final Item RAW_BACON = new BaseFood(settings(), 4, 2);
    public static final Item SAUTEED_EYES_AND_MUSHROOMS = new BaseFood(settings(), 4, 2);
    
    // bottles
    public static final Item MILK = new MilkBottle(settings().maxCount(16).recipeRemainder(GLASS_BOTTLE));
    public static final Item APPLE_JUICE = new BaseDrinkBottle(settings().maxCount(16).recipeRemainder(GLASS_BOTTLE), 4, 2);
    public static final Item CHOCOLATE_MILK = new BaseDrinkBottle(settings().maxCount(16).recipeRemainder(GLASS_BOTTLE), 4, 2);
    public static final Item CHORUS_FRUIT_JUICE = new BaseDrinkBottle(settings().maxCount(16).recipeRemainder(GLASS_BOTTLE), 4, 2);
    public static final Item SWEET_BERRY_JUICE = new BaseDrinkBottle(settings().maxCount(16).recipeRemainder(GLASS_BOTTLE), 4, 2);
    public static final Item WARM_PUMPKIN_SOUP = new BaseDrinkBottle(settings().maxCount(16).recipeRemainder(GLASS_BOTTLE), 4, 2);

    public static void initialize() {
        
        // bottles
        Reg.register("milk", MILK);
        Reg.register("apple_juice", APPLE_JUICE);
        Reg.register("chocolate_milk", CHOCOLATE_MILK);
        Reg.register("chorus_fruit_juice", CHORUS_FRUIT_JUICE);
        Reg.register("sweet_berry_juice", SWEET_BERRY_JUICE);
        Reg.register("warm_pumpkin_soup", WARM_PUMPKIN_SOUP);
        
        // misc foods
        Reg.register("cooked_egg", COOKED_EGG);
        Reg.register("fruit_mix", FRUIT_MIX);
        Reg.register("fungus_stew", FUNGUS_STEW);
        Reg.register("pumpkin_soup", PUMPKIN_SOUP);
        Reg.register("raw_egg", RAW_EGG);
        Reg.register("savory_breakfast", SAVORY_BREAKFAST);
        Reg.register("slime_soup", SLIME_SOUP);
        Reg.register("suspicious_stew", SUSPICIOUS_STEW);
        Reg.register("vegetable_mix", VEGETABLE_MIX);
        Reg.register("cooked_bacon", COOKED_BACON);
        Reg.register("mushroom_skewer", MUSHROOM_SKEWER);
        Reg.register("pumpkin_slice", PUMPKIN_SLICE);
        Reg.register("raw_bacon", RAW_BACON);
        Reg.register("sauteed_eyes_and_mushrooms", SAUTEED_EYES_AND_MUSHROOMS);
        
        // bakes
        Reg.register("baked_apple", BAKED_APPLE);
        Reg.register("baked_beet", BAKED_BEET);
        Reg.register("baked_carrot", BAKED_CARROT);
        Reg.register("baked_endura_carrot", BAKED_ENDURA_CARROT);
        Reg.register("baked_fire_pepper", BAKED_FIRE_PEPPER);
        Reg.register("baked_glow_berries", BAKED_GLOW_BERRIES);
        Reg.register("baked_hearty_beet", BAKED_HEARTY_BEET);
        Reg.register("baked_melon_slice", BAKED_MELON_SLICE);
        Reg.register("baked_onion", BAKED_ONION);
        Reg.register("baked_pumpkin_slice", BAKED_PUMPKIN_SLICE);
        Reg.register("baked_seeds", BAKED_SEEDS);
        Reg.register("baked_sweet_berries", BAKED_SWEET_BERRIES);
        Reg.register("steamed_rice", STEAMED_RICE);
        
        // doughs
        Reg.register("apple_pie_dough", APPLE_PIE_DOUGH);
        Reg.register("bread_dough", BREAD_DOUGH);
        Reg.register("cake_dough", CAKE_DOUGH);
        Reg.register("chorus_fruit_pie_dough", CHORUS_FRUIT_PIE_DOUGH);
        Reg.register("glow_berry_pie_dough", GLOW_BERRY_PIE_DOUGH);
        Reg.register("hardtack_dough", HARDTACK_DOUGH);
        Reg.register("pumpkin_pie_dough", PUMPKIN_PIE_DOUGH);
        Reg.register("sweet_berry_pie_dough", SWEET_BERRY_PIE_DOUGH);
        
        // pastries & pies
        Reg.register("apple_pie", APPLE_PIE);
        Reg.register("cake_slice", CAKE_SLICE);
        Reg.register("chorus_fruit_pie", CHORUS_FRUIT_PIE);
        Reg.register("glow_berry_pie", GLOW_BERRY_PIE);
        Reg.register("hardtack", HARDTACK);
        Reg.register("sweet_berry_pie", SWEET_BERRY_PIE);
        
        // golden foods
        Reg.register("glistering_watermelon_juice", GLISTERING_WATERMELON_JUICE);
        Reg.register("golden_beet", GOLDEN_BEET);
        Reg.register("golden_chorus_fruit", GOLDEN_CHORUS_FRUIT);
        Reg.register("golden_endura_carrot", GOLDEN_ENDURA_CARROT);
        Reg.register("golden_fire_pepper", GOLDEN_FIRE_PEPPER);
        Reg.register("golden_glow_berries", GOLDEN_GLOW_BERRIES);
        Reg.register("golden_hearty_beet", GOLDEN_HEARTY_BEET);
        Reg.register("golden_onion", GOLDEN_ONION);
        Reg.register("golden_potato", GOLDEN_POTATO);
        Reg.register("golden_pumpkin_slice", GOLDEN_PUMPKIN_SLICE);
        Reg.register("golden_sweet_berries", GOLDEN_SWEET_BERRIES);
        
        // tier 1
        Reg.register("amethystle_salad", AMETHYSTLE_SALAD);
        Reg.register("carrot_salad", CARROT_SALAD);
        Reg.register("dried_spicy_glow_berries", DRIED_SPICY_GLOW_BERRIES);
        Reg.register("fruit_and_veggie_mix", FRUIT_AND_VEGGIE_MIX);
        Reg.register("hearty_skewer", HEARTY_SKEWER);
        Reg.register("honeyed_apple", HONEYED_APPLE);
        Reg.register("savory_shroom_skewer", SAVORY_SHROOM_SKEWER);
        Reg.register("shivercap_skewer", SHIVERCAP_SKEWER);
        Reg.register("spicy_calamari_skewer", SPICY_CALAMARI_SKEWER);
        
        // tier 2
        Reg.register("glow_berry_egg_pudding", GLOW_BERRY_EGG_PUDDING);
        Reg.register("glow_squid_sushi", GLOW_SQUID_SUSHI);
        Reg.register("honey_glazed_crepe", HONEY_GLAZED_CREPE);
        Reg.register("spicy_grilled_lamb", SPICY_GRILLED_LAMB);
        Reg.register("spicy_salmon_and_carrots", SPICY_SALMON_AND_CARROTS);
        Reg.register("steamed_vegetables", STEAMED_VEGETABLES);
        Reg.register("stuffed_baked_potato", STUFFED_BAKED_POTATO);
        Reg.register("stuffed_onion", STUFFED_ONION);
        Reg.register("sweet_rabbit_steak", SWEET_RABBIT_STEAK);
        
        // tier 3
        Reg.register("ancient_flower_soup", ANCIENT_FLOWER_SOUP);
        Reg.register("carrot_stew", CARROT_STEW);
        Reg.register("cod_chowder", COD_CHOWDER);
        Reg.register("creamy_heart_stew", CREAMY_HEART_STEW);
        Reg.register("glow_berry_stew", GLOW_BERRY_STEW);
        Reg.register("glow_squid_soup", GLOW_SQUID_SOUP);
        Reg.register("shivercap_stir_fry", SHIVERCAP_STIR_FRY);
        Reg.register("spicy_beef_risotto", SPICY_BEEF_RISOTTO);
        Reg.register("sweet_chicken_risotto", SWEET_CHICKEN_RISOTTO);
    }
    
    private static Item.Settings settings() {
        return new Item.Settings().group(NG_Groups.TEST_GROUP);
    }
}

package net.linkle.newgrowth.z_INIT;

import static net.minecraft.item.Items.GLASS_BOTTLE;

import net.linkle.newgrowth.items.drinks.BaseMilkBottle;
import net.linkle.newgrowth.items.foods.BaseGoldenFood;
import net.linkle.newgrowth.utils.Reg;
import net.minecraft.item.Item;

public class NG_Dishes {
    public static final Item MILK_BOTTLE = new BaseMilkBottle(new Item.Settings().group(NG_Groups.TEST_GROUP).maxCount(16).recipeRemainder(GLASS_BOTTLE));
    
    // golden foods
    public static final Item GOLDEN_BEET = new BaseGoldenFood(new Item.Settings().group(NG_Groups.TEST_GROUP), 4, 2);
    public static final Item GOLDEN_CHORUS_FRUIT = new BaseGoldenFood(new Item.Settings().group(NG_Groups.TEST_GROUP), 4, 2);
    public static final Item GOLDEN_ENDURA_CARROT = new BaseGoldenFood(new Item.Settings().group(NG_Groups.TEST_GROUP), 4, 2);
    public static final Item GOLDEN_FIRE_PEPPER = new BaseGoldenFood(new Item.Settings().group(NG_Groups.TEST_GROUP), 4, 2);
    public static final Item GOLDEN_GLOW_BERRIES = new BaseGoldenFood(new Item.Settings().group(NG_Groups.TEST_GROUP), 4, 2);
    public static final Item GOLDEN_HEARTY_BEET = new BaseGoldenFood(new Item.Settings().group(NG_Groups.TEST_GROUP), 4, 2);
    public static final Item GOLDEN_ONION = new BaseGoldenFood(new Item.Settings().group(NG_Groups.TEST_GROUP), 4, 2);
    public static final Item GOLDEN_POTATO = new BaseGoldenFood(new Item.Settings().group(NG_Groups.TEST_GROUP), 4, 2);
    public static final Item GOLDEN_PUMPKIN_SLICE = new BaseGoldenFood(new Item.Settings().group(NG_Groups.TEST_GROUP), 4, 2);
    public static final Item GOLDEN_SWEET_BERRIES = new BaseGoldenFood(new Item.Settings().group(NG_Groups.TEST_GROUP), 4, 2);

    public static void initialize() {
        Reg.register("milk_bottle", MILK_BOTTLE);
        // bottles
        // doughs
        // pastries & pies
        
        // golden foods
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
        // tier 2
        // tier 3
    }
}

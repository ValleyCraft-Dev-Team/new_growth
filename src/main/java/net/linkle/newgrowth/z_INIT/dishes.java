package net.linkle.newgrowth.z_INIT;

import static net.linkle.newgrowth.NewGrowth.MOD_ID;
import static net.minecraft.item.Items.GLASS_BOTTLE;

import net.linkle.newgrowth.items.drinks.BaseMilkBottle;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class dishes {
    public static final Item MILK_BOTTLE = new BaseMilkBottle(new Item.Settings().maxCount(16).recipeRemainder(GLASS_BOTTLE));

    public static void initialize() {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "milk_bottle"), MILK_BOTTLE);
        //bottles
        //doughs
        //pastries & pies
        //gold food
        //tier 1
        //tier 2
        //tier 3}
    }
}
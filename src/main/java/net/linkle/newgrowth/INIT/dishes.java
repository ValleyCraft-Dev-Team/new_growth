package net.linkle.newgrowth.INIT;

import net.linkle.newgrowth.items.drinks.milk.BaseMilkBottle;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.linkle.newgrowth.NewGrowth.MOD_ID;
import static net.minecraft.item.Items.GLASS_BOTTLE;

public class dishes {
    public static final Item MILK_BOTTLE = new BaseMilkBottle(new Item.Settings().maxCount(16).recipeRemainder(GLASS_BOTTLE));

    public static void initialize() {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "milk_bottle"), MILK_BOTTLE);
    }
}

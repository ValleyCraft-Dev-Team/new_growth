package net.linkle.newgrowth.items.foods.tier2dishes;

import net.linkle.newgrowth.items.foods.BaseFood;
import net.linkle.newgrowth.utils.FoodStatusEffect;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;

public class BaseTierTwoNormal extends BaseFood {
    public BaseTierTwoNormal(Settings settings, int hunger, float satMod, StatusEffect effect) {
        super(settings, hunger, satMod, new FoodStatusEffect(new StatusEffectInstance(effect, 60 * 20)));
    }
}
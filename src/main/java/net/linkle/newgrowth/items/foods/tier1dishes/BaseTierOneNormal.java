package net.linkle.newgrowth.items.foods.tier1dishes;

import net.linkle.newgrowth.items.foods.BaseFood;
import net.linkle.newgrowth.utils.FoodStatusEffect;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;

public class BaseTierOneNormal extends BaseFood {
    public BaseTierOneNormal(Settings settings, int hunger, float satMod, StatusEffect effect) {
        super(settings, hunger, satMod, new FoodStatusEffect(new StatusEffectInstance(effect, 30 * 20)));
    }
}
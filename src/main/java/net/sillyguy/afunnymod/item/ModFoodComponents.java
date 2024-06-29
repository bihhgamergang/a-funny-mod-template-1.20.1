package net.sillyguy.afunnymod.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent GOLDEN_STEAK = new FoodComponent.Builder().hunger(20).saturationModifier(2.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 9600, 1), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 9600, 1), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 9600, 1), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 9600, 4), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 9600, 3), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 9600, 0), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 9600, 0), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 9600, 0), 1.0f)
            .alwaysEdible()
            .build();
}

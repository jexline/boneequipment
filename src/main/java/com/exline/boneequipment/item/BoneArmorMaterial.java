package com.exline.boneequipment.item;

import com.exline.boneequipment.BoneEquipmentMain;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class BoneArmorMaterial implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[] {13,15, 16, 11};
    private static final int[] PROTECTION_VALUES = new int[] {1, 3, 4, 2};
    public static final int MAX_DAMAGE_FACTOR = 12;

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * MAX_DAMAGE_FACTOR;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 15;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_GENERIC;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.BONE);
    }

    @Override
    public String getName() {
        // Must be all lowercase
        //name of the material, name of armor image would be example_layer_1.png and example_layer_2.png
        return "bone";
    }

    @Override
    public float getToughness() {
        return 0.2F;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.0F;
    }

    // For LevelZ compat
    @Override
    public String toString() {
        return BoneEquipmentMain.MOD_ID + ":" + "BONE";
    }
}

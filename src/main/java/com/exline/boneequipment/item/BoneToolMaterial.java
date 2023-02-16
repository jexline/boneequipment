package com.exline.boneequipment.item;

import com.exline.boneequipment.BoneEquipmentMain;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class BoneToolMaterial implements ToolMaterial {
    public static final BoneToolMaterial INSTANCE = new BoneToolMaterial();

    @Override
    public int getDurability(){
        return 150;
    }

    @Override
    public float getMiningSpeedMultiplier(){
        return 5.5f;
    }

    @Override
    public float getAttackDamage(){
        return 4.6f;
    }

    @Override
    public int getMiningLevel(){
        return 1;
    }

    @Override
    public int getEnchantability(){
        return 18;
    }

    @Override
    public Ingredient getRepairIngredient(){
        return Ingredient.ofItems(Items.BONE);
    }

    // For LevelZ compat
    @Override
    public String toString() {
        return BoneEquipmentMain.MOD_ID + ":" + "BONE";
    }
}

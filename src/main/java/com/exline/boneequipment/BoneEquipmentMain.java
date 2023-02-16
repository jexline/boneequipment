package com.exline.boneequipment;

import com.exline.boneequipment.init.ItemInit;
import net.fabricmc.api.ModInitializer;

public class BoneEquipmentMain implements ModInitializer {
    public static final String MOD_ID = "boneequipment";

    @Override
    public void onInitialize() {
        ItemInit.registerItems();}
}
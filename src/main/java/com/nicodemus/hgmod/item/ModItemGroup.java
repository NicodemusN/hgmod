package com.nicodemus.hgmod.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {
    public static final ItemGroup HG_BLOCKS = new ItemGroup("hgblocks") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.EXCALIBUR.get());
        }
    };
}
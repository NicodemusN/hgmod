package com.nicodemus.hgmod.init;

import com.nicodemus.hgmod.HgMod;
import com.nicodemus.hgmod.ModItemGroup;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HgMod.MOD_ID);

    public static final RegistryObject<Item> EXCALIBUR = ITEMS.register("excalibur",
            () -> new Item(new Item.Properties().group(ModItemGroup.HG_BLOCKS)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

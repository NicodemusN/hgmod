package com.nicodemus.hgmod.block;

import com.nicodemus.hgmod.init.ModBlocks;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

public class Andesitecobbled extends Block{

    public Andesitecobbled(Properties properties) {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.STONE)
                .hardnessAndResistance(5.0f, 6.0f)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
                .setRequiresTool());
    }

}
package com.jsmith.miscadd;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

/**
 * Created by JohnSmith0508 on 26/6/14.
 */
public class Extra {
    public static final String MODID = "Misc_Additions";
    public static final String VERSION = "1.0";

    public static void registerBlock(Block block){
        GameRegistry.registerBlock(block, MODID + "_" + block.getUnlocalizedName().substring(5));
    }
    public static void registerItem(Item item){
        GameRegistry.registerItem(item , MODID + "_" + item.getUnlocalizedName().substring(5));
    }

    public static void Recipies(){

    }
}

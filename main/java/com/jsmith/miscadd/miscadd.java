package com.jsmith.miscadd;

import com.jsmith.miscadd.proxy.IProxy;
import com.jsmith.miscadd.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by JohnSmith0508 on 26/6/14 at 2:55 PM.
 */
@Mod(modid = Reference.MOD_ID, version = Extra.VERSION)
public class miscadd {

    @Mod.Instance("Misc_Additions")
    public static miscadd instance;

    @SidedProxy(clientSide = "com.jsmith.miscadd.proxy.ClientProxy", serverSide = "com.jsmith.miscadd.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

        System.out.println("[LIVE-MOD] 'LETTUCE IS A FRUIT' - johnsmith0508, June 18 2014");
    }

   @Mod.EventHandler
    public void init(FMLInitializationEvent event){

   }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }

}

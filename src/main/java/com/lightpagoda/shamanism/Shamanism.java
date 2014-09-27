package com.lightpagoda.shamanism;

import com.lightpagoda.shamanism.proxy.IProxy;
import com.lightpagoda.shamanism.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Lightpagoda on 9/27/2014.
 */

@Mod(modid= Reference.MOD_ID, name=Reference.MOD_NAME, version =Reference.VERSION)
public class Shamanism
{

    @Mod.Instance(Reference.MOD_ID)
    public static Shamanism instance;

    @SidedProxy(clientSide = "com.lightpagoda.shamanism.proxy.ClientProxy", serverSide = "com.lightpagoda.shamanism.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void init (FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void init (FMLPostInitializationEvent event)
    {

    }

}

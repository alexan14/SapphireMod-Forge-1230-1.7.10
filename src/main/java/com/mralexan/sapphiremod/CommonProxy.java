package com.mralexan.sapphiremod;

import com.mralexan.sapphiremod.initializers.SapphireInitializers;
import com.mralexan.sapphiremod.registers.GameRegister;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy
{
    public void preInit(FMLPreInitializationEvent event)
    {
        RenderingRegistry.addNewArmourRendererPrefix("5");
    	
    	/////////////////////////////////////
    	// Block and items initializations //
    	/////////////////////////////////////
    	SapphireInitializers.initialize();    	
    }

    public void init(FMLInitializationEvent event)
    {
		///////////////////
		// Game registry //
		///////////////////
		GameRegister.register();
    }

    public void postInit(FMLPostInitializationEvent event)
    {

    }
}

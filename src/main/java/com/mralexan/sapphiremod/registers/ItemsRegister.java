package com.mralexan.sapphiremod.registers;

import com.mralexan.sapphiremod.Sapphire;
import com.mralexan.sapphiremod.initializers.SapphireItems;

import cpw.mods.fml.common.registry.GameRegistry;

public class ItemsRegister
{
	public static void registerItems()
	{
    	GameRegistry.registerItem(SapphireItems.sapphireItem, "sapphireItem");
    	
    	// Sapphire Tools
    	GameRegistry.registerItem(SapphireItems.sapphireSword, "sapphireSword");
    	GameRegistry.registerItem(SapphireItems.sapphireAxe, "sapphireAxe");
    	GameRegistry.registerItem(SapphireItems.sapphirePickaxe, "sapphirePickaxe");
    	GameRegistry.registerItem(SapphireItems.sapphireShovel, "sapphireShovel");
    	GameRegistry.registerItem(SapphireItems.sapphireHoe, "sapphireHoe");
    	// Sapphire armor
    	GameRegistry.registerItem(SapphireItems.helmetSapphire, "helmetSapphire");
    	GameRegistry.registerItem(SapphireItems.chestplateSapphire, "chestplateSapphire");
    	GameRegistry.registerItem(SapphireItems.legsSapphire, "legsSapphire");
    	GameRegistry.registerItem(SapphireItems.bootsSapphire, "bootsSapphire");
	}
}

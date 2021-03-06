package com.mralexan.sapphiremod.initializers;

import com.mralexan.sapphiremod.Sapphire;
import com.mralexan.sapphiremod.blocks.SapphireBlock;
import com.mralexan.sapphiremod.blocks.SapphireOre;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class SapphireBlocks
{
	//Blocks
    public static Block sapphireBlock;
    public static Block sapphireOre;
    
	public static void initializeBlocks()
	{
		sapphireBlock = new SapphireBlock(Material.rock, "sapphireBlock", 1.5F);
		sapphireOre = new SapphireOre(Material.rock, "sapphireOre", 1.5F);
	}
	
	public static void registerBlocks()
	{
		initializeBlocks();
		
    	GameRegistry.registerBlock(SapphireBlocks.sapphireBlock, "sapphireBlock");
    	GameRegistry.registerBlock(SapphireBlocks.sapphireOre, "sapphireOre");
	}
}

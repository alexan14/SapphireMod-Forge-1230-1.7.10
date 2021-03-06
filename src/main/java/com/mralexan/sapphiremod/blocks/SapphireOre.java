package com.mralexan.sapphiremod.blocks;

import java.util.Random;

import com.mralexan.sapphiremod.Sapphire;
import com.mralexan.sapphiremod.initializers.SapphireItems;

import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;

public class SapphireOre extends Block
{
	public String name;
	public float hardness;
	
	public SapphireOre(Material material, String p_name, float p_hardness)
	{
		super(material);
		
		name = p_name;
		hardness = p_hardness;
		
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setBlockName(name);
		this.setHardness(hardness);
	}
	
	@Override
	public void registerBlockIcons(IIconRegister register)
	{
		this.blockIcon = register.registerIcon(Sapphire.MODA+":"+name);
	}
	
	public Item getItemDropped(int par1, Random rand, int par2)
	{
		return SapphireItems.sapphireItem;
	}
	
	public int quantityDropped(Random rand)
	{
		return 1;
	}

}

package com.mralexan.sapphiremod.blocks;

import com.mralexan.sapphiremod.Sapphire;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class SapphireBlock extends Block
{

	public String name;
	public float hardness;
	
	public SapphireBlock(Material material, String p_name, float p_hardness)
	{
		super(material);
		
		name = p_name;
		hardness = p_hardness;
		// TODO Auto-generated constructor stub
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setBlockName(name);
		this.setHardness(hardness);
	}

	@Override
	public void registerBlockIcons(IIconRegister register)
	{
		this.blockIcon = register.registerIcon(Sapphire.MODA+":"+name);
	}
	
}

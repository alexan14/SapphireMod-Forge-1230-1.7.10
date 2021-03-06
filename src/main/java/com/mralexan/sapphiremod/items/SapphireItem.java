package com.mralexan.sapphiremod.items;

import com.mralexan.sapphiremod.Sapphire;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SapphireItem extends Item
{
	public String name;
	
	public SapphireItem(String p_name)
	{
		super();
		
		name = p_name;
		
		this.setUnlocalizedName(name);
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setMaxStackSize(64);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister register)
	{
		this.itemIcon = register.registerIcon(Sapphire.MODA+":"+name);
	}
}

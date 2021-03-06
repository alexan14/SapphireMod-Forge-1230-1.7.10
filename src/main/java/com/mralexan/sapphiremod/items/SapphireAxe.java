package com.mralexan.sapphiremod.items;

import com.mralexan.sapphiremod.Sapphire;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemAxe;

public class SapphireAxe extends ItemAxe
{
	public String name;
	
	public SapphireAxe( String p_name, ToolMaterial material)
	{
		super(material);
		name = p_name;
		this.setUnlocalizedName(name);
		// TODO Auto-generated constructor stub
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister register)
	{
		this.itemIcon = register.registerIcon(Sapphire.MODA+":"+name);
	}
}

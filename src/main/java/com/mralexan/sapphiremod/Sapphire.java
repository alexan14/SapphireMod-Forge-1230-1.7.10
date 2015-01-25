package com.mralexan.sapphiremod;

import com.mralexan.sapphiremod.blocks.SapphireBlock;
import com.mralexan.sapphiremod.blocks.SapphireOre;
import com.mralexan.sapphiremod.initializers.SapphireBlocks;
import com.mralexan.sapphiremod.initializers.SapphireInitializers;
import com.mralexan.sapphiremod.initializers.SapphireItems;
import com.mralexan.sapphiremod.items.SapphireArmor;
import com.mralexan.sapphiremod.items.SapphireAxe;
import com.mralexan.sapphiremod.items.SapphireHoe;
import com.mralexan.sapphiremod.items.SapphireItem;
import com.mralexan.sapphiremod.items.SapphirePickaxe;
import com.mralexan.sapphiremod.items.SapphireShovel;
import com.mralexan.sapphiremod.items.SapphireSword;
import com.mralexan.sapphiremod.registers.BlocksRegister;
import com.mralexan.sapphiremod.registers.GameRegister;
import com.mralexan.sapphiremod.registers.ItemsRegister;
import com.mralexan.sapphiremod.registers.RecipesRegister;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Sapphire.MODID, name=Sapphire.NAME, version = Sapphire.VERSION)
public class Sapphire
{
    public static final String MODID = "sapphiremod";
    public static final String NAME = "SapphireMod";
    public static final String MODA = "mralexan";
    public static final String VERSION = "1.0";
    
    @SidedProxy(clientSide="com.mralexan.sapphiremod.ClientProxy", serverSide="com.mralexan.sapphiremod.ServerProxy")
    public static CommonProxy proxy;
    
    //Sapphire materials :
    public static ToolMaterial SAPPHIRE = EnumHelper.addToolMaterial("SAPPHIRE", 4, 2000, 200.0F, 2.5F, 100);
    public static ArmorMaterial ARMORSAPPHIRE = EnumHelper.addArmorMaterial("ARMORSAPPHIRE", 20, new int[]{20,20,20,20}, 100);
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	this.proxy.preInit(event);
    }
}
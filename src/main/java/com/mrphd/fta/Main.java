package com.mrphd.fta;

import com.mrphd.fta.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=Main.MOD_ID, name=Main.MOD_NAME, version=Main.MOD_VERSION)
public class Main {

	public static final String MOD_ID      			= "ftalchemist";
	public static final String MOD_NAME 			= "FullThrottle Alchemist";
	public static final String MOD_VERSION 			= "1.0.0";
	public static final String CLIENT_PROXY_CLASS 	= "com.mrphd.fta.proxy.ClientProxy";
	public static final String COMMON_PROXY_CLASS 	= "com.mrphd.fta.proxy.CommonProxy";
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide=CLIENT_PROXY_CLASS, serverSide=COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void onPreInit(final FMLPreInitializationEvent event) {
		
	}
	
	@EventHandler
	public void onInit(final FMLInitializationEvent event) {
		
	}
	
	@EventHandler
	public void onPostInit(final FMLPostInitializationEvent event) {
		
	}
	
}

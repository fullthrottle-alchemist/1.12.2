package com.mrphd.fta.objects.block;

import java.util.ArrayList;
import java.util.List;

import com.mrphd.fta.CreativeTabsFTA;
import com.mrphd.fta.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class BlocksFTA {

	private static final List<Block> BLOCKS = new ArrayList<Block>();
	private static final List<Item> BLOCK_ITEMS = new ArrayList<Item>();
	
	public static final Block ALCHEMICAL_FURNACE;
	public static final Block ATELIER;
	public static final Block STORAGE_UNIT;
	
	static {
		ALCHEMICAL_FURNACE = registerBlock(new BlockBase("alchemical_furnace", Material.ROCK));
		ATELIER = registerBlock(new BlockBase("atelier", Material.WOOD));
		STORAGE_UNIT = registerBlock(new BlockBase("storage_unit", Material.ROCK));
	}
	
	private static Block registerBlock(final Block block) {
		BLOCKS.add(block);
		BLOCK_ITEMS.add(new ItemBlock(block).setRegistryName(block.getRegistryName()));
		block.setCreativeTab(CreativeTabsFTA.DEFAULT);
		return block;
	}
	
	@SubscribeEvent
	public static void registerBlocks(final Register<Block> event) {
		BLOCKS.forEach(event.getRegistry()::register);
	}
	
	@SubscribeEvent
	public static void registerBlockItems(final Register<Item> event) {
		BLOCK_ITEMS.forEach(event.getRegistry()::register);
	}
	
	@SubscribeEvent
	public static void registerBlockModels(final ModelRegistryEvent event) {
		BLOCKS.forEach(block -> {
			if(block instanceof IHasModel) {
				((IHasModel) block).registerModel();
			}
		});
		BLOCK_ITEMS.forEach(item -> {
			if(item instanceof IHasModel) {
				((IHasModel) item).registerModel();
			}
		});
	}
	
}

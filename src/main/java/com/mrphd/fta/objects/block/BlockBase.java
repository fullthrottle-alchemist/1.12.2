package com.mrphd.fta.objects.block;

import com.mrphd.fta.Main;
import com.mrphd.fta.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockBase extends Block implements IHasModel {

	public BlockBase(final String name, final Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	
	@Override
	public void registerModel() {
		Main.proxy.registerModel(Item.getItemFromBlock(this), 0, "inventory");
	}
	
}

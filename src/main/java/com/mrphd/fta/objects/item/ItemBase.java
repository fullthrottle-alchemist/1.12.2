package com.mrphd.fta.objects.item;

import com.mrphd.fta.Main;
import com.mrphd.fta.util.IHasModel;

import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(final String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	
	@Override
	public void registerModel() {
		Main.proxy.registerModel(this, 0, "inventory");
	}
	
}

package com.mrphd.fta;

import com.mrphd.fta.objects.item.ItemsFTA;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTabsFTA {
	
	public static final CreativeTabs DEFAULT;
	
	static {
		DEFAULT = new CreativeTabFTA();
	}

	private static final class CreativeTabFTA extends CreativeTabs {
		
		public CreativeTabFTA() {
			super("ftalchemist");
		}
		
		@Override
		public ItemStack getTabIconItem() {
			return ItemsFTA.SUPER_LEAF.getDefaultInstance();
		}
		
	}
	
}

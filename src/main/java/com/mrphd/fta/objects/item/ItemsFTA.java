package com.mrphd.fta.objects.item;

import java.util.ArrayList;
import java.util.List;

import com.mrphd.fta.CreativeTabsFTA;
import com.mrphd.fta.util.IHasModel;

import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class ItemsFTA {

	private static final List<Item> ITEMS = new ArrayList<Item>();

	public static final Item ALCHEMICAL_FLASK; // TODO: Capture living entity
	public static final Item ALCHEMICOAL; // TODO: Another type of coal?
	public static final Item ALCHEMIST_SACHEL; // TODO: Mobile storage
	public static final Item ALCHEMIST_WRENCH; // TODO: A powerful wrench
	public static final Item BACON_STRIP; // TODO: Raw bacon strip (Can be eaten)
	public static final Item BOMB; // TODO: Blow stuff! Probably shouldn't
	public static final Item CLIPBOARD; // TODO: Mobile crafting grid
	public static final Item COOKED_BACON_STRIP; // TODO: More food source!
	public static final Item FRIED_EGG; // TODO: Extra food source!
	public static final Item MAGNET_GLOVE; // TODO: Super glove?
	public static final Item RESEARCH_VELLUM; // TODO: Construct and deconstruct things with this! Awesome!
	public static final Item SUPER_CLAW; // TODO: A claw I guess?
	public static final Item SUPER_LEAF; // TODO: Give multi-jump ability when consumed
	public static final Item TOOL_VELLUM; // TODO: Another type of vellum (Enchantable) [1/10 of enchant level, eg. 3 level for 30 level ench.]
	public static final Item WATERING_CAN; // TODO: Water once every 5 or so seconds [Capacity: 100]
	
	static {
		ALCHEMICAL_FLASK = registerItem(new ItemBase("alchemical_flask"));
		ALCHEMICOAL = registerItem(new ItemBase("alchemicoal"));
		ALCHEMIST_SACHEL = registerItem(new ItemBase("alchemist_sachel"));
		ALCHEMIST_WRENCH = registerItem(new ItemBase("alchemist_wrench"));
		BACON_STRIP = registerItem(new ItemBase("bacon_strip"));
		BOMB = registerItem(new ItemBase("bomb"));
		CLIPBOARD = registerItem(new ItemBase("clipboard"));
		COOKED_BACON_STRIP = registerItem(new ItemBase("cooked_bacon_strip"));
		FRIED_EGG = registerItem(new ItemBase("fried_egg"));
		MAGNET_GLOVE = registerItem(new ItemBase("magnet_glove"));
		RESEARCH_VELLUM = registerItem(new ItemBase("research_vellum"));
		SUPER_CLAW = registerItem(new ItemBase("super_claw"));
		SUPER_LEAF = registerItem(new ItemBase("super_leaf"));
		TOOL_VELLUM = registerItem(new ItemBase("tool_vellum"));
		WATERING_CAN = registerItem(new ItemBase("watering_can"));
	}
	
	private static Item registerItem(final Item item) {
		ITEMS.add(item);
		item.setCreativeTab(CreativeTabsFTA.DEFAULT);
		return item;
	}
	
	@SubscribeEvent
	public static void registerItems(final Register<Item> event) {
		ITEMS.forEach(event.getRegistry()::register);
	}
	
	@SubscribeEvent
	public static void registerItemModels(final ModelRegistryEvent event) {
		ITEMS.forEach(item -> {
			if(item instanceof IHasModel) {
				((IHasModel) item).registerModel();
			}
		});
	}
	
}

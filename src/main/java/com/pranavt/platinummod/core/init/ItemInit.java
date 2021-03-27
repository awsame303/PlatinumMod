package com.pranavt.platinummod.core.init;

import com.pranavt.platinummod.PlatinumMod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			PlatinumMod.MOD_ID);

	public static final RegistryObject<Item> TITANIUM = ITEMS.register("platinum",
			() -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
}

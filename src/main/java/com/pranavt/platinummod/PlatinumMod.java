package com.pranavt.platinummod;


import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.pranavt.platinummod.core.init.ItemInit;

@Mod(PlatinumMod.MOD_ID)
public class PlatinumMod {
	
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "pranavtplatinummod";

	public PlatinumMod() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		bus.addListener(this::setup);
		ItemInit.ITEMS.register(bus);
		MinecraftForge.EVENT_BUS.register(this);
	}

	private void setup(final FMLCommonSetupEvent event) {
	}
}

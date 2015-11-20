package com.choonster.forgebiomemanagertestmod;

import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ForgeBiomeManagerTestMod.MODID, version = ForgeBiomeManagerTestMod.VERSION)
public class ForgeBiomeManagerTestMod {
	public static final String MODID = "forgebiomemanagertestmod";
	public static final String VERSION = "1.0";

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){
		// Force BiomeManager to load the biomes array
		BiomeManager.getBiomes(BiomeManager.BiomeType.COOL);

		// Add a BiomeType
		BiomeManager.BiomeType fake = BiomeManager.BiomeType.getType("FAKE");

		// Try to get the biomes for the new BiomeType
		BiomeManager.getBiomes(fake);
	}
}

package com.hypenauticpulse.reinforceditems;

import com.hypenauticpulse.reinforceditems.blocks.ModBlocks;
import com.hypenauticpulse.reinforceditems.blocks.ReinforcedObsidian;
import com.hypenauticpulse.reinforceditems.item.*;
import com.hypenauticpulse.reinforceditems.item.bp.ModAxe;
import com.hypenauticpulse.reinforceditems.item.bp.ModPickaxe;
import com.hypenauticpulse.reinforceditems.item.bp.ModShovel;
import com.hypenauticpulse.reinforceditems.item.bp.ModSword;
import com.hypenauticpulse.reinforceditems.setup.ClientProxy;
import com.hypenauticpulse.reinforceditems.setup.IProxy;
import com.hypenauticpulse.reinforceditems.setup.ModSetup;
import com.hypenauticpulse.reinforceditems.setup.ServerProxy;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.system.CallbackI;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("reinforceditems")
public class ReinforcedItems {

    public static final String MODID = "reinforceditems";

    public static IProxy proxy = DistExecutor.runForDist(() -> () -> new ClientProxy(), () -> () -> new ServerProxy());

    public static ModSetup setup = new ModSetup();

    private static final Logger LOGGER = LogManager.getLogger();

    public ReinforcedItems() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
    }

    private void setup(final FMLCommonSetupEvent event) {
        setup.init();
        proxy.init();
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            event.getRegistry().register(new ReinforcedObsidian());
        }

        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            Item.Properties properties = new Item.Properties()
                    .group(setup.itemGroup);
            event.getRegistry().register(new BlockItem(ModBlocks.REINFORCEDOBSIDIAN, properties).setRegistryName("reinforcedobsidian"));
            event.getRegistry().register(new ObsidianChunk());
            event.getRegistry().register(new ReinforcedObsidianStick());
            event.getRegistry().register(new DiamondStick());
            event.getRegistry().register(new ObsidianPowder());
            event.getRegistry().register(new DiamondPowder());
            event.getRegistry().register(new ModPickaxe(ModItemTier.OBSIDIAN, 1, -2.8F, new Item.Properties().group(ReinforcedItems.setup.itemGroup)).setRegistryName("obsidianpickaxe"));
            event.getRegistry().register(new ModAxe(ModItemTier.OBSIDIAN, 5F, -3.0F, new Item.Properties().group(ReinforcedItems.setup.itemGroup)).setRegistryName("obsidianaxe"));
            event.getRegistry().register(new ModShovel(ModItemTier.OBSIDIAN, 0.5F, -2.8F, new Item.Properties().group(ReinforcedItems.setup.itemGroup)).setRegistryName("obsidianshovel"));
            event.getRegistry().register(new ModSword(ModItemTier.OBSIDIAN, 3, -2.4F, new Item.Properties().group(ReinforcedItems.setup.itemGroup)).setRegistryName("obsidiansword"));
        }
    }
}

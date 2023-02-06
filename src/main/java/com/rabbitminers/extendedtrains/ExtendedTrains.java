package com.rabbitminers.extendedtrains;

import com.mojang.logging.LogUtils;
import com.rabbitminers.extendedtrains.index.ExtendedTrainsBlocks;
import com.rabbitminers.extendedtrains.index.ExtendedTrainsItems;
import com.rabbitminers.extendedtrains.index.ExtendedTrainsTileEntities;
import com.simibubi.create.AllBlocks;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.nullness.NonNullSupplier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import org.valkyrienskies.mod.common.ValkyrienSkiesMod;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ExtendedTrains.MODID)
public class ExtendedTrains {
    public static final String MODID = "extendedtrains";
    private static final NonNullSupplier<CreateRegistrate> registrate = CreateRegistrate.lazy(ExtendedTrains.MODID);
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public static final CreativeModeTab itemGroup = new CreativeModeTab(MODID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(AllBlocks.FLYWHEEL.get());
        }
    };

    public ExtendedTrains()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        /*
         For adding simple kinetic blocks this is all you need but for fluids etc.
         see the Create GitHub repo -
         https://github.com/Creators-of-Create/Create/tree/mc1.18/dev/src/main/java/com/simibubi/create
         */

        ExtendedTrainsBlocks.register();
        ExtendedTrainsItems.register(eventBus);
        ExtendedTrainsTileEntities.register();

    }

    private void setup(final FMLCommonSetupEvent event) {}

    public static CreateRegistrate registrate() {
        return registrate.get();
    }
}

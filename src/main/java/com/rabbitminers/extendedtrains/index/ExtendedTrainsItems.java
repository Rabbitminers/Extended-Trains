package com.rabbitminers.extendedtrains.index;

import com.rabbitminers.extendedtrains.ExtendedTrains;
import com.simibubi.create.foundation.data.CreateRegistrate;
import net.minecraftforge.eventbus.api.IEventBus;

public class ExtendedTrainsItems {
    private static final CreateRegistrate REGISTRATE = ExtendedTrains.registrate()
            .creativeModeTab(() -> ExtendedTrains.itemGroup);

    // See create git for how to register items
    // - https://github.com/Creators-of-Create/Create/blob/mc1.18/dev/src/main/java/com/simibubi/create/AllItems.java
    public static void register(IEventBus eventBus) {

    }
}

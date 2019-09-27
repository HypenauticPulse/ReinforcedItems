package com.hypenauticpulse.reinforceditems.item;

import com.hypenauticpulse.reinforceditems.ReinforcedItems;
import net.minecraft.item.Item;

public class DiamondStick extends Item {

    public DiamondStick() {
        super(new Item.Properties()
                .maxStackSize(64)
                .group(ReinforcedItems.setup.itemGroup));
        setRegistryName("diamondstick");
    }
}

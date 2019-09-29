package com.hypenauticpulse.reinforceditems.item;

import com.hypenauticpulse.reinforceditems.ReinforcedItems;
import net.minecraft.item.Item;

public class DiamondPowder extends Item {

    public DiamondPowder() {
        super(new Item.Properties()
                .maxStackSize(64)
                .group(ReinforcedItems.setup.itemGroup));
        setRegistryName("diamondpowder");
    }
}
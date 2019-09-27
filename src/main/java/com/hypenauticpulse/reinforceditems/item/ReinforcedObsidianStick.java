package com.hypenauticpulse.reinforceditems.item;

import com.hypenauticpulse.reinforceditems.ReinforcedItems;
import net.minecraft.item.Item;

public class ReinforcedObsidianStick extends Item {

    public ReinforcedObsidianStick() {
        super(new Item.Properties()
                .maxStackSize(64)
                .group(ReinforcedItems.setup.itemGroup));
        setRegistryName("reinforcedobsidianstick");
    }
}

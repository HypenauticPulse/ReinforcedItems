package com.hypenauticpulse.reinforceditems.setup;

import com.hypenauticpulse.reinforceditems.blocks.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModSetup {

    public ItemGroup itemGroup = new ItemGroup("reinforceditems") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.REINFORCEDOBSIDIAN);
        }
    };

    public void init() {

    }
}

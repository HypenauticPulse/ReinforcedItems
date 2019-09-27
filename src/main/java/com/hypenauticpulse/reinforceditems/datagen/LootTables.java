package com.hypenauticpulse.reinforceditems.datagen;

import com.hypenauticpulse.reinforceditems.blocks.ModBlocks;
import net.minecraft.data.DataGenerator;

public class LootTables extends BaseLootTableProvider {

    public LootTables(DataGenerator dataGeneratorIn) { super(dataGeneratorIn); }

    @Override
    protected void addTables() {
        lootTables.put(ModBlocks.REINFORCEDOBSIDIAN, createStandardTable("firstblock", ModBlocks.REINFORCEDOBSIDIAN));
    }
}

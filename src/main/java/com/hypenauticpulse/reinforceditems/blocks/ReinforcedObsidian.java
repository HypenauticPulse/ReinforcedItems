package com.hypenauticpulse.reinforceditems.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ReinforcedObsidian extends Block {

    public ReinforcedObsidian() {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.STONE)
                .hardnessAndResistance(75.0F, 1800.0F)
        );
        setRegistryName("reinforcedobsidian");
    }
}

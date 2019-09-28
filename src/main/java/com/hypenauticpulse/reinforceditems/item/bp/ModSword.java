package com.hypenauticpulse.reinforceditems.item.bp;

import net.minecraft.item.IItemTier;
import net.minecraft.item.SwordItem;

public class ModSword extends SwordItem {
    public ModSword(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
        super(tier, attackDamageIn, attackSpeedIn, builder);
    }
}

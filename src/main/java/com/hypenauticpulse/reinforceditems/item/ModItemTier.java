package com.hypenauticpulse.reinforceditems.item;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;

public enum ModItemTier implements IItemTier {

    OBSIDIAN(5.0F, 10.0F, 2048, 3, 10, ModItems.OBSIDIANCHUNK);


    private float attackDamage;
    private float efficiency;
    private int durability;
    private int harvestLevel;
    private int enchantability;
    private Item repairMaterial;

    ModItemTier(float attackDamage, float efficiency, int durability, int harvestLevel, int enchantability, Item repairMaterial) {

        this.attackDamage = attackDamage;
        this.efficiency = efficiency;
        this.durability = durability;
        this.harvestLevel = harvestLevel;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getMaxUses() {
        return this.durability;
    }

    @Override
    public float getEfficiency() {
        return this.efficiency;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return this.harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return Ingredient.fromItems(this.repairMaterial);
    }
}

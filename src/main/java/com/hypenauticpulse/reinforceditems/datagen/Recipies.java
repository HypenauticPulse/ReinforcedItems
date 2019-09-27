package com.hypenauticpulse.reinforceditems.datagen;

import com.hypenauticpulse.reinforceditems.blocks.ModBlocks;
import com.hypenauticpulse.reinforceditems.item.ModItems;
import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.*;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.IItemProvider;
import net.minecraft.world.storage.loot.ConstantRange;

import java.security.InvalidAlgorithmParameterException;
import java.util.function.Consumer;

public class Recipies extends RecipeProvider {

    public Recipies(DataGenerator generatorIn) { super(generatorIn); }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        ShapedRecipeBuilder.shapedRecipe(ModItems.OBSIDIANCHUNK, 5)
                .patternLine("   ")
                .patternLine(" x ")
                .patternLine("   ")
                .key('x', Blocks.OBSIDIAN)
                .setGroup("reinforceditems")
                .addCriterion("obsidian", InventoryChangeTrigger.Instance.forItems(Blocks.OBSIDIAN))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ModBlocks.REINFORCEDOBSIDIAN)
                .patternLine("xyx")
                .patternLine("yxy")
                .patternLine("xyx")
                .key('x', ModItems.OBSIDIANCHUNK)
                .key('y', Items.DIAMOND)
                .setGroup("reinforceditems")
                .addCriterion("obsidian", InventoryChangeTrigger.Instance.forItems(Blocks.OBSIDIAN))
                .build(consumer);
    }
}

package com.hypenauticpulse.reinforceditems.datagen;

import com.hypenauticpulse.reinforceditems.ReinforcedItems;
import com.hypenauticpulse.reinforceditems.blocks.ModBlocks;
import com.hypenauticpulse.reinforceditems.item.ModItems;
import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.block.Blocks;
import net.minecraft.data.*;
import net.minecraft.item.Items;

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
        ShapedRecipeBuilder.shapedRecipe(ModItems.REINFORCEDOBSIDIANSTICK, 4)
                .patternLine("   ")
                .patternLine(" x ")
                .patternLine(" x ")
                .key('x', ModBlocks.REINFORCEDOBSIDIAN)
                .setGroup("reinforceditems")
                .addCriterion("reinforcedobsidian", InventoryChangeTrigger.Instance.forItems(ModBlocks.REINFORCEDOBSIDIAN))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ModItems.DIAMONDSTICK, 4)
                .patternLine("   ")
                .patternLine(" x ")
                .patternLine(" x ")
                .key('x', Items.DIAMOND)
                .setGroup("reinforceditems")
                .addCriterion("diamonds", InventoryChangeTrigger.Instance.forItems(Items.DIAMOND))
                .build(consumer);
    }
}

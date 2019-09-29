package com.hypenauticpulse.reinforceditems.datagen;

import com.hypenauticpulse.reinforceditems.ReinforcedItems;
import com.hypenauticpulse.reinforceditems.blocks.ModBlocks;
import com.hypenauticpulse.reinforceditems.item.ModItems;
import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.block.Blocks;
import net.minecraft.data.*;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import sun.security.provider.SHA;

import java.util.function.Consumer;

public class Recipes extends RecipeProvider {

    public Recipes(DataGenerator generatorIn) { super(generatorIn); }

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
        ShapedRecipeBuilder.shapedRecipe(ModItems.OBSIDIANPICKAXE)
                .patternLine("xxx")
                .patternLine(" y ")
                .patternLine(" y ")
                .key('x', ModItems.OBSIDIANCHUNK)
                .key('y', ModItems.DIAMONDSTICK)
                .setGroup("reinforceditems")
                .addCriterion("obsidianchunk", InventoryChangeTrigger.Instance.forItems(ModItems.OBSIDIANCHUNK))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ModItems.OBSIDIANAXE)
                .patternLine("xx ")
                .patternLine("xy ")
                .patternLine(" y ")
                .key('x', ModItems.OBSIDIANCHUNK)
                .key('y', ModItems.DIAMONDSTICK)
                .setGroup("reinforceditems")
                .addCriterion("obsidianchunk", InventoryChangeTrigger.Instance.forItems(ModItems.OBSIDIANCHUNK))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ModItems.OBSIDIANSHOVEL)
                .patternLine(" x ")
                .patternLine(" y ")
                .patternLine(" y ")
                .key('x', ModItems.OBSIDIANCHUNK)
                .key('y', ModItems.DIAMONDSTICK)
                .setGroup("reinforceditems")
                .addCriterion("obsidianchunk", InventoryChangeTrigger.Instance.forItems(ModItems.OBSIDIANCHUNK))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ModItems.OBSIDIANSWORD)
                .patternLine(" x ")
                .patternLine(" x ")
                .patternLine(" y ")
                .key('x', ModItems.OBSIDIANCHUNK)
                .key('y', ModItems.DIAMONDSTICK)
                .setGroup("reinforceditems")
                .addCriterion("obsidianchunk", InventoryChangeTrigger.Instance.forItems(ModItems.OBSIDIANCHUNK))
                .build(consumer);
    }
}

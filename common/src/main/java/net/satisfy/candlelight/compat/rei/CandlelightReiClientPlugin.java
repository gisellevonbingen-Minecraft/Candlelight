package net.satisfy.candlelight.compat.rei;

import me.shedaniel.rei.api.client.registry.category.CategoryRegistry;
import me.shedaniel.rei.api.client.registry.display.DisplayRegistry;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.minecraft.world.Container;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.satisfy.candlelight.compat.rei.cookingpan.CookingPanCategory;
import net.satisfy.candlelight.compat.rei.cookingpan.CookingPanDisplay;
import net.satisfy.candlelight.compat.rei.cookingpot.CookingPotCategory;
import net.satisfy.candlelight.compat.rei.cookingpot.CookingPotDisplay;
import net.satisfy.candlelight.registry.ObjectRegistry;
import net.satisfy.candlelight.recipe.CookingPanRecipe;
import net.satisfy.candlelight.recipe.CookingPotRecipe;

import java.util.ArrayList;
import java.util.List;


public class CandlelightReiClientPlugin {


    public static void registerCategories(CategoryRegistry registry) {
        registry.add(new CookingPanCategory());
        registry.add(new CookingPotCategory());

        registry.addWorkstations(CookingPotDisplay.COOKING_POT_DISPLAY, EntryStacks.of(ObjectRegistry.COOKING_POT.get()));
        registry.addWorkstations(CookingPanDisplay.COOKING_PAN_DISPLAY, EntryStacks.of(ObjectRegistry.COOKING_PAN.get()));

    }


    public static void registerDisplays(DisplayRegistry registry) {
        registry.registerFiller(CookingPanRecipe.class, CookingPanDisplay::new);
        registry.registerFiller(CookingPotRecipe.class, CookingPotDisplay::new);
    }


    public static List<Ingredient> ingredients(Recipe<Container> recipe, ItemStack stack) {
        List<Ingredient> l = new ArrayList<>(recipe.getIngredients());
        l.add(0, Ingredient.of(stack.getItem()));
        return l;
    }
}

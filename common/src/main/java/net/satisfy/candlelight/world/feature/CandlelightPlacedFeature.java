package net.satisfy.candlelight.world.feature;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.satisfy.candlelight.util.CandlelightIdentifier;


public class CandlelightPlacedFeature {
    public static final ResourceKey<PlacedFeature> LETTUCE_PATCH_CHANCE_KEY = registerKey("lettuce_patch_chance");
    public static final ResourceKey<PlacedFeature> ROSE_PATCH_CHANCE_KEY = registerKey("rose_patch_chance");
    public static final ResourceKey<PlacedFeature> TOMATOES_PATCH_CHANCE_KEY = registerKey("tomatoes_patch_chance");


    public static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new CandlelightIdentifier(name));
    }
}


package net.bananashelp20.recipes_you_needed.datagen;

import net.bananashelp20.recipes_you_needed.RecipesYouNeeded;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(packOutput, pRegistries);
    }

    static List<ItemLike> QUARTZ_BLOCK_SMELTABLES = List.of(
            Blocks.SMOOTH_QUARTZ,
            Blocks.CHISELED_QUARTZ_BLOCK,
            Blocks.QUARTZ_BRICKS,
            Blocks.QUARTZ_PILLAR
    );

    static List<ItemLike> NETHERITE_SMELTABLES = List.of(
            Items.NETHERITE_AXE,
            Items.NETHERITE_HOE,
            Items.NETHERITE_CHESTPLATE,
            Items.NETHERITE_PICKAXE,
            Items.NETHERITE_BOOTS,
            Items.NETHERITE_HELMET,
            Items.NETHERITE_LEGGINGS,
            Items.NETHERITE_SHOVEL,
            Items.NETHERITE_SWORD
    );

    static List<ItemLike> DIAMOND_SMELTABLES = List.of(
            Items.DIAMOND_AXE,
            Items.DIAMOND_HOE,
            Items.DIAMOND_CHESTPLATE,
            Items.DIAMOND_PICKAXE,
            Items.DIAMOND_BOOTS,
            Items.DIAMOND_HELMET,
            Items.DIAMOND_HORSE_ARMOR,
            Items.DIAMOND_LEGGINGS,
            Items.DIAMOND_SHOVEL,
            Items.DIAMOND_SWORD
    );

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {
        shapedRecipes(pRecipeOutput);
        shapelessRecipes(pRecipeOutput);
        smeltingAndBlastingRecipes(pRecipeOutput);
    }

    private static void shapedRecipes(RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.BELL)
                .pattern("AAA")
                .pattern("ACA")
                .pattern("ABA")
                .define('A', Items.GOLD_INGOT)
                .define('C', Items.CHAIN)
                .define('B', Items.GOLD_NUGGET)
                .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.SADDLE)
                .pattern("AAA")
                .pattern("B B")
                .pattern("CBC")
                .define('A', Items.LEATHER)
                .define('B', Items.STRING)
                .define('C', Items.IRON_INGOT)
                .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.ANVIL)
                .pattern("AA")
                .define('A', Items.DAMAGED_ANVIL)
                .unlockedBy(getHasName(Items.DAMAGED_ANVIL), has(Items.DAMAGED_ANVIL)).save(output, "anvil_from_damaged");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.ANVIL)
                .pattern("AA")
                .define('A', Items.CHIPPED_ANVIL)
                .unlockedBy(getHasName(Items.CHIPPED_ANVIL), has(Items.CHIPPED_ANVIL)).save(output, "anvil_from_chipped");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.ANVIL)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .define('A', Items.IRON_INGOT)
                .define('B', Items.DAMAGED_ANVIL)
                .unlockedBy(getHasName(Items.DAMAGED_ANVIL), has(Items.DAMAGED_ANVIL)).save(output, "anvil_from_damaged_and_more");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.ANVIL)
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A', Items.IRON_INGOT)
                .define('B', Items.CHIPPED_ANVIL)
                .unlockedBy(getHasName(Items.CHIPPED_ANVIL), has(Items.CHIPPED_ANVIL)).save(output, "anvil_from_chipped_and_more");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.SPORE_BLOSSOM)
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A', Items.PINK_DYE)
                .define('B', Items.MOSS_BLOCK)
                .unlockedBy(getHasName(Items.MOSS_BLOCK), has(Items.MOSS_BLOCK)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.NAME_TAG)
                .pattern("  A")
                .pattern(" B ")
                .pattern("C  ")
                .define('A', Items.IRON_NUGGET)
                .define('B', Items.STRING)
                .define('C', Items.PAPER)
                .unlockedBy(getHasName(Items.IRON_NUGGET), has(Items.IRON_NUGGET)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.SHROOMLIGHT, 4)
                .pattern("ACA")
                .pattern("CBC")
                .pattern("ACA")
                .define('A', Items.GLOWSTONE_DUST)
                .define('B', Items.GLOWSTONE)
                .define('C', Items.NETHER_WART)
                .unlockedBy(getHasName(Items.GLOWSTONE), has(Items.GLOWSTONE)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.ACACIA_PLANKS)
                .pattern("A")
                .pattern("A")
                .define('A', Items.ACACIA_SLAB)
                .unlockedBy(getHasName(Items.ACACIA_SLAB), has(Items.ACACIA_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.SANDSTONE)
                .pattern("A")
                .pattern("A")
                .define('A', Items.SANDSTONE_SLAB)
                .unlockedBy(getHasName(Items.SANDSTONE_SLAB), has(Items.SANDSTONE_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.BAMBOO_PLANKS)
                .pattern("A")
                .pattern("A")
                .define('A', Items.BAMBOO_SLAB)
                .unlockedBy(getHasName(Items.BAMBOO_SLAB), has(Items.BAMBOO_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.BIRCH_PLANKS)
                .pattern("A")
                .pattern("A")
                .define('A', Items.BIRCH_SLAB)
                .unlockedBy(getHasName(Items.BIRCH_SLAB), has(Items.BIRCH_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.CHERRY_PLANKS)
                .pattern("A")
                .pattern("A")
                .define('A', Items.CHERRY_SLAB)
                .unlockedBy(getHasName(Items.CHERRY_SLAB), has(Items.CHERRY_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.CRIMSON_PLANKS)
                .pattern("A")
                .pattern("A")
                .define('A', Items.CRIMSON_SLAB)
                .unlockedBy(getHasName(Items.CRIMSON_SLAB), has(Items.CRIMSON_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.DARK_OAK_PLANKS)
                .pattern("A")
                .pattern("A")
                .define('A', Items.DARK_OAK_SLAB)
                .unlockedBy(getHasName(Items.DARK_OAK_SLAB), has(Items.DARK_OAK_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.JUNGLE_PLANKS)
                .pattern("A")
                .pattern("A")
                .define('A', Items.JUNGLE_SLAB)
                .unlockedBy(getHasName(Items.JUNGLE_SLAB), has(Items.JUNGLE_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.MANGROVE_PLANKS)
                .pattern("A")
                .pattern("A")
                .define('A', Items.MANGROVE_SLAB)
                .unlockedBy(getHasName(Items.MANGROVE_SLAB), has(Items.MANGROVE_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.OAK_PLANKS)
                .pattern("A")
                .pattern("A")
                .define('A', Items.OAK_SLAB)
                .unlockedBy(getHasName(Items.OAK_SLAB), has(Items.OAK_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.SPRUCE_PLANKS)
                .pattern("A")
                .pattern("A")
                .define('A', Items.SPRUCE_SLAB)
                .unlockedBy(getHasName(Items.SPRUCE_SLAB), has(Items.SPRUCE_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.WARPED_PLANKS)
                .pattern("A")
                .pattern("A")
                .define('A', Items.WARPED_SLAB)
                .unlockedBy(getHasName(Items.WARPED_SLAB), has(Items.WARPED_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.SMOOTH_QUARTZ)
                .pattern("A")
                .pattern("A")
                .define('A', Items.SMOOTH_QUARTZ_SLAB)
                .unlockedBy(getHasName(Items.SMOOTH_QUARTZ_SLAB), has(Items.SMOOTH_QUARTZ_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.SMOOTH_RED_SANDSTONE)
                .pattern("A")
                .pattern("A")
                .define('A', Items.SMOOTH_RED_SANDSTONE_SLAB)
                .unlockedBy(getHasName(Items.SMOOTH_RED_SANDSTONE_SLAB), has(Items.SMOOTH_RED_SANDSTONE_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.ANDESITE)
                .pattern("A")
                .pattern("A")
                .define('A', Items.ANDESITE_SLAB)
                .unlockedBy(getHasName(Items.ANDESITE_SLAB), has(Items.ANDESITE_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.SMOOTH_SANDSTONE)
                .pattern("A")
                .pattern("A")
                .define('A', Items.SMOOTH_SANDSTONE_SLAB)
                .unlockedBy(getHasName(Items.SMOOTH_SANDSTONE_SLAB), has(Items.SMOOTH_SANDSTONE_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.SMOOTH_STONE)
                .pattern("A")
                .pattern("A")
                .define('A', Items.SMOOTH_STONE_SLAB)
                .unlockedBy(getHasName(Items.SMOOTH_STONE_SLAB), has(Items.SMOOTH_STONE_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.STONE)
                .pattern("A")
                .pattern("A")
                .define('A', Items.STONE_SLAB)
                .unlockedBy(getHasName(Items.STONE_SLAB), has(Items.STONE_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.STONE_BRICKS)
                .pattern("A")
                .pattern("A")
                .define('A', Items.STONE_BRICK_SLAB)
                .unlockedBy(getHasName(Items.STONE_BRICK_SLAB), has(Items.STONE_BRICK_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.QUARTZ_BLOCK)
                .pattern("A")
                .pattern("A")
                .define('A', Items.QUARTZ_SLAB)
                .unlockedBy(getHasName(Items.QUARTZ_SLAB), has(Items.QUARTZ_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.RED_SANDSTONE)
                .pattern("A")
                .pattern("A")
                .define('A', Items.RED_SANDSTONE_SLAB)
                .unlockedBy(getHasName(Items.RED_SANDSTONE_SLAB), has(Items.RED_SANDSTONE_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.CUT_RED_SANDSTONE)
                .pattern("A")
                .pattern("A")
                .define('A', Items.CUT_RED_SANDSTONE_SLAB)
                .unlockedBy(getHasName(Items.CUT_RED_SANDSTONE_SLAB), has(Items.CUT_RED_SANDSTONE_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.GRANITE)
                .pattern("A")
                .pattern("A")
                .define('A', Items.GRANITE_SLAB)
                .unlockedBy(getHasName(Items.GRANITE_SLAB), has(Items.GRANITE_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.DIORITE)
                .pattern("A")
                .pattern("A")
                .define('A', Items.DIORITE_SLAB)
                .unlockedBy(getHasName(Items.DIORITE_SLAB), has(Items.DIORITE_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.BAMBOO_MOSAIC)
                .pattern("A")
                .pattern("A")
                .define('A', Items.BAMBOO_MOSAIC_SLAB)
                .unlockedBy(getHasName(Items.BAMBOO_MOSAIC_SLAB), has(Items.BAMBOO_MOSAIC_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.BRICKS)
                .pattern("A")
                .pattern("A")
                .define('A', Items.BRICK_SLAB)
                .unlockedBy(getHasName(Items.BRICK_SLAB), has(Items.BRICK_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.MUD_BRICKS)
                .pattern("A")
                .pattern("A")
                .define('A', Items.MUD_BRICK_SLAB)
                .unlockedBy(getHasName(Items.MUD_BRICK_SLAB), has(Items.MUD_BRICK_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.DEEPSLATE_BRICKS)
                .pattern("A")
                .pattern("A")
                .define('A', Items.DEEPSLATE_BRICK_SLAB)
                .unlockedBy(getHasName(Items.DEEPSLATE_BRICK_SLAB), has(Items.DEEPSLATE_BRICK_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.NETHER_BRICKS)
                .pattern("A")
                .pattern("A")
                .define('A', Items.NETHER_BRICK_SLAB)
                .unlockedBy(getHasName(Items.NETHER_BRICK_SLAB), has(Items.NETHER_BRICK_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.END_STONE_BRICKS)
                .pattern("A")
                .pattern("A")
                .define('A', Items.END_STONE_BRICK_SLAB)
                .unlockedBy(getHasName(Items.END_STONE_BRICK_SLAB), has(Items.END_STONE_BRICK_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.MOSSY_STONE_BRICKS)
                .pattern("A")
                .pattern("A")
                .define('A', Items.MOSSY_STONE_BRICK_SLAB)
                .unlockedBy(getHasName(Items.MOSSY_STONE_BRICK_SLAB), has(Items.MOSSY_STONE_BRICK_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.POLISHED_BLACKSTONE_BRICKS)
                .pattern("A")
                .pattern("A")
                .define('A', Items.POLISHED_BLACKSTONE_BRICK_SLAB)
                .unlockedBy(getHasName(Items.POLISHED_BLACKSTONE_BRICK_SLAB), has(Items.POLISHED_BLACKSTONE_BRICK_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.PRISMARINE_BRICKS)
                .pattern("A")
                .pattern("A")
                .define('A', Items.PRISMARINE_BRICK_SLAB)
                .unlockedBy(getHasName(Items.PRISMARINE_BRICK_SLAB), has(Items.PRISMARINE_BRICK_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.RED_NETHER_BRICKS)
                .pattern("A")
                .pattern("A")
                .define('A', Items.RED_NETHER_BRICK_SLAB)
                .unlockedBy(getHasName(Items.RED_NETHER_BRICK_SLAB), has(Items.RED_NETHER_BRICK_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.TUFF_BRICKS)
                .pattern("A")
                .pattern("A")
                .define('A', Items.TUFF_BRICK_SLAB)
                .unlockedBy(getHasName(Items.TUFF_BRICK_SLAB), has(Items.TUFF_BRICK_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.BLACKSTONE)
                .pattern("A")
                .pattern("A")
                .define('A', Items.BLACKSTONE_SLAB)
                .unlockedBy(getHasName(Items.BLACKSTONE_SLAB), has(Items.BLACKSTONE_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.COBBLESTONE)
                .pattern("A")
                .pattern("A")
                .define('A', Items.COBBLESTONE_SLAB)
                .unlockedBy(getHasName(Items.COBBLESTONE_SLAB), has(Items.COBBLESTONE_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.CUT_SANDSTONE)
                .pattern("A")
                .pattern("A")
                .define('A', Items.CUT_STANDSTONE_SLAB)
                .unlockedBy(getHasName(Items.CUT_STANDSTONE_SLAB), has(Items.CUT_STANDSTONE_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.MOSSY_COBBLESTONE)
                .pattern("A")
                .pattern("A")
                .define('A', Items.MOSSY_COBBLESTONE_SLAB)
                .unlockedBy(getHasName(Items.MOSSY_COBBLESTONE_SLAB), has(Items.MOSSY_COBBLESTONE_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.POLISHED_BLACKSTONE)
                .pattern("A")
                .pattern("A")
                .define('A', Items.POLISHED_BLACKSTONE_SLAB)
                .unlockedBy(getHasName(Items.POLISHED_BLACKSTONE_SLAB), has(Items.POLISHED_BLACKSTONE_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.CUT_COPPER)
                .pattern("A")
                .pattern("A")
                .define('A', Items.CUT_COPPER_SLAB)
                .unlockedBy(getHasName(Items.CUT_COPPER_SLAB), has(Items.CUT_COPPER_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.EXPOSED_CUT_COPPER)
                .pattern("A")
                .pattern("A")
                .define('A', Items.EXPOSED_CUT_COPPER_SLAB)
                .unlockedBy(getHasName(Items.EXPOSED_CUT_COPPER_SLAB), has(Items.EXPOSED_CUT_COPPER_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.OXIDIZED_CUT_COPPER)
                .pattern("A")
                .pattern("A")
                .define('A', Items.OXIDIZED_CUT_COPPER_SLAB)
                .unlockedBy(getHasName(Items.OXIDIZED_CUT_COPPER_SLAB), has(Items.OXIDIZED_CUT_COPPER_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.WAXED_CUT_COPPER)
                .pattern("A")
                .pattern("A")
                .define('A', Items.WAXED_CUT_COPPER_SLAB)
                .unlockedBy(getHasName(Items.WAXED_CUT_COPPER_SLAB), has(Items.WAXED_CUT_COPPER_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.WAXED_EXPOSED_CUT_COPPER)
                .pattern("A")
                .pattern("A")
                .define('A', Items.WAXED_EXPOSED_CUT_COPPER_SLAB)
                .unlockedBy(getHasName(Items.WAXED_EXPOSED_CUT_COPPER_SLAB), has(Items.WAXED_EXPOSED_CUT_COPPER_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.WAXED_OXIDIZED_CUT_COPPER)
                .pattern("A")
                .pattern("A")
                .define('A', Items.WAXED_OXIDIZED_CUT_COPPER_SLAB)
                .unlockedBy(getHasName(Items.WAXED_OXIDIZED_CUT_COPPER_SLAB), has(Items.WAXED_OXIDIZED_CUT_COPPER_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.WAXED_WEATHERED_CUT_COPPER)
                .pattern("A")
                .pattern("A")
                .define('A', Items.WAXED_WEATHERED_CUT_COPPER_SLAB)
                .unlockedBy(getHasName(Items.WAXED_WEATHERED_CUT_COPPER_SLAB), has(Items.WAXED_WEATHERED_CUT_COPPER_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.WEATHERED_CUT_COPPER)
                .pattern("A")
                .pattern("A")
                .define('A', Items.WEATHERED_CUT_COPPER_SLAB)
                .unlockedBy(getHasName(Items.WEATHERED_CUT_COPPER_SLAB), has(Items.WEATHERED_CUT_COPPER_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.POLISHED_ANDESITE)
                .pattern("A")
                .pattern("A")
                .define('A', Items.POLISHED_ANDESITE_SLAB)
                .unlockedBy(getHasName(Items.POLISHED_ANDESITE_SLAB), has(Items.POLISHED_ANDESITE_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.POLISHED_DIORITE)
                .pattern("A")
                .pattern("A")
                .define('A', Items.POLISHED_DIORITE_SLAB)
                .unlockedBy(getHasName(Items.POLISHED_DIORITE_SLAB), has(Items.POLISHED_DIORITE_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.POLISHED_GRANITE)
                .pattern("A")
                .pattern("A")
                .define('A', Items.POLISHED_GRANITE_SLAB)
                .unlockedBy(getHasName(Items.POLISHED_GRANITE_SLAB), has(Items.POLISHED_GRANITE_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.COBBLED_DEEPSLATE)
                .pattern("A")
                .pattern("A")
                .define('A', Items.COBBLED_DEEPSLATE_SLAB)
                .unlockedBy(getHasName(Items.COBBLED_DEEPSLATE_SLAB), has(Items.COBBLED_DEEPSLATE_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.POLISHED_DEEPSLATE)
                .pattern("A")
                .pattern("A")
                .define('A', Items.POLISHED_DEEPSLATE_SLAB)
                .unlockedBy(getHasName(Items.POLISHED_DEEPSLATE_SLAB), has(Items.POLISHED_DEEPSLATE_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.DEEPSLATE_TILES)
                .pattern("A")
                .pattern("A")
                .define('A', Items.DEEPSLATE_TILE_SLAB)
                .unlockedBy(getHasName(Items.DEEPSLATE_TILE_SLAB), has(Items.DEEPSLATE_TILE_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.POLISHED_TUFF)
                .pattern("A")
                .pattern("A")
                .define('A', Items.POLISHED_TUFF_SLAB)
                .unlockedBy(getHasName(Items.POLISHED_TUFF_SLAB), has(Items.POLISHED_TUFF_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.TUFF)
                .pattern("A")
                .pattern("A")
                .define('A', Items.TUFF_SLAB)
                .unlockedBy(getHasName(Items.TUFF_SLAB), has(Items.TUFF_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.PRISMARINE)
                .pattern("A")
                .pattern("A")
                .define('A', Items.PRISMARINE_SLAB)
                .unlockedBy(getHasName(Items.PRISMARINE_SLAB), has(Items.PRISMARINE_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.DARK_PRISMARINE)
                .pattern("A")
                .pattern("A")
                .define('A', Items.DARK_PRISMARINE_SLAB)
                .unlockedBy(getHasName(Items.DARK_PRISMARINE_SLAB), has(Items.DARK_PRISMARINE_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.PURPUR_BLOCK)
                .pattern("A")
                .pattern("A")
                .define('A', Items.PURPUR_SLAB)
                .unlockedBy(getHasName(Items.PURPUR_SLAB), has(Items.PURPUR_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.OAK_STAIRS, 6)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.OAK_PLANKS)
                .unlockedBy(getHasName(Items.OAK_PLANKS), has(Items.OAK_PLANKS)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.WARPED_STAIRS, 6)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.WARPED_PLANKS)
                .unlockedBy(getHasName(Items.WARPED_PLANKS), has(Items.WARPED_PLANKS)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.DARK_OAK_STAIRS, 6)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.DARK_OAK_PLANKS)
                .unlockedBy(getHasName(Items.DARK_OAK_PLANKS), has(Items.DARK_OAK_PLANKS)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.JUNGLE_STAIRS, 6)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.JUNGLE_PLANKS)
                .unlockedBy(getHasName(Items.JUNGLE_PLANKS), has(Items.JUNGLE_PLANKS)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.CRIMSON_STAIRS, 6)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.CRIMSON_PLANKS)
                .unlockedBy(getHasName(Items.CRIMSON_PLANKS), has(Items.CRIMSON_PLANKS)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.SPRUCE_STAIRS, 6)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.SPRUCE_PLANKS)
                .unlockedBy(getHasName(Items.SPRUCE_PLANKS), has(Items.SPRUCE_PLANKS)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.BAMBOO_STAIRS, 6)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.BAMBOO_PLANKS)
                .unlockedBy(getHasName(Items.BAMBOO_PLANKS), has(Items.BAMBOO_PLANKS)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.BAMBOO_MOSAIC_STAIRS, 6)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.BAMBOO_MOSAIC)
                .unlockedBy(getHasName(Items.BAMBOO_MOSAIC), has(Items.BAMBOO_MOSAIC)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.MANGROVE_STAIRS, 6)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.MANGROVE_PLANKS)
                .unlockedBy(getHasName(Items.MANGROVE_PLANKS), has(Items.MANGROVE_PLANKS)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.BIRCH_STAIRS, 6)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.BIRCH_PLANKS)
                .unlockedBy(getHasName(Items.BIRCH_PLANKS), has(Items.BIRCH_PLANKS)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.ACACIA_STAIRS, 6)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', Items.ACACIA_PLANKS)
                .unlockedBy(getHasName(Items.ACACIA_PLANKS), has(Items.ACACIA_PLANKS)).save(output);
    }

    private static void shapelessRecipes(RecipeOutput output) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.NETHER_WART, 9)
                .requires(Items.NETHER_WART_BLOCK)
                .unlockedBy(getHasName(Items.NETHER_WART_BLOCK), has(Items.NETHER_WART_BLOCK)).save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.GLOWSTONE_DUST, 4)
                .requires(Items.GLOWSTONE)
                .unlockedBy(getHasName(Items.GLOWSTONE), has(Items.GLOWSTONE)).save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.DISPENSER, 1)
                .requires(Items.DROPPER)
                .requires(Items.BOW)
                .unlockedBy(getHasName(Items.DROPPER), has(Items.DROPPER)).save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.BLACK_DYE, 4)
                .requires(Items.COAL)
                .unlockedBy(getHasName(Items.COAL), has(Items.COAL)).save(output, "black_dye_from_coal");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.BLACK_DYE, 2)
                .requires(Items.CHARCOAL)
                .unlockedBy(getHasName(Items.CHARCOAL), has(Items.CHARCOAL)).save(output, "black_dye_from_charcoal");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.PACKED_ICE, 9)
                .requires(Items.BLUE_ICE)
                .unlockedBy(getHasName(Items.BLUE_ICE), has(Items.BLUE_ICE)).save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.ICE, 9)
                .requires(Items.PACKED_ICE)
                .unlockedBy(getHasName(Items.PACKED_ICE), has(Items.PACKED_ICE)).save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.POINTED_DRIPSTONE, 4)
                .requires(Items.DRIPSTONE_BLOCK)
                .unlockedBy(getHasName(Items.DRIPSTONE_BLOCK), has(Items.DRIPSTONE_BLOCK)).save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.STRING, 4)
                .requires(Items.WHITE_WOOL)
                .unlockedBy(getHasName(Items.STRING), has(Items.STRING)).save(output, "string_from_wool_white");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.STRING, 4)
                .requires(Items.BLACK_WOOL)
                .unlockedBy(getHasName(Items.STRING), has(Items.STRING)).save(output, "string_from_wool_black");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.STRING, 4)
                .requires(Items.BLUE_WOOL)
                .unlockedBy(getHasName(Items.STRING), has(Items.STRING)).save(output, "string_from_wool_blue");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.STRING, 4)
                .requires(Items.CYAN_WOOL)
                .unlockedBy(getHasName(Items.STRING), has(Items.STRING)).save(output, "string_from_wool_cyan");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.STRING, 4)
                .requires(Items.BROWN_WOOL)
                .unlockedBy(getHasName(Items.STRING), has(Items.STRING)).save(output, "string_from_wool_brown");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.STRING, 4)
                .requires(Items.GRAY_WOOL)
                .unlockedBy(getHasName(Items.STRING), has(Items.STRING)).save(output, "string_from_wool_gray");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.STRING, 4)
                .requires(Items.GREEN_WOOL)
                .unlockedBy(getHasName(Items.STRING), has(Items.STRING)).save(output, "string_from_wool_green");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.STRING, 4)
                .requires(Items.LIGHT_BLUE_WOOL)
                .unlockedBy(getHasName(Items.STRING), has(Items.STRING)).save(output, "string_from_wool_light_blue");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.STRING, 4)
                .requires(Items.LIGHT_GRAY_WOOL)
                .unlockedBy(getHasName(Items.STRING), has(Items.STRING)).save(output, "string_from_wool_light_gray");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.STRING, 4)
                .requires(Items.LIME_WOOL)
                .unlockedBy(getHasName(Items.STRING), has(Items.STRING)).save(output, "string_from_wool_lime");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.STRING, 4)
                .requires(Items.MAGENTA_WOOL)
                .unlockedBy(getHasName(Items.STRING), has(Items.STRING)).save(output, "string_from_wool_magenta");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.STRING, 4)
                .requires(Items.ORANGE_WOOL)
                .unlockedBy(getHasName(Items.STRING), has(Items.STRING)).save(output, "string_from_wool_orange");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.STRING, 4)
                .requires(Items.PINK_WOOL)
                .unlockedBy(getHasName(Items.STRING), has(Items.STRING)).save(output, "string_from_wool_pink");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.STRING, 4)
                .requires(Items.PURPLE_WOOL)
                .unlockedBy(getHasName(Items.STRING), has(Items.STRING)).save(output, "string_from_wool_purple");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.STRING, 4)
                .requires(Items.RED_WOOL)
                .unlockedBy(getHasName(Items.STRING), has(Items.STRING)).save(output, "string_from_wool_red");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.STRING, 4)
                .requires(Items.YELLOW_WOOL)
                .unlockedBy(getHasName(Items.STRING), has(Items.STRING)).save(output, "string_from_wool_yellow");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.SUSPICIOUS_SAND, 1)
                .requires(Items.SAND)
                .requires(Items.IRON_NUGGET)
                .unlockedBy(getHasName(Items.IRON_NUGGET), has(Items.IRON_NUGGET)).save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.SUSPICIOUS_GRAVEL, 1)
                .requires(Items.GRAVEL)
                .requires(Items.IRON_NUGGET)
                .unlockedBy(getHasName(Items.IRON_NUGGET), has(Items.IRON_NUGGET)).save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.QUARTZ, 4)
                .requires(Items.QUARTZ_BLOCK)
                .unlockedBy(getHasName(Items.QUARTZ_BLOCK), has(Items.QUARTZ_BLOCK)).save(output);
    }


        private static void smeltingAndBlastingRecipes(RecipeOutput output) {
            oreSmelting(output, QUARTZ_BLOCK_SMELTABLES, RecipeCategory.MISC, Items.QUARTZ_BLOCK, 1f, 200, "quartz_block");
            oreBlasting(output, QUARTZ_BLOCK_SMELTABLES, RecipeCategory.MISC, Items.QUARTZ_BLOCK, 2f, 100, "quartz_block");

            oreSmelting(output, NETHERITE_SMELTABLES, RecipeCategory.MISC, Items.NETHERITE_INGOT, 5f, 200, "netherite_ingot");
            oreBlasting(output, NETHERITE_SMELTABLES, RecipeCategory.MISC, Items.NETHERITE_INGOT, 10f, 100, "netherite_ingot");

            oreSmelting(output, DIAMOND_SMELTABLES, RecipeCategory.MISC, Items.DIAMOND, 5f, 200, "diamond");
            oreBlasting(output, DIAMOND_SMELTABLES, RecipeCategory.MISC, Items.DIAMOND, 10f, 100, "diamond");

            oreSmelting(output, List.of(Items.CHARCOAL), RecipeCategory.MISC, Items.COAL, 0.5f, 200, "coal");

            oreSmelting(output, List.of(Items.SUSPICIOUS_SAND, Items.SANDSTONE, Items.RED_SANDSTONE, Items.SOUL_SAND), RecipeCategory.MISC, Items.GLASS, 1f, 200, "glass");
            oreBlasting(output, List.of(Items.SAND, Items.SUSPICIOUS_SAND, Items.SANDSTONE, Items.RED_SANDSTONE, Items.RED_SAND, Items.SOUL_SAND), RecipeCategory.MISC, Items.GLASS, 1f, 100, "glass");

            oreSmelting(output, List.of(Items.SANDSTONE_WALL, Items.RED_SANDSTONE_WALL), RecipeCategory.MISC, Items.GLASS_PANE, 1f, 200, "glass_pane");
            oreBlasting(output, List.of(Items.SANDSTONE_WALL, Items.RED_SANDSTONE_WALL), RecipeCategory.MISC, Items.GLASS_PANE, 1.5f, 100, "glass_pane");

            oreSmelting(output, List.of(Items.ROTTEN_FLESH), RecipeCategory.MISC, Items.LEATHER, 1f, 150, "leather");

            oreSmelting(output, List.of(Items.RAW_COPPER_BLOCK), RecipeCategory.MISC, Items.COPPER_BLOCK, 1f, 200, "copper_block");
            oreBlasting(output, List.of(Items.RAW_COPPER_BLOCK), RecipeCategory.MISC, Items.COPPER_BLOCK, 1.5f, 100, "copper_block");

            oreSmelting(output, List.of(Items.RAW_GOLD_BLOCK), RecipeCategory.MISC, Items.GOLD_BLOCK, 1f, 200, "gold_block");
            oreBlasting(output, List.of(Items.RAW_GOLD_BLOCK), RecipeCategory.MISC, Items.GOLD_BLOCK, 1.5f, 100, "gold_block");

            oreSmelting(output, List.of(Items.RAW_IRON_BLOCK), RecipeCategory.MISC, Items.IRON_BLOCK, 1f, 200, "iron_block");
            oreBlasting(output, List.of(Items.RAW_IRON_BLOCK), RecipeCategory.MISC, Items.IRON_BLOCK, 1.5f, 100, "iron_block");
        }

    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, RecipesYouNeeded.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
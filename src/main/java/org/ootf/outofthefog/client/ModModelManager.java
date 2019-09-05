package org.ootf.outofthefog.client;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import org.ootf.outofthefog.init.ModBlocks;
import org.ootf.outofthefog.init.ModItems;
import org.ootf.outofthefog.util.Reference;
import org.ootf.outofthefog.util.ResourceHelper;

@EventBusSubscriber(modid = Reference.MOD_ID, value = Side.CLIENT)
@SuppressWarnings("unused")
public class ModModelManager
{
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event)
    {
        System.out.println(Item.getItemFromBlock(ModBlocks.REEDS));
        registerBlockModels();
        registerItemModels();
    }

    private static void registerBlockModels()
    {
        registerBlockModel(ModBlocks.THATCH_BLOCK);
        registerBlockModel(ModBlocks.REEDS);
        registerBlockModel(ModBlocks.RIBBON_FERN);
        registerBlockModel(ModBlocks.WETA_FERN);
        registerBlockModel(ModBlocks.INDIGOFERA);
        registerBlockModel(ModBlocks.LASIANDRA);
        registerBlockModel(ModBlocks.STOUT_DRAGON);
        registerBlockModel(ModBlocks.EPIPHYTE_FERN);
        registerBlockModel(ModBlocks.HORSETAILS);
        registerBlockModel(ModBlocks.TROPICAL_FOLIAGE);
        registerBlockModel(ModBlocks.FANLEAF);
        registerBlockModel(ModBlocks.UMBRELLA_LEAF);

        registerBlockModel(ModBlocks.JACKSONS_ENTBARK_SAPLING);

        registerBlockModel(ModBlocks.JACKSONS_ENTBARK_PLANKS);
        registerBlockModel(ModBlocks.JACKSONS_ENTBARK_LEAVES);
        registerBlockModel(ModBlocks.JACKSONS_ENTBARK_LOG);
        registerBlockModel(ModBlocks.BANANA_TREE_LEAVES);
        registerBlockModel(ModBlocks.BANANA_TREE_LOG);
        registerBlockModel(ModBlocks.FIG_TREE_PLANKS);
        registerBlockModel(ModBlocks.FIG_TREE_LEAVES);
        registerBlockModel(ModBlocks.FIG_TREE_LOG);
        registerBlockModel(ModBlocks.TOONA_CILIATA_PLANKS);
        registerBlockModel(ModBlocks.TOONA_CILIATA_LEAVES);
        registerBlockModel(ModBlocks.TOONA_CILIATA_LOG);
        registerBlockModel(ModBlocks.COCONUT_PALM_PLANKS);
        registerBlockModel(ModBlocks.COCONUT_PALM_LEAVES);
        registerBlockModel(ModBlocks.COCONUT_PALM_LOG);
        registerBlockModel(ModBlocks.SWAMPROOT_PLANKS);
        registerBlockModel(ModBlocks.SWAMPROOT_LEAVES);
        registerBlockModel(ModBlocks.SWAMPROOT_LOG);
        registerBlockModel(ModBlocks.UMBRELLA_PALM_PLANKS);
        registerBlockModel(ModBlocks.UMBRELLA_PALM_LEAVES);
        registerBlockModel(ModBlocks.UMBRELLA_PALM_LOG);
        registerBlockModel(ModBlocks.SNAGGLEBRANCH_PLANKS);
        registerBlockModel(ModBlocks.SNAGGLEBRANCH_LEAVES);
        registerBlockModel(ModBlocks.SNAGGLEBRANCH_LOG);
    }

    private static void registerItemModels()
    {
        registerItemModel(ModItems.MAP_FRAGMENT);
        registerItemModel(ModItems.MYSTERIOUS_MAP);

        registerItemModel(ModItems.EDIBLE_FERN_FIDDLEHEAD);
        registerItemModel(ModItems.CABBAGE_PALM_RHIZOMES);
        registerItemModel(ModItems.CABBAGE_PALM_SEEDS);
        registerItemModel(ModItems.PLANT_FIBER);
        registerItemModel(ModItems.WILD_BANANA);
        registerItemModel(ModItems.PREPARED_COCONUT);
        registerItemModel(ModItems.FIGS);
        registerItemModel(ModItems.DAIKON);
        registerItemModel(ModItems.COOKED_RICE);
        registerItemModel(ModItems.RAW_COCONUT);

        registerItemModel(ModItems.INVERTEBRATE_FLESH_RAW);
        registerItemModel(ModItems.INVERTEBRATE_FLESH_COOKED);
        registerItemModel(ModItems.GAMEY_VENISON_RAW);
        registerItemModel(ModItems.GAMEY_VENISON_COOKED);
        registerItemModel(ModItems.VENISON_RAW);
        registerItemModel(ModItems.VENISON_COOKED);
        registerItemModel(ModItems.PRIME_FISH_FILLET_RAW);
        registerItemModel(ModItems.PRIME_FISH_FILLET_COOKED);
        registerItemModel(ModItems.FISH_FILLET_RAW);
        registerItemModel(ModItems.FISH_FILLET_COOKED);
        registerItemModel(ModItems.PRIME_DINOSAUR_MEAT_RAW);
        registerItemModel(ModItems.PRIME_DINOSAUR_STEAK);
        registerItemModel(ModItems.DINOSAUR_MEAT_RAW);
        registerItemModel(ModItems.DINOSAUR_STEAK);
        registerItemModel(ModItems.REPTILE_MEAT_RAW);
        registerItemModel(ModItems.REPTILE_MEAT_COOKED);
        registerItemModel(ModItems.AMPHIBIAN_MEAT_RAW);
        registerItemModel(ModItems.AMPHIBIAN_MEAT_COOKED);

        registerItemModel(ModItems.CLAM);
        registerItemModel(ModItems.CLAM, 1, "pearl");
        registerItemModel(ModItems.V_REX_HIDE);
        registerItemModel(ModItems.V_REX_HELMET);
        registerItemModel(ModItems.V_REX_CHESTPLATE);
        registerItemModel(ModItems.V_REX_LEGGINGS);
        registerItemModel(ModItems.V_REX_BOOTS);
        registerItemModel(ModItems.CLAM_SHELL);
        registerItemModel(ModItems.CLAM_SHELL, 1, "pearl");
        registerItemModel(ModItems.PEARL);
    }

    private static void registerBlockModel(Block block)
    {
        Item item = Item.getItemFromBlock(block);
        registerItemModel(item);
    }

    private static void registerItemModel(Item item)
    {
        registerItemModel(item, 0);
    }

    private static void registerItemModel(Item item, int meta)
    {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName().toString() + (meta != 0 ? "_" + meta : ""), "inventory"));
    }

    private static void registerItemModel(Item item, int meta, String suffix)
    {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(item.getRegistryName().toString() + "_" + suffix), "inventory"));
    }
}

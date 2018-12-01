package org.ootf.outofthefog.client;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
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
    }

    private static void registerItemModels()
    {
        registerItemModel(ModItems.MAP_FRAGMENT);
        registerItemModel(ModItems.MYSTERIOUS_MAP);
        registerItemModel(ModItems.CABBAGE_PALM_RHIZOMES);
        registerItemModel(ModItems.CABBAGE_PALM_SEEDS);
        registerItemModel(ModItems.PLANT_FIBER);
        registerItemModel(ModItems.INVERTEBRATE_FLESH_RAW);
        registerItemModel(ModItems.INVERTEBRATE_FLESH_COOKED);
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

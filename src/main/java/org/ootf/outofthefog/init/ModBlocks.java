package org.ootf.outofthefog.init;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.registries.IForgeRegistry;
import org.ootf.outofthefog.OOTF;
import org.ootf.outofthefog.block.BlockCabbagePalm;
import org.ootf.outofthefog.block.BlockOOTF;
import org.ootf.outofthefog.util.Reference;

import javax.annotation.Nullable;

@EventBusSubscriber(modid = Reference.MOD_ID)
@ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    @ObjectHolder("cabbage_palm")
    public static final Block CABBAGE_PALM = null;

    @ObjectHolder("thatch_block")
    public static final Block THATCH_BLOCK = null;

    @SubscribeEvent
    @SuppressWarnings("unused")
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        IForgeRegistry<Block> forgeRegistry = event.getRegistry();

        registerBlock(new BlockCabbagePalm(), "cabbage_palm", forgeRegistry);
        registerBlock(new BlockOOTF(Material.PLANTS).setSoundType(SoundType.PLANT), "thatch_block", forgeRegistry);
    }

    @SubscribeEvent
    @SuppressWarnings("unused")
    public static void registerItemBlocks(RegistryEvent.Register<Item> event)
    {
        IForgeRegistry<Item> forgeRegistry = event.getRegistry();

        registerItemBlock(THATCH_BLOCK, forgeRegistry);
    }

    private static void registerItemBlock(Block block, IForgeRegistry<Item> forgeRegistry)
    {
        Item item = new ItemBlock(block).setRegistryName(block.getRegistryName());
        forgeRegistry.register(item);
    }

    private static void registerBlock(Block block, String name, IForgeRegistry<Block> forgeRegistry)
    {
        registerBlock(block, name, null, forgeRegistry);
    }

    private static void registerBlock(Block block, String name, @Nullable TileEntity tileEntity, IForgeRegistry<Block> forgeRegistry)
    {
        registerBlock(block, name, OOTF.TAB_OOTF, tileEntity, forgeRegistry);
    }

    private static void registerBlock(Block block, String name, @Nullable CreativeTabs creativeTab, @Nullable TileEntity tileEntity, IForgeRegistry<Block> forgeRegistry)
    {
        block.setRegistryName(name).setUnlocalizedName(block.getRegistryName().toString()).setCreativeTab(creativeTab);
        if(tileEntity != null) GameRegistry.registerTileEntity(tileEntity.getClass(), new ResourceLocation(Reference.MOD_ID, "tileentity" +  name));
        forgeRegistry.register(block);
    }
}
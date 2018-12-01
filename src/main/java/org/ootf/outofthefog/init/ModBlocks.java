package org.ootf.outofthefog.init;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.registries.GameData;
import org.ootf.outofthefog.OutOfTheFog;
import org.ootf.outofthefog.block.BlockCabbagePalm;
import org.ootf.outofthefog.block.BlockDoublePlant;
import org.ootf.outofthefog.block.BlockOOTF;
import org.ootf.outofthefog.block.BlockReeds;
import org.ootf.outofthefog.util.Reference;

@EventBusSubscriber(modid = Reference.MOD_ID)
@ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    @ObjectHolder("cabbage_palm")
    public static final Block CABBAGE_PALM = Blocks.AIR;

    @ObjectHolder("thatch_block")
    public static final Block THATCH_BLOCK = Blocks.AIR;

    @ObjectHolder("reeds")
    public static final BlockDoublePlant REEDS = null;

    @SubscribeEvent
    @SuppressWarnings("unused")
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        event.getRegistry().registerAll(
                prepare(new BlockCabbagePalm(), "cabbage_palm"),
                prepare(new BlockOOTF(Material.PLANTS).setSoundType(SoundType.PLANT), "thatch_block"),
                prepare(new BlockReeds(), "reeds")
        );
    }

    @SubscribeEvent
    @SuppressWarnings("unused")
    public static void registerItemBlocks(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(
                createItemBlock(THATCH_BLOCK)
        );
    }

    private static Item createItemBlock(Block block)
    {
        ResourceLocation registryName = block.getRegistryName();
        if (registryName == null)
        {
            throw new IllegalArgumentException("cannot register ItemBlock for unregistered block!");
        }

        return new ItemBlock(block).setRegistryName(registryName);
    }

    private static <T extends Block> T prepare(T block, String name)
    {
        ResourceLocation identifier = GameData.checkPrefix(name);
        block.setRegistryName(identifier);
        block.setTranslationKey(identifier.getNamespace() + ":" + identifier.getPath());
        block.setCreativeTab(OutOfTheFog.TAB_OOTF);
        return block;
    }
}

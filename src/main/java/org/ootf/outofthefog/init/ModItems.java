package org.ootf.outofthefog.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSeeds;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.registries.IForgeRegistry;
import org.ootf.outofthefog.OOTF;
import org.ootf.outofthefog.item.ItemChancedFood;
import org.ootf.outofthefog.item.ItemClam;
import org.ootf.outofthefog.item.ItemMysteriousMap;
import org.ootf.outofthefog.util.Reference;

import javax.annotation.Nullable;

@EventBusSubscriber(modid = Reference.MOD_ID)
@ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    @ObjectHolder("map_fragment")
    public static final Item MAP_FRAGMENT = null;

    @ObjectHolder("mysterious_map")
    public static final Item MYSTERIOUS_MAP = null;

    @ObjectHolder("cabbage_palm_rhizomes")
    public static final Item CABBAGE_PALM_RHIZOMES = null;

    @ObjectHolder("cabbage_palm_seeds")
    public static final Item CABBAGE_PALM_SEEDS = null;

    @ObjectHolder("plant_fiber")
    public static final Item PLANT_FIBER = null;

    @ObjectHolder("invertebrate_flesh_raw")
    public static final Item INVERTEBRATE_FLESH_RAW = null;

    @ObjectHolder("invertebrate_flesh_cooked")
    public static final Item INVERTEBRATE_FLESH_COOKED = null;

    @ObjectHolder("clam")
    public static final Item CLAM = null;

    @SubscribeEvent
    @SuppressWarnings("unused")
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
        IForgeRegistry<Item> forgeRegistry = event.getRegistry();

        registerItem(new Item(), "map_fragment", forgeRegistry);
        registerItem(new ItemMysteriousMap(), "mysterious_map", forgeRegistry);
        registerItem(new ItemFood(3, false), "cabbage_palm_rhizomes", forgeRegistry);
        registerItem(new ItemSeeds(ModBlocks.CABBAGE_PALM, Blocks.FARMLAND), "cabbage_palm_seeds", forgeRegistry);
        registerItem(new Item(), "plant_fiber", forgeRegistry);
        registerItem(new ItemChancedFood(1, true, 50).addPotionEffect(MobEffects.HUNGER, 20).addPotionEffect(MobEffects.NAUSEA, 5), "invertebrate_flesh_raw", forgeRegistry);
        registerItem(new ItemFood(3, true), "invertebrate_flesh_cooked", forgeRegistry);
        registerItem(new ItemClam(), "clam", forgeRegistry);
    }

    private static void registerItem(Item item, String name, IForgeRegistry<Item> forgeRegistry)
    {
        registerItem(item, name, OOTF.TAB_OOTF, forgeRegistry);
    }

    private static void registerItem(Item item, String name, @Nullable CreativeTabs creativeTab, IForgeRegistry<Item> forgeRegistry)
    {
        item.setRegistryName(name).setUnlocalizedName(item.getRegistryName().toString()).setCreativeTab(creativeTab);
        forgeRegistry.register(item);
    }
}

package org.ootf.outofthefog.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSeeds;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.registries.GameData;
import org.ootf.outofthefog.OOTF;
import org.ootf.outofthefog.item.ItemChancedFood;
import org.ootf.outofthefog.item.ItemClam;
import org.ootf.outofthefog.item.ItemMysteriousMap;
import org.ootf.outofthefog.util.Reference;

@EventBusSubscriber(modid = Reference.MOD_ID)
@ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final Item MAP_FRAGMENT = Items.AIR;
    public static final Item MYSTERIOUS_MAP = Items.AIR;
    public static final Item CABBAGE_PALM_RHIZOMES = Items.AIR;
    public static final Item CABBAGE_PALM_SEEDS = Items.AIR;
    public static final Item PLANT_FIBER = Items.AIR;
    public static final Item INVERTEBRATE_FLESH_RAW = Items.AIR;
    public static final Item INVERTEBRATE_FLESH_COOKED = Items.AIR;
    public static final Item CLAM = Items.AIR;
    public static final Item V_REX_HIDE = Items.AIR;

    //Armor
    public static final Item V_REX_HELMET = Items.AIR;
    public static final Item V_REX_CHESTPLATE = Items.AIR;
    public static final Item V_REX_LEGGINGS = Items.AIR;
    public static final Item V_REX_BOOTS = Items.AIR;

    @SubscribeEvent
    @SuppressWarnings("unused")
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(
                prepare(new Item(), "map_fragment"),
                prepare(new ItemMysteriousMap(), "mysterious_map"),
                prepare(new ItemFood(3, false), "cabbage_palm_rhizomes"),
                prepare(new ItemSeeds(ModBlocks.CABBAGE_PALM, Blocks.FARMLAND), "cabbage_palm_seeds"),
                prepare(new Item(), "plant_fiber"),
                prepare(new ItemChancedFood(1, true, 50).addPotionEffect(MobEffects.HUNGER, 20).addPotionEffect(MobEffects.NAUSEA, 5), "invertebrate_flesh_raw"),
                prepare(new ItemFood(3, true), "invertebrate_flesh_cooked"),
                prepare(new ItemClam(), "clam"),
                prepare(new Item(), "v_rex_hide"),
                prepare(new ItemArmor(OOTF.v_rexArmorMaterial, 0, EntityEquipmentSlot.HEAD), "v_rex_helmet"),
                prepare(new ItemArmor(OOTF.v_rexArmorMaterial, 0, EntityEquipmentSlot.CHEST), "v_rex_chestplate"),
                prepare(new ItemArmor(OOTF.v_rexArmorMaterial, 0, EntityEquipmentSlot.LEGS), "v_rex_leggings"),
                prepare(new ItemArmor(OOTF.v_rexArmorMaterial, 0, EntityEquipmentSlot.FEET), "v_rex_boots")
        );
    }

    private static <T extends Item> T prepare(T item, String name)
    {
        ResourceLocation identifier = GameData.checkPrefix(name);
        item.setRegistryName(identifier);
        item.setTranslationKey(identifier.getNamespace() + ":" + identifier.getPath());
        item.setCreativeTab(OOTF.TAB_OOTF);
        return item;
    }
}

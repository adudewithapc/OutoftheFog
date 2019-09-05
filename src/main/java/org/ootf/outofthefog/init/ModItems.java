package org.ootf.outofthefog.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.registries.GameData;
import org.ootf.outofthefog.OutOfTheFog;
import org.ootf.outofthefog.item.*;
import org.ootf.outofthefog.util.Reference;

@EventBusSubscriber(modid = Reference.MOD_ID)
@ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    @ObjectHolder("map_fragment")
    public static final Item MAP_FRAGMENT = Items.AIR;

    @ObjectHolder("mysterious_map")
    public static final Item MYSTERIOUS_MAP = Items.AIR;


    @ObjectHolder("edible_fern_fiddlehead")
    public static final Item EDIBLE_FERN_FIDDLEHEAD = Items.AIR;

    @ObjectHolder("cabbage_palm_rhizomes")
    public static final Item CABBAGE_PALM_RHIZOMES = Items.AIR;

    @ObjectHolder("cabbage_palm_seeds")
    public static final Item CABBAGE_PALM_SEEDS = Items.AIR;

    @ObjectHolder("plant_fiber")
    public static final Item PLANT_FIBER = Items.AIR;

    @ObjectHolder("raw_coconut")
    public static final Item RAW_COCONUT = Items.AIR;

    @ObjectHolder("figs")
    public static final Item FIGS = Items.AIR;

    @ObjectHolder("wild_banana")
    public static final Item WILD_BANANA = Items.AIR;

    @ObjectHolder("cooked_rice")
    public static final Item COOKED_RICE = Items.AIR;

    @ObjectHolder("daikon")
    public static final Item DAIKON = Items.AIR;

    @ObjectHolder("prepared_coconut")
    public static final Item PREPARED_COCONUT = Items.AIR;


    @ObjectHolder("invertebrate_flesh_raw")
    public static final Item INVERTEBRATE_FLESH_RAW = Items.AIR;

    @ObjectHolder("invertebrate_flesh_cooked")
    public static final Item INVERTEBRATE_FLESH_COOKED = Items.AIR;

    @ObjectHolder("gamey_venison_raw")
    public static final Item GAMEY_VENISON_RAW = Items.AIR;

    @ObjectHolder("gamey_venison_cooked")
    public static final Item GAMEY_VENISON_COOKED = Items.AIR;

    @ObjectHolder("venison_raw")
    public static final Item VENISON_RAW = Items.AIR;

    @ObjectHolder("venison_cooked")
    public static final Item VENISON_COOKED = Items.AIR;

    @ObjectHolder("prime_fish_fillet_raw")
    public static final Item PRIME_FISH_FILLET_RAW = Items.AIR;

    @ObjectHolder("prime_fish_fillet_cooked")
    public static final Item PRIME_FISH_FILLET_COOKED = Items.AIR;

    @ObjectHolder("fish_fillet_raw")
    public static final Item FISH_FILLET_RAW = Items.AIR;

    @ObjectHolder("fish_fillet_cooked")
    public static final Item FISH_FILLET_COOKED = Items.AIR;

    @ObjectHolder("prime_dinosaur_meat_raw")
    public static final Item PRIME_DINOSAUR_MEAT_RAW = Items.AIR;

    @ObjectHolder("prime_dinosaur_steak")
    public static final Item PRIME_DINOSAUR_STEAK = Items.AIR;

    @ObjectHolder("dinosaur_meat_raw")
    public static final Item DINOSAUR_MEAT_RAW = Items.AIR;

    @ObjectHolder("dinosaur_steak")
    public static final Item DINOSAUR_STEAK = Items.AIR;

    @ObjectHolder("reptile_meat_raw")
    public static final Item REPTILE_MEAT_RAW = Items.AIR;

    @ObjectHolder("reptile_meat_cooked")
    public static final Item REPTILE_MEAT_COOKED = Items.AIR;

    @ObjectHolder("amphibian_meat_raw")
    public static final Item AMPHIBIAN_MEAT_RAW = Items.AIR;

    @ObjectHolder("amphibian_meat_cooked")
    public static final Item AMPHIBIAN_MEAT_COOKED = Items.AIR;


    @ObjectHolder("clam")
    public static final Item CLAM = Items.AIR;

    @ObjectHolder("v_rex_hide")
    public static final Item V_REX_HIDE = Items.AIR;

    @ObjectHolder("clam_shell")
    public static final Item CLAM_SHELL = Items.AIR;

    @ObjectHolder("pearl")
    public static final Item PEARL = Items.AIR;

    @ObjectHolder("reeds")
    public static final ItemBlock REEDS = null;

    //Armor
    @ObjectHolder("v_reX_helmet")
    public static final Item V_REX_HELMET = Items.AIR;

    @ObjectHolder("v_rex_chestplate")
    public static final Item V_REX_CHESTPLATE = Items.AIR;

    @ObjectHolder("v_rex_leggings")
    public static final Item V_REX_LEGGINGS = Items.AIR;

    @ObjectHolder("v_rex_boots")
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
                prepare(new Item(), "raw_coconut"),
                prepare(new ItemFood(1,false),"edible_fern_fiddlehead"),
                prepare(new ItemFood(2, false), "figs"),
                prepare(new ItemFood(3,false),"wild_banana"),
                prepare(new ItemFood(4,false),"cooked_rice"),
                prepare(new ItemFood(5,false),"daikon"),
                prepare(new ItemPreparedCoconut(5,false).addPotionEffect(MobEffects.REGENERATION,5),"prepared_coconut"),
                prepare(new ItemChancedFood(1, true, 50).addPotionEffect(MobEffects.HUNGER, 20).addPotionEffect(MobEffects.NAUSEA, 5), "invertebrate_flesh_raw"),
                prepare(new ItemChancedFood(3, true, 0),"gamey_venison_raw"),
                prepare(new ItemChancedFood(2, true, 0),"venison_raw"),
                prepare(new ItemChancedFood(2, true, 0), "prime_fish_fillet_raw"),
                prepare(new ItemChancedFood(4, true, 30).addPotionEffect(MobEffects.HUNGER, 25), "prime_dinosaur_meat_raw"),
                prepare(new ItemChancedFood(1, true, 0), "fish_fillet_raw"),
                prepare(new ItemChancedFood(2, true, 40).addPotionEffect(MobEffects.HUNGER, 15), "dinosaur_meat_raw"),
                prepare(new ItemChancedFood(2, true, 50).addPotionEffect(MobEffects.HUNGER, 15).addPotionEffect(MobEffects.NAUSEA, 5), "reptile_meat_raw"),
                prepare(new ItemChancedFood(1, true, 50).addPotionEffect(MobEffects.HUNGER, 15).addPotionEffect(MobEffects.NAUSEA, 5), "amphibian_meat_raw"),
                prepare(new ItemFood(3, true), "invertebrate_flesh_cooked"),
                prepare(new ItemFood(12, true), "gamey_venison_cooked"),
                prepare(new ItemFood(6, true), "venison_cooked"),
                prepare(new ItemFood(7, true), "prime_fish_fillet_cooked"),
                prepare(new ItemFood(12, true), "prime_dinosaur_steak"),
                prepare(new ItemFood(3, true), "fish_fillet_cooked"),
                prepare(new ItemFood(8, true), "dinosaur_steak"),
                prepare(new ItemFood(6, true), "reptile_meat_cooked"),
                prepare(new ItemFood(3, true), "amphibian_meat_cooked"),
                prepare(new ItemClam(), "clam"),
                prepare(new Item(), "v_rex_hide"),
                prepare(new ItemArmor(OutOfTheFog.v_rexArmorMaterial, 0, EntityEquipmentSlot.HEAD), "v_rex_helmet"),
                prepare(new ItemArmor(OutOfTheFog.v_rexArmorMaterial, 0, EntityEquipmentSlot.CHEST), "v_rex_chestplate"),
                prepare(new ItemArmor(OutOfTheFog.v_rexArmorMaterial, 0, EntityEquipmentSlot.LEGS), "v_rex_leggings"),
                prepare(new ItemArmor(OutOfTheFog.v_rexArmorMaterial, 0, EntityEquipmentSlot.FEET), "v_rex_boots"),
                prepare(new ItemClamShell(), "clam_shell"),
                prepare(new Item(), "pearl"),
                prepare(new ItemDoublePlant(ModBlocks.REEDS), "reeds")
        );
    }

    private static <T extends Item> T prepare(T item, String name)
    {
        ResourceLocation identifier = GameData.checkPrefix(name);
        item.setRegistryName(identifier);
        item.setTranslationKey(identifier.getNamespace() + ":" + identifier.getPath());
        item.setCreativeTab(OutOfTheFog.TAB_OOTF);
        return item;
    }
}

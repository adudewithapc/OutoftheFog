package org.ootf.outofthefog;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.ootf.outofthefog.init.ModDimensions;
import org.ootf.outofthefog.init.ModItems;
import org.ootf.outofthefog.init.ModVillagerProfessions;
import org.ootf.outofthefog.proxy.IProxy;

import static org.ootf.outofthefog.util.Reference.*;

@Mod(modid = MOD_ID, name = MOD_NAME, version = MOD_VERSION)
public class OutOfTheFog
{
    public static final CreativeTabs TAB_OOTF = new CreativeTabs("tabOOTF")
    {
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(ModItems.MYSTERIOUS_MAP);
        }
    };

    public static ItemArmor.ArmorMaterial v_rexArmorMaterial = EnumHelper.addArmorMaterial("v_rex_hide", MOD_ID + ":v_rex_hide", 15, new int[] {2, 5, 6, 2}, 0, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0);

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit();
    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent event)
    {
        ModDimensions.registerDimensions();
        ModVillagerProfessions.registerProfessions();

        GameRegistry.addSmelting(ModItems.INVERTEBRATE_FLESH_RAW, new ItemStack(ModItems.INVERTEBRATE_FLESH_COOKED), 0.35f);
    }

    @SidedProxy(clientSide = CLIENT_PROXY, serverSide = SERVER_PROXY)
    public static IProxy proxy;
}

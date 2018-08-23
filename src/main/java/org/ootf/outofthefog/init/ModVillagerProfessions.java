package org.ootf.outofthefog.init;

import net.minecraft.entity.IMerchant;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.fml.common.registry.VillagerRegistry.VillagerCareer;
import net.minecraftforge.fml.common.registry.VillagerRegistry.VillagerProfession;
import net.minecraftforge.registries.IForgeRegistry;
import org.ootf.outofthefog.util.Reference;
import org.ootf.outofthefog.util.ResourceHelper;

import java.util.Random;

import static net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@ObjectHolder(Reference.MOD_ID)
@EventBusSubscriber(modid = Reference.MOD_ID)
public class ModVillagerProfessions
{
    @ObjectHolder("trapper_villager")
    public static final VillagerProfession TRAPPER = null;

    public static VillagerCareer TRAPPER_CAREER;

    @SubscribeEvent
    public static void registerProfessions(RegistryEvent.Register<VillagerProfession> event)
    {
        IForgeRegistry<VillagerProfession> forgeRegistry = event.getRegistry();

        forgeRegistry.register(createProfession("trapper_villager"));
    }

    private static VillagerProfession createProfession(String professionName)
    {
        return new VillagerProfession(Reference.MOD_ID + ":" + professionName, ResourceHelper.entityTexture(professionName).toString(), ResourceHelper.entityTexture(professionName + "_zombie").toString());
    }

    public static void registerProfessions()
    {
        TRAPPER_CAREER = new VillagerCareer(TRAPPER, "trapper").addTrade(1, new TestTrade());
    }

    private static class TestTrade implements EntityVillager.ITradeList
    {
        @Override
        public void addMerchantRecipe(IMerchant merchant, MerchantRecipeList recipeList, Random random)
        {
            recipeList.add(new MerchantRecipe(new ItemStack(Items.EMERALD, 10), new ItemStack(Items.ITEM_FRAME)));
        }
    }
}

package org.ootf.outofthefog.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import java.util.HashMap;
import java.util.Map;

public class ItemPreparedCoconut extends ItemFood {

    private final Map<Potion, Integer> POTION_DURATION = new HashMap<>();

    public ItemPreparedCoconut(int amount, boolean isWolfFood)
    {
        super(amount, isWolfFood);
    }

    @Override
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
    {
        for(Potion potion : POTION_DURATION.keySet())
        {
            player.addPotionEffect(new PotionEffect(potion, POTION_DURATION.get(potion)));
        }
    }

    public ItemPreparedCoconut addPotionEffect(Potion potion, int duration)
    {
        POTION_DURATION.put(potion, duration * 5);
        return this;
    }
}

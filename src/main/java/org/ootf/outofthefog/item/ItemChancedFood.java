package org.ootf.outofthefog.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import java.util.HashMap;
import java.util.Map;

public class ItemChancedFood extends ItemFood
{
    private final Map<Potion, Integer> POTION_DURATIONS = new HashMap<>();
    private final int chance;

    public ItemChancedFood(int amount, boolean isWolfFood, int chance)
    {
        super(amount, isWolfFood);
        this.chance = chance;
    }

    @Override
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
    {
        if(!POTION_DURATIONS.isEmpty() && !worldIn.isRemote)
        {
            if(itemRand.nextInt(100) < chance)
            {
                for(Potion potion : POTION_DURATIONS.keySet())
                {
                    player.addPotionEffect(new PotionEffect(potion, POTION_DURATIONS.get(potion)));
                }
            }
        }
    }

    public ItemChancedFood addPotionEffect(Potion potion, int duration)
    {
        POTION_DURATIONS.put(potion, duration * 20);
        return this;
    }
}

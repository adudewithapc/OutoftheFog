package org.ootf.outofthefog.block;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import org.ootf.outofthefog.init.ModItems;

import java.util.Random;

public class BlockOOTFCrop extends BlockCrops
{
    private final boolean dropsfiber;

    protected BlockOOTFCrop(boolean dropsFiber)
    {
        this.dropsfiber = dropsFiber;
    }

    @Override
    public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune)
    {
        int age = getAge(state);
        Random rand = world instanceof World ? ((World)world).rand : new Random();

        int count = quantityDropped(state, fortune, rand);
        for (int i = 0; i < count; i++)
        {
            Item item = this.getItemDropped(state, rand, fortune);
            if (item != Items.AIR)
            {
                drops.add(new ItemStack(item, 1, this.damageDropped(state)));
            }
        }

        if (age >= getMaxAge())
        {
            for (int i = 0; i < 3 + fortune; ++i)
            {
                if (rand.nextInt(2 * getMaxAge()) <= age)
                {
                    drops.add(new ItemStack(this.getSeed(), 1, 0));
                    if(dropsfiber) drops.add(new ItemStack(ModItems.PLANT_FIBER));
                }
            }
        }
    }
}

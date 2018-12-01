package org.ootf.outofthefog.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class ItemClamShell extends Item
{
    public ItemClamShell()
    {
        this.setHasSubtypes(true);
    }

    @Override
    public String getTranslationKey(ItemStack stack)
    {
        return super.getTranslationKey() + (stack.getMetadata() == 1 ? "_pearl" : "");
    }

    @Override
    public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items)
    {
        if(this.isInCreativeTab(tab))
        {
            items.add(new ItemStack(this));
            items.add(new ItemStack(this, 1, 1));
        }
    }
}


package net.sawilove.meatmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.food.FoodProperties;

public class CookedchevonItem extends Item {
	public CookedchevonItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(5).saturationMod(1.5f)

				.meat().build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 1;
	}
}

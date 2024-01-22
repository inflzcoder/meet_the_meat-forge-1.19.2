
package net.sawilove.meatmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.food.FoodProperties;

public class CookedhoglinItem extends Item {
	public CookedhoglinItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(8).saturationMod(1.8f)

				.meat().build()));
	}
}

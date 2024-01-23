
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.sawilove.meatmod.init;

import net.sawilove.meatmod.item.RawchevonItem;
import net.sawilove.meatmod.item.RawchevalItem;
import net.sawilove.meatmod.item.HumidfleshItem;
import net.sawilove.meatmod.item.FroglegItem;
import net.sawilove.meatmod.item.DriedfleshItem;
import net.sawilove.meatmod.item.CookedfroglegItem;
import net.sawilove.meatmod.item.CookedchevonItem;
import net.sawilove.meatmod.item.CookedchevalItem;
import net.sawilove.meatmod.MeatmodMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

public class MeatmodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MeatmodMod.MODID);
	public static final RegistryObject<Item> RAW_CHEVON = REGISTRY.register("raw_chevon", () -> new RawchevonItem());
	public static final RegistryObject<Item> COOKED_CHEVON = REGISTRY.register("cooked_chevon", () -> new CookedchevonItem());
	public static final RegistryObject<Item> RAW_CHEVAL = REGISTRY.register("raw_cheval", () -> new RawchevalItem());
	public static final RegistryObject<Item> COOKED_CHEVAL = REGISTRY.register("cooked_cheval", () -> new CookedchevalItem());
	public static final RegistryObject<Item> FROG_LEG = REGISTRY.register("frog_leg", () -> new FroglegItem());
	public static final RegistryObject<Item> COOKED_FROG_LEG = REGISTRY.register("cooked_frog_leg", () -> new CookedfroglegItem());
	public static final RegistryObject<Item> HUMID_FLESH = REGISTRY.register("humid_flesh", () -> new HumidfleshItem());
	public static final RegistryObject<Item> DRIED_FLESH = REGISTRY.register("dried_flesh", () -> new DriedfleshItem());
}

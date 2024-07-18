package com.oddeyes3.bakublock.init;

import com.oddeyes3.bakublock.Bakublock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Bakublock.MODID);

    public static final RegistryObject<Item> RAW_PLASTIC = ITEMS.register("raw_plastic",
            ()-> new Item(new Item.Properties().stacksTo(64)));


    public static final RegistryObject<BlockItem>  Gate_Card_Item = ITEMS.register("gate_card",
            () -> new BlockItem(BlockInit.GateCard.get(), new Item.Properties().stacksTo(1)));
}

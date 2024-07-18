package com.oddeyes3.bakublock;


import com.oddeyes3.bakublock.init.BlockInit;
import com.oddeyes3.bakublock.init.ItemInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Bakublock.MODID)
public class Bakublock
{
    public static final String MODID = "bakublock";


    public Bakublock()
    {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
    }


}

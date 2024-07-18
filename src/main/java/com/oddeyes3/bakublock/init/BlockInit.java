package com.oddeyes3.bakublock.init;

import com.oddeyes3.bakublock.Bakublock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Bakublock.MODID);

    public static final RegistryObject<Block> GateCard = BLOCKS.register("gate_card",
            () -> new Block(BlockBehaviour.Properties.of().dynamicShape().noOcclusion()));





}

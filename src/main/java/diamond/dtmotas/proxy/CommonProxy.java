package diamond.dtmotas.proxy;

import diamond.dtmotas.blocks.BlockCompressedCrystal;
import diamond.dtmotas.ModBlocks;
import diamond.dtmotas.blocks.BlockOreCrystal;
import diamond.dtmotas.items.tools.ToolAxe;
import diamond.dtmotas.items.tools.ToolPickaxe;
import diamond.dtmotas.items.tools.ToolSpade;
import diamond.dtmotas.items.tools.ToolSword;
import diamond.dtmotas.world.ModWorldGen;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;


@Mod.EventBusSubscriber
public class CommonProxy {

    public void registerItemRenderer(Item item, int meta, String id) {}


    public void preInit(FMLPreInitializationEvent event) {
    }

    public void init(FMLInitializationEvent event) {
        GameRegistry.registerWorldGenerator(new ModWorldGen(), 0);

    }

    public void postInit(FMLPostInitializationEvent event) {
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(new BlockCompressedCrystal());
        event.getRegistry().register(new BlockOreCrystal());
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {

        event.getRegistry().register(new ItemBlock(ModBlocks.blockCompressedCrystal).setRegistryName(ModBlocks.blockCompressedCrystal.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.blockOreCrystal).setRegistryName(ModBlocks.blockOreCrystal.getRegistryName()));
    }
}


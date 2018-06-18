package diamond.dtmotas.proxy;

import diamond.dtmotas.world.ModWorldGen;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;



public class ServerProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent event) {

        super.preInit(event);
    }

    @Override
    public void init(FMLInitializationEvent event) {
        GameRegistry.registerWorldGenerator(new ModWorldGen(), 0);
        super.init(event);
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
    }
}

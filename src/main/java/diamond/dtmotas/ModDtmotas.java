package diamond.dtmotas;

import diamond.dtmotas.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = ModDtmotas.MODID, name = ModDtmotas.MODNAME, version = ModDtmotas.MODVERSION, dependencies = "required-after:forge@[11.16.0.1865,)", useMetadata = true)
public class ModDtmotas {

    public static final String MODID = "dtmotas";
    public static final String MODNAME = "Diamond's Testing Mod Of Testing and Such";
    public static final String MODVERSION = "0.1.0";


    @SidedProxy(clientSide = "diamond.dtmotas.proxy.ClientProxy", serverSide = "diamond.dtmotas.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static ModDtmotas instance;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
        ModCrafting.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
}

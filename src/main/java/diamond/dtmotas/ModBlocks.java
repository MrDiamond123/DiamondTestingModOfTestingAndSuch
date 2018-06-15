package diamond.dtmotas;

import net.minecraftforge.fml.common.registry.GameRegistry;
import diamond.dtmotas.blocks.*;

public class ModBlocks {

    @GameRegistry.ObjectHolder("dtmotas:blockcompressedcrystal")
    public static BlockCompressedCrystal blockCompressedCrystal;

    public static void initModels() {
        blockCompressedCrystal.initModel();
    }

}

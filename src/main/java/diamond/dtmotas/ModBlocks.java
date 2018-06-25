package diamond.dtmotas;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;
import diamond.dtmotas.blocks.*;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<Block>();


    @GameRegistry.ObjectHolder("dtmotas:blockcompressedcrystal")
    public static BlockCompressedCrystal blockCompressedCrystal;
    @GameRegistry.ObjectHolder("dtmotas:blockorecrystal")
    public static BlockOreCrystal blockOreCrystal;

    public static void initModels() {
        blockCompressedCrystal.initModel();
        blockOreCrystal.initModel();
    }

}

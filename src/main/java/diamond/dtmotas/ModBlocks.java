package diamond.dtmotas;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import diamond.dtmotas.blocks.*;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block CRYSTAL_COMPRESSED_BLOCK = new BlockBase("blockcompressedcrystel", Material.ROCK);
    public static final Block CRYSTAL_ORE = new BlockOreCrystal("blockcrystalore", Material.IRON);

}

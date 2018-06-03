package diamond.dtmotas.blocks;

import diamond.dtmotas.ModDtmotas;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockCompressedCrystal extends Block {

    public BlockCompressedCrystal(){
        super(Material.ROCK);
        setUnlocalizedName(ModDtmotas.MODID + ".blockcompressedcrystal");
        setRegistryName("blockcompressedcrystal");
    }

}

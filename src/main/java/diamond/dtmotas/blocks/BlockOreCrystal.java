package diamond.dtmotas.blocks;


import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;


public class BlockOreCrystal extends BlockBase {

    public BlockOreCrystal(String name, Material material) {
        super(name, material);

        setHardness(20.0F);
        setResistance(30.0F);
        setHarvestLevel("pickaxe", 3);
        setSoundType(SoundType.STONE);
        setLightLevel(1.0F);

    }
}
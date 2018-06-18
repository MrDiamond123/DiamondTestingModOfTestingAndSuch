package diamond.dtmotas.world;

import diamond.dtmotas.ModBlocks;
import diamond.dtmotas.configuration.ModConfig;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DimensionType;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;


import java.util.Random;

public class ModWorldGen implements IWorldGenerator {

    @Override
    public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        if (ModConfig.oreChance > 0 && ModConfig.oreVeinSize > 0 && world.provider.getDimensionType() == DimensionType.OVERWORLD) {
            WorldGenMinable generator = new WorldGenMinable(ModBlocks.blockOreCrystal.getDefaultState(), rand.nextInt(ModConfig.oreVeinSize));
            int yDiff = ModConfig.oreMaxY - ModConfig.oreMinY + 1;
            for (int i = 0; i < ModConfig.oreChance; i++) {
                generator.generate(world, rand, new BlockPos(
                        (chunkX << 4) + rand.nextInt(16),
                        ModConfig.oreMinY + rand.nextInt(yDiff),
                        (chunkZ << 4) + rand.nextInt(16)
                ));
            }
        }
    }
}

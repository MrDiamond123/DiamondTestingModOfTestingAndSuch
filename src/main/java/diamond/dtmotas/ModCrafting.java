package diamond.dtmotas;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {
   public static void init(){
       GameRegistry.addSmelting(ModBlocks.CRYSTAL_ORE, new ItemStack(ModItems.CRYSTAL, 1), 2f);
   }
}

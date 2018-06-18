package diamond.dtmotas;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {
   public static void init(){
       GameRegistry.addSmelting(ModBlocks.blockOreCrystal, new ItemStack(ModItems.itemCrystal, 1), 2f);
   }
}

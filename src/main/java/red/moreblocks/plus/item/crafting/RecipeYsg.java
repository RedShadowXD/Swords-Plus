
package red.moreblocks.plus.item.crafting;

import red.moreblocks.plus.item.ItemToad;
import red.moreblocks.plus.item.ItemBread;
import red.moreblocks.plus.ElementsMbPlusMod;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@ElementsMbPlusMod.ModElement.Tag
public class RecipeYsg extends ElementsMbPlusMod.ModElement {
	public RecipeYsg(ElementsMbPlusMod instance) {
		super(instance, 258);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemBread.block, (int) (1)), new ItemStack(ItemToad.block, (int) (1)), 2F);
	}
}

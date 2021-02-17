
package red.moreblocks.plus.item.crafting;

import red.moreblocks.plus.item.ItemObsidianIngot;
import red.moreblocks.plus.block.BlockObsidianOre;
import red.moreblocks.plus.ElementsMbPlusMod;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@ElementsMbPlusMod.ModElement.Tag
public class RecipeObsidianOreSmelting extends ElementsMbPlusMod.ModElement {
	public RecipeObsidianOreSmelting(ElementsMbPlusMod instance) {
		super(instance, 130);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockObsidianOre.block, (int) (1)), new ItemStack(ItemObsidianIngot.block, (int) (1)), 2.8F);
	}
}


package red.shadow.swords.item.crafting;

import red.shadow.swords.item.ItemLightIngot;
import red.shadow.swords.block.BlockLightOre;
import red.shadow.swords.ElementsSwordPlusMod;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@ElementsSwordPlusMod.ModElement.Tag
public class RecipeLightOreSmelting extends ElementsSwordPlusMod.ModElement {
	public RecipeLightOreSmelting(ElementsSwordPlusMod instance) {
		super(instance, 19);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockLightOre.block, (int) (1)), new ItemStack(ItemLightIngot.block, (int) (1)), 4F);
	}
}

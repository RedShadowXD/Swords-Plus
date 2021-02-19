
package red.shadow.swords.item.crafting;

import red.shadow.swords.item.ItemLightshard;
import red.shadow.swords.item.ItemLightIngot;
import red.shadow.swords.ElementsSwordPlusMod;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@ElementsSwordPlusMod.ModElement.Tag
public class RecipeMotelm extends ElementsSwordPlusMod.ModElement {
	public RecipeMotelm(ElementsSwordPlusMod instance) {
		super(instance, 25);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemLightshard.block, (int) (1)), new ItemStack(ItemLightIngot.block, (int) (1)), 0F);
	}
}

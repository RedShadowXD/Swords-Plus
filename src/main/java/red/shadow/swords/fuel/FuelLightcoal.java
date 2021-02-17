
package red.shadow.swords.fuel;

import red.shadow.swords.item.ItemLightshard;
import red.shadow.swords.ElementsSwordPlusMod;

import net.minecraft.item.ItemStack;

@ElementsSwordPlusMod.ModElement.Tag
public class FuelLightcoal extends ElementsSwordPlusMod.ModElement {
	public FuelLightcoal(ElementsSwordPlusMod instance) {
		super(instance, 22);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(ItemLightshard.block, (int) (1)).getItem())
			return 1800;
		return 0;
	}
}

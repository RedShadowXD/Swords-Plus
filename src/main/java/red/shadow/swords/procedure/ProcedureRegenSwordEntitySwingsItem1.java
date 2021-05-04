package red.shadow.swords.procedure;

import red.shadow.swords.ElementsSwordPlusMod;

import net.minecraft.item.ItemStack;

import java.util.Random;
import java.util.Map;

@ElementsSwordPlusMod.ModElement.Tag
public class ProcedureRegenSwordEntitySwingsItem1 extends ElementsSwordPlusMod.ModElement {
	public ProcedureRegenSwordEntitySwingsItem1(ElementsSwordPlusMod instance) {
		super(instance, 72);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure RegenSwordEntitySwingsItem1!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		{
			ItemStack _ist = (itemstack);
			if (_ist.attemptDamageItem((int) 5, new Random(), null)) {
				_ist.shrink(1);
				_ist.setItemDamage(0);
			}
		}
	}
}

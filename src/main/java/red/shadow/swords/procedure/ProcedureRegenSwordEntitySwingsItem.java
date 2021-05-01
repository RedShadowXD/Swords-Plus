package red.shadow.swords.procedure;

import red.shadow.swords.ElementsSwordPlusMod;

import net.minecraft.potion.PotionEffect;
import net.minecraft.item.ItemStack;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import java.util.Random;
import java.util.Map;

@ElementsSwordPlusMod.ModElement.Tag
public class ProcedureRegenSwordEntitySwingsItem extends ElementsSwordPlusMod.ModElement {
	public ProcedureRegenSwordEntitySwingsItem(ElementsSwordPlusMod instance) {
		super(instance, 69);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure RegenSwordEntitySwingsItem!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure RegenSwordEntitySwingsItem!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.REGENERATION, (int) 100, (int) 1, (false), (false)));
		{
			ItemStack _ist = (itemstack);
			if (_ist.attemptDamageItem((int) 5, new Random(), null)) {
				_ist.shrink(1);
				_ist.setItemDamage(0);
			}
		}
	}
}

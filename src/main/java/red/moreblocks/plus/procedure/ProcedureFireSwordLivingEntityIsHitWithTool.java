package red.moreblocks.plus.procedure;

import red.moreblocks.plus.ElementsMbPlusMod;

import net.minecraft.util.DamageSource;
import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import java.util.Map;

@ElementsMbPlusMod.ModElement.Tag
public class ProcedureFireSwordLivingEntityIsHitWithTool extends ElementsMbPlusMod.ModElement {
	public ProcedureFireSwordLivingEntityIsHitWithTool(ElementsMbPlusMod instance) {
		super(instance, 180);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure FireSwordLivingEntityIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.GLOWING, (int) 90, (int) 1, (false), (false)));
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.POISON, (int) 70, (int) 3, (false), (false)));
		entity.attackEntityFrom(DamageSource.ON_FIRE, (float) 4);
	}
}

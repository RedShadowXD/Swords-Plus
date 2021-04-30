package red.shadow.swords.procedure;

import red.shadow.swords.ElementsSwordPlusMod;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import java.util.Map;

@ElementsSwordPlusMod.ModElement.Tag
public class ProcedureNetherSwordToolInHandTick extends ElementsSwordPlusMod.ModElement {
	public ProcedureNetherSwordToolInHandTick(ElementsSwordPlusMod instance) {
		super(instance, 58);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure NetherSwordToolInHandTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, (int) 20, (int) 1));
	}
}

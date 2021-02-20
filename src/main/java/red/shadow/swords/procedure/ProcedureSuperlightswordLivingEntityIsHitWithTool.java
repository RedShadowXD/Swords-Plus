package red.shadow.swords.procedure;

import red.shadow.swords.ElementsSwordPlusMod;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import java.util.Map;

@ElementsSwordPlusMod.ModElement.Tag
public class ProcedureSuperlightswordLivingEntityIsHitWithTool extends ElementsSwordPlusMod.ModElement {
	public ProcedureSuperlightswordLivingEntityIsHitWithTool(ElementsSwordPlusMod instance) {
		super(instance, 51);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure SuperlightswordLivingEntityIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.LIGHTNING_BOLT, (float) 3);
	}
}

package red.moreblocks.plus.procedure;

import red.moreblocks.plus.ElementsMbPlusMod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import java.util.Map;

@ElementsMbPlusMod.ModElement.Tag
public class ProcedureDragonArmorBody extends ElementsMbPlusMod.ModElement {
	public ProcedureDragonArmorBody(ElementsMbPlusMod instance) {
		super(instance, 162);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure DragonArmorBody!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getTotalArmorValue() : 0) > 2)
				&& (entity instanceof EntityPlayer))) {
			if (entity instanceof EntityPlayer) {
				((EntityPlayer) entity).capabilities.allowFlying = (true);
				((EntityPlayer) entity).sendPlayerAbilities();
			}
		} else {
			if (entity instanceof EntityPlayer) {
				((EntityPlayer) entity).capabilities.allowFlying = (false);
				((EntityPlayer) entity).sendPlayerAbilities();
			}
		}
	}
}

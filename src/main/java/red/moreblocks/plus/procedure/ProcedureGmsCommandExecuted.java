package red.moreblocks.plus.procedure;

import red.moreblocks.plus.ElementsMbPlusMod;

import net.minecraft.world.GameType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import java.util.Map;

@ElementsMbPlusMod.ModElement.Tag
public class ProcedureGmsCommandExecuted extends ElementsMbPlusMod.ModElement {
	public ProcedureGmsCommandExecuted(ElementsMbPlusMod instance) {
		super(instance, 252);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure GmsCommandExecuted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).setGameType(GameType.SURVIVAL);
	}
}

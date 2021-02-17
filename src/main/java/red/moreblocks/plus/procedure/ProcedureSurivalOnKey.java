package red.moreblocks.plus.procedure;

import red.moreblocks.plus.ElementsMbPlusMod;

import net.minecraft.world.GameType;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import java.util.Map;

@ElementsMbPlusMod.ModElement.Tag
public class ProcedureSurivalOnKey extends ElementsMbPlusMod.ModElement {
	public ProcedureSurivalOnKey(ElementsMbPlusMod instance) {
		super(instance, 201);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure SurivalOnKey!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity.canUseCommand((int) 4, ""))) {
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString("Game Mode set to surival"), (true));
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).setGameType(GameType.SURVIVAL);
		}
	}
}

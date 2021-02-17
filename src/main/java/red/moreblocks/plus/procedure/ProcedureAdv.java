package red.moreblocks.plus.procedure;

import red.moreblocks.plus.ElementsMbPlusMod;

import net.minecraft.util.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import java.util.Map;
import java.util.Iterator;

@ElementsMbPlusMod.ModElement.Tag
public class ProcedureAdv extends ElementsMbPlusMod.ModElement {
	public ProcedureAdv(ElementsMbPlusMod instance) {
		super(instance, 151);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Adv!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(Blocks.MAGMA, (int) (1))) : false)) {
			if (entity instanceof EntityPlayerMP) {
				Advancement _adv = ((MinecraftServer) ((EntityPlayerMP) entity).mcServer).getAdvancementManager()
						.getAdvancement(new ResourceLocation("mb_plus:shinyadv"));
				AdvancementProgress _ap = ((EntityPlayerMP) entity).getAdvancements().getProgress(_adv);
				if (!_ap.isDone()) {
					Iterator _iterator = _ap.getRemaningCriteria().iterator();
					while (_iterator.hasNext()) {
						String _criterion = (String) _iterator.next();
						((EntityPlayerMP) entity).getAdvancements().grantCriterion(_adv, _criterion);
					}
				}
			}
		}
	}
}

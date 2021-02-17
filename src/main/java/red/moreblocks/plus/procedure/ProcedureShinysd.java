package red.moreblocks.plus.procedure;

import red.moreblocks.plus.ElementsMbPlusMod;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.WorldServer;
import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import java.util.Map;
import java.util.Iterator;

@ElementsMbPlusMod.ModElement.Tag
public class ProcedureShinysd extends ElementsMbPlusMod.ModElement {
	public ProcedureShinysd(ElementsMbPlusMod instance) {
		super(instance, 152);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Shinysd!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		for (int index0 = 0; index0 < (int) (1000); index0++) {
			if ((((entity instanceof EntityPlayerMP) && ((entity).world instanceof WorldServer))
					? ((EntityPlayerMP) entity).getAdvancements()
							.getProgress(
									((WorldServer) (entity).world).getAdvancementManager().getAdvancement(new ResourceLocation("mb_plus:shinyadv")))
							.isDone()
					: false)) {
			} else {
				if (((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getTotalArmorValue() : 0) > 1)
						&& (entity instanceof EntityPlayer))) {
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
	}

	@SubscribeEvent
	public void onItemCrafted(net.minecraftforge.fml.common.gameevent.PlayerEvent.ItemCraftedEvent event) {
		Entity entity = event.player;
		World world = entity.world;
		int i = (int) entity.posX;
		int j = (int) entity.posY;
		int k = (int) entity.posZ;
		ItemStack itemStack = event.crafting;
		java.util.HashMap<String, Object> dependencies = new java.util.HashMap<>();
		dependencies.put("x", i);
		dependencies.put("y", j);
		dependencies.put("z", k);
		dependencies.put("world", world);
		dependencies.put("entity", entity);
		dependencies.put("itemstack", itemStack);
		dependencies.put("event", event);
		this.executeProcedure(dependencies);
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(this);
	}
}

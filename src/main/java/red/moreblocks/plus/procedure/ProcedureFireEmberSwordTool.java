package red.moreblocks.plus.procedure;

import red.moreblocks.plus.ElementsMbPlusMod;

import net.minecraft.world.WorldServer;
import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.init.Blocks;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import java.util.Map;
import java.util.Iterator;

@ElementsMbPlusMod.ModElement.Tag
public class ProcedureFireEmberSwordTool extends ElementsMbPlusMod.ModElement {
	public ProcedureFireEmberSwordTool(ElementsMbPlusMod instance) {
		super(instance, 187);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure FireEmberSwordTool!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure FireEmberSwordTool!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure FireEmberSwordTool!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure FireEmberSwordTool!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure FireEmberSwordTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((((entity instanceof EntityPlayerMP) && ((entity).world instanceof WorldServer))
				? ((EntityPlayerMP) entity).getAdvancements()
						.getProgress(((WorldServer) (entity).world).getAdvancementManager()
								.getAdvancement(new ResourceLocation("mb_plus:firemeberswordsadv")))
						.isDone()
				: false)) {
			if ((Math.random() < 0.4)) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.FIRE.getDefaultState(), 3);
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, (int) 40, (int) 1, (false), (false)));
			}
		} else {
			if (entity instanceof EntityPlayerMP) {
				Advancement _adv = ((MinecraftServer) ((EntityPlayerMP) entity).mcServer).getAdvancementManager()
						.getAdvancement(new ResourceLocation("mb_plus:firemeberswordsadv"));
				AdvancementProgress _ap = ((EntityPlayerMP) entity).getAdvancements().getProgress(_adv);
				if (!_ap.isDone()) {
					Iterator _iterator = _ap.getRemaningCriteria().iterator();
					while (_iterator.hasNext()) {
						String _criterion = (String) _iterator.next();
						((EntityPlayerMP) entity).getAdvancements().grantCriterion(_adv, _criterion);
					}
				}
			}
			System.out.println("FIRE FIRE FIRE");
		}
	}
}

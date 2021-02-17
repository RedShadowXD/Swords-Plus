package red.shadow.swords.procedure;

import red.shadow.swords.ElementsSwordPlusMod;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.DamageSource;
import net.minecraft.init.Blocks;
import net.minecraft.entity.Entity;

import java.util.Map;

@ElementsSwordPlusMod.ModElement.Tag
public class ProcedureFireInnerSwordLivingEntityIsHitWithTool extends ElementsSwordPlusMod.ModElement {
	public ProcedureFireInnerSwordLivingEntityIsHitWithTool(ElementsSwordPlusMod instance) {
		super(instance, 36);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure FireInnerSwordLivingEntityIsHitWithTool!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure FireInnerSwordLivingEntityIsHitWithTool!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure FireInnerSwordLivingEntityIsHitWithTool!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure FireInnerSwordLivingEntityIsHitWithTool!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure FireInnerSwordLivingEntityIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		entity.attackEntityFrom(DamageSource.IN_FIRE, (float) 2);
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.FIRE.getDefaultState(), 3);
	}
}

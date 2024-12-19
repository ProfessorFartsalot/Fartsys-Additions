package com.firehostredux.fartsysadditions.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.registries.Registries;

import com.firehostredux.fartsysadditions.FartsysmagitechfantasyMod;

public class LyziCookieProjectileHitsLivingEntityProcedure {
	public static boolean execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return false;
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == entity) {
			return false;
		} else {
			sourceentity.startRiding(entity);
			FartsysmagitechfantasyMod.queueServerWork(200, () -> {
				sourceentity.stopRiding();
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, (entity.getX()), (entity.getY()), (entity.getZ()), 0, Level.ExplosionInteraction.MOB);
				entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.PLAYER_EXPLOSION)), Mth.nextInt(RandomSource.create(), 10, 25));
			});
		}
		return false;
	}
}

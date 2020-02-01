package io.github.cadiboo.examplemod.entity;

import io.github.cadiboo.examplemod.init.ModEntityTypes;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.world.World;

/**
 * A Wild Boar entity.
 * Literally just a pig (with a different texture).
 * TODO: Will have more stuff added to it soon.
 *
 * @author Cadiboo
 */
public class WildBoarEntity extends PigEntity {

	public WildBoarEntity(final EntityType<? extends WildBoarEntity> entityType, final World world) {
		super(entityType, world);
	}

	public WildBoarEntity(final World world) {
		super(ModEntityTypes.WILD_BOAR.get(), world);
	}

	@Override
	public WildBoarEntity createChild(AgeableEntity parent) {
		return ModEntityTypes.WILD_BOAR.get().create(this.world);
	}

}

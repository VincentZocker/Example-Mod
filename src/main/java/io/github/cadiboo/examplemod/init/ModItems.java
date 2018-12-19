package io.github.cadiboo.examplemod.init;

import io.github.cadiboo.examplemod.item.ItemExampleIngot;
import io.github.cadiboo.examplemod.item.ItemExampleItem;
import io.github.cadiboo.examplemod.util.ModReference;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

/**
 * Item Instances class
 * All the items in here will be public static final and null as their values will be filled by the magical @ObjectHolder
 *
 * @author Cadiboo
 */
@ObjectHolder(ModReference.MOD_ID)
public final class ModItems {

	public static final ItemExampleItem EXAMPLE_ITEM = null;
	public static final ItemExampleIngot EXAMPLE_INGOT = null;

}

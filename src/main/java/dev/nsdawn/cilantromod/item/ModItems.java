package dev.nsdawn.cilantromod.item;

import dev.nsdawn.cilantromod.CilantroMod;
import dev.nsdawn.cilantromod.block.ModBlocks;
import dev.nsdawn.cilantromod.item.items.CilantroItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item CILANTRO = registerItem("cilantro", new CilantroItem(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(1).saturationModifier(0.3F).build())
    ));

    public static final Item CORIANDER_SEEDS = registerItem("coriander_seeds", new AliasedBlockItem(ModBlocks.CILANTRO_CROP, new FabricItemSettings()));


    private static void addItemsToItemGroupFoodAndDrink(FabricItemGroupEntries entries) {
        final Item[] items = new Item[] {
                CILANTRO,
        };
        for (Item item : items) {
            entries.add(item);
        }
    }
    private static void addItemsToItemGroupNatural(FabricItemGroupEntries entries) {
        final Item[] items = new Item[] {
                CORIANDER_SEEDS,
        };
        for (Item item : items) {
            entries.add(item);
        }
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CilantroMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CilantroMod.LOGGER.info("Registering Mod Items for " + CilantroMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToItemGroupFoodAndDrink);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModItems::addItemsToItemGroupNatural);
    }
}

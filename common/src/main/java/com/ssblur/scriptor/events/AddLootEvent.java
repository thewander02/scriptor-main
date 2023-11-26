package com.ssblur.scriptor.events;

import com.ssblur.scriptor.helpers.loot.ArtifactItemFunction;
import com.ssblur.scriptor.item.ScriptorItems;
import dev.architectury.event.events.common.LootEvent;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.LootDataManager;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.LootItemFunction;
import net.minecraft.world.level.storage.loot.functions.LootItemFunctionType;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;

public class AddLootEvent implements LootEvent.ModifyLootTable {

  record LootItemRecord(ResourceLocation location, float chance, LootItemFunction.Builder... builders) {}

  static HashMap<RegistrySupplier<Item>, LootItemRecord[]> pools = new HashMap<>();

  static {
    LootItemRecord[] tier1 = new LootItemRecord[]{
      new LootItemRecord(new ResourceLocation("minecraft", "chests/village/village_plains_house"), 0.2f),
      new LootItemRecord(new ResourceLocation("minecraft", "chests/village/village_snowy_house"), 0.2f),
      new LootItemRecord(new ResourceLocation("minecraft", "chests/village/village_temple"), 0.2f),
      new LootItemRecord(new ResourceLocation("minecraft", "chests/igloo_chest"), 0.2f),
      new LootItemRecord(new ResourceLocation("minecraft", "chests/spawn_bonus_chest"), 1f),
      new LootItemRecord(new ResourceLocation("minecraft", "chests/shipwreck_treasure"), 0.6f),
      new LootItemRecord(new ResourceLocation("minecraft", "chests/abandoned_mineshaft"), 0.6f),
      new LootItemRecord(new ResourceLocation("minecraft", "chests/ruined_portal"), 0.3f),
      new LootItemRecord(new ResourceLocation("minecraft", "chests/simple_dungeon"), 0.6f),
    };
    pools.put(ScriptorItems.TOME_TIER1, tier1);
    pools.put(ScriptorItems.SCRAP_TIER1, tier1);

    LootItemRecord[] tier2 = new LootItemRecord[]{
      new LootItemRecord(new ResourceLocation("minecraft", "chests/woodland_mansion"), 0.3f),
      new LootItemRecord(new ResourceLocation("minecraft", "chests/bastion_other"), 0.6f),
      new LootItemRecord(new ResourceLocation("minecraft", "chests/bastion_bridge"), 0.6f),
      new LootItemRecord(new ResourceLocation("minecraft", "chests/underwater_ruin_big"), 0.6f),
      new LootItemRecord(new ResourceLocation("minecraft", "chests/underwater_ruin_small"), 0.6f),
      new LootItemRecord(new ResourceLocation("minecraft", "chests/stronghold_corridor"), 0.4f),
      new LootItemRecord(new ResourceLocation("minecraft", "chests/nether_bridge"), 0.6f),
      new LootItemRecord(new ResourceLocation("minecraft", "chests/stronghold_crossing"), 0.6f),
      new LootItemRecord(new ResourceLocation("minecraft", "chests/shipwreck_supply"), 0.4f),
      new LootItemRecord(new ResourceLocation("minecraft", "chests/shipwreck_treasure"), 0.8f),
      new LootItemRecord(new ResourceLocation("minecraft", "chests/ancient_city"), 0.8f),
      new LootItemRecord(new ResourceLocation("minecraft", "chests/ancient_city_ice_box"), 0.6f),
    };
    pools.put(ScriptorItems.TOME_TIER2, tier2);
    pools.put(ScriptorItems.SCRAP_TIER2, tier2);

    LootItemRecord[] tier3 = new LootItemRecord[]{
      new LootItemRecord(new ResourceLocation("minecraft", "chests/stronghold_library"), 1f),
      new LootItemRecord(new ResourceLocation("minecraft", "gameplay/hero_of_the_village/librarian_gift"), 1f),
      new LootItemRecord(new ResourceLocation("minecraft", "chests/bastion_other"), 0.6f),
      new LootItemRecord(new ResourceLocation("minecraft", "chests/bastion_bridge"), 0.6f),
      new LootItemRecord(new ResourceLocation("minecraft", "chests/woodland_mansion"), 0.6f),
      new LootItemRecord(new ResourceLocation("minecraft", "entities/wither"), 1f),
      new LootItemRecord(new ResourceLocation("minecraft", "chests/ancient_city"), 0.8f),
      new LootItemRecord(new ResourceLocation("minecraft", "chests/ancient_city_ice_box"), 0.6f),
      new LootItemRecord(new ResourceLocation("minecraft", "chests/nether_bridge"), 0.6f),
    };
    pools.put(ScriptorItems.TOME_TIER3, tier3);
    pools.put(ScriptorItems.SCRAP_TIER3, tier3);

    pools.put(
      ScriptorItems.TOME_TIER4,
      new LootItemRecord[]{
        new LootItemRecord(new ResourceLocation("minecraft", "entities/ender_dragon"), 1f),
        new LootItemRecord(new ResourceLocation("minecraft", "chests/end_city_treasure"), 0.9f),
      }
    );

    pools.put(
      ScriptorItems.IDENTIFY_SCROLL,
      new LootItemRecord[]{
        new LootItemRecord(new ResourceLocation("minecraft", "chests/end_city_treasure"), 0.3f),
        new LootItemRecord(new ResourceLocation("minecraft", "chests/bastion_other"), 0.3f),
        new LootItemRecord(new ResourceLocation("minecraft", "chests/bastion_bridge"), 0.3f),
        new LootItemRecord(new ResourceLocation("minecraft", "chests/woodland_mansion"), 0.3f),
        new LootItemRecord(new ResourceLocation("minecraft", "chests/stronghold_library"), 0.3f),
        new LootItemRecord(new ResourceLocation("minecraft", "chests/ancient_city"), 0.3f),
        new LootItemRecord(new ResourceLocation("minecraft", "chests/ancient_city_ice_box"), 0.3f),
        new LootItemRecord(new ResourceLocation("minecraft", "chests/nether_bridge"), 0.3f),
        new LootItemRecord(new ResourceLocation("minecraft", "chests/stronghold_crossing"), 0.3f),
        new LootItemRecord(new ResourceLocation("minecraft", "chests/shipwreck_supply"), 0.3f),
        new LootItemRecord(new ResourceLocation("minecraft", "chests/village/village_plains_house"), 0.2f),
        new LootItemRecord(new ResourceLocation("minecraft", "chests/village/village_snowy_house"), 0.2f),
        new LootItemRecord(new ResourceLocation("minecraft", "chests/village/village_temple"), 0.2f),
        new LootItemRecord(new ResourceLocation("minecraft", "chests/igloo_chest"), 0.3f),
        new LootItemRecord(new ResourceLocation("minecraft", "chests/spawn_bonus_chest"), 1f),
        new LootItemRecord(new ResourceLocation("minecraft", "chests/shipwreck_treasure"), 0.3f),
        new LootItemRecord(new ResourceLocation("minecraft", "chests/abandoned_mineshaft"), 0.3f),
        new LootItemRecord(new ResourceLocation("minecraft", "chests/ruined_portal"), 0.3f),
        new LootItemRecord(new ResourceLocation("minecraft", "chests/simple_dungeon"), 0.3f),
        new LootItemRecord(new ResourceLocation("minecraft", "entities/witch"), 0.05f),
      }
    );

    float numberOfArtifacts = 4f;
    LootItemRecord[] artifacts = new LootItemRecord[]{
      new LootItemRecord(new ResourceLocation("minecraft", "chests/end_city_treasure"), 0.05f / numberOfArtifacts, ArtifactItemFunction::new),
      new LootItemRecord(new ResourceLocation("minecraft", "chests/stronghold_library"), 0.05f / numberOfArtifacts, ArtifactItemFunction::new),
      new LootItemRecord(new ResourceLocation("minecraft", "chests/bastion_other"), 0.05f / numberOfArtifacts, ArtifactItemFunction::new),
      new LootItemRecord(new ResourceLocation("minecraft", "chests/bastion_bridge"), 0.05f / numberOfArtifacts, ArtifactItemFunction::new),
      new LootItemRecord(new ResourceLocation("minecraft", "chests/woodland_mansion"), 0.1f / numberOfArtifacts, ArtifactItemFunction::new),
      new LootItemRecord(new ResourceLocation("minecraft", "chests/ancient_city"), 0.1f / numberOfArtifacts, ArtifactItemFunction::new),
      new LootItemRecord(new ResourceLocation("minecraft", "chests/ancient_city_ice_box"), 0.1f / numberOfArtifacts, ArtifactItemFunction::new),
      new LootItemRecord(new ResourceLocation("minecraft", "chests/nether_bridge"), 0.05f / numberOfArtifacts, ArtifactItemFunction::new),
      new LootItemRecord(new ResourceLocation("minecraft", "chests/ocean_ruin_warm"), 0.1f / numberOfArtifacts, ArtifactItemFunction::new),
      new LootItemRecord(new ResourceLocation("minecraft", "chests/ocean_ruin_cold"), 0.1f / numberOfArtifacts, ArtifactItemFunction::new),
      new LootItemRecord(new ResourceLocation("minecraft", "chests/desert_pyramid"), 0.1f / numberOfArtifacts, ArtifactItemFunction::new),
    };
    pools.put(ScriptorItems.ARTIFACT_1, artifacts);
    pools.put(ScriptorItems.ARTIFACT_2, artifacts);
    pools.put(ScriptorItems.ARTIFACT_3, artifacts);
    pools.put(ScriptorItems.ARTIFACT_4, artifacts);
  }

  @Override
  public void modifyLootTable(@Nullable LootDataManager lootTables, ResourceLocation id, LootEvent.LootTableModificationContext context, boolean builtin) {
    if(builtin) {
      for(var pool: pools.keySet())
        for(var i: pools.get(pool))
          if(id.equals(i.location)) {
            LootPool.Builder builder = LootPool.lootPool();
            builder.when(LootItemRandomChanceCondition.randomChance(i.chance));
            builder.add(LootItem.lootTableItem(pool.get()));
            for(var b: i.builders)
              builder.apply(b);

            context.addPool(builder);
          }
    }
  }
}

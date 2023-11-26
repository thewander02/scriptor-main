package com.ssblur.scriptor.blockentity;

import com.ssblur.scriptor.ScriptorMod;
import com.ssblur.scriptor.block.CastingLecternBlock;
import com.ssblur.scriptor.block.RuneBlock;
import com.ssblur.scriptor.block.ScriptorBlocks;
import com.ssblur.scriptor.blockentity.renderers.CastingLecternBlockEntityRenderer;
import com.ssblur.scriptor.blockentity.renderers.ChalkBlockEntityRenderer;
import com.ssblur.scriptor.blockentity.renderers.LightBlockEntityRenderer;
import com.ssblur.scriptor.blockentity.renderers.RuneBlockEntityRenderer;
import dev.architectury.platform.Platform;
import dev.architectury.registry.client.rendering.BlockEntityRendererRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.fabricmc.api.EnvType;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;

@SuppressWarnings("ConstantConditions")
public class ScriptorBlockEntities {
  public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ScriptorMod.MOD_ID, Registries.BLOCK_ENTITY_TYPE);

  public static final RegistrySupplier<BlockEntityType<RuneBlockEntity>> RUNE = BLOCK_ENTITIES.register(
    "rune",
    () -> BlockEntityType.Builder.of(RuneBlockEntity::new, ScriptorBlocks.RUNE.get()).build(null)
  );

  public static final RegistrySupplier<BlockEntityType<LightBlockEntity>> LIGHT = BLOCK_ENTITIES.register(
    "light",
    () -> BlockEntityType.Builder.of(LightBlockEntity::new, ScriptorBlocks.LIGHT.get()).build(null)
  );

  public static final RegistrySupplier<BlockEntityType<ChalkBlockEntity>> CHALK = BLOCK_ENTITIES.register(
    "chalk",
    () -> BlockEntityType.Builder.of(ChalkBlockEntity::new, ScriptorBlocks.CHALK.get()).build(null)
  );

  public static final RegistrySupplier<BlockEntityType<CastingLecternBlockEntity>> CASTING_LECTERN = BLOCK_ENTITIES.register(
    "casting_lectern",
    () -> BlockEntityType.Builder.of(CastingLecternBlockEntity::new, ScriptorBlocks.CASTING_LECTERN.get()).build(null)
  );

  public static void register() {
    BLOCK_ENTITIES.register();

    if(!Platform.isForge() && Platform.getEnv() == EnvType.CLIENT) registerRenderers();
  }

  public static void registerRenderers() {
    BlockEntityRendererRegistry.register(RUNE.get(), RuneBlockEntityRenderer::new);
    BlockEntityRendererRegistry.register(CHALK.get(), ChalkBlockEntityRenderer::new);
    BlockEntityRendererRegistry.register(CASTING_LECTERN.get(), CastingLecternBlockEntityRenderer::new);
    BlockEntityRendererRegistry.register(LIGHT.get(), LightBlockEntityRenderer::new);
  }

}

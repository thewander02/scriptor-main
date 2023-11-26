package com.ssblur.scriptor.registry.colorable;

import com.ssblur.scriptor.block.ScriptorBlocks;
import com.ssblur.scriptor.color.DyeColorableBlock;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Blocks;

public class DyeColorableBlocks {
  public final DyeColorableBlock WOOL = new DyeColorableBlock();
  public final DyeColorableBlock CARPET = new DyeColorableBlock();
  public final DyeColorableBlock TERRACOTTA = new DyeColorableBlock();
  public final DyeColorableBlock GLAZED_TERRACOTTA = new DyeColorableBlock();
  public final DyeColorableBlock STAINED_GLASS = new DyeColorableBlock();
  public final DyeColorableBlock STAINED_GLASS_PANE = new DyeColorableBlock();
  public final DyeColorableBlock CONCRETE_POWDER = new DyeColorableBlock();
  public final DyeColorableBlock CONCRETE = new DyeColorableBlock();
  public final DyeColorableBlock CANDLE = new DyeColorableBlock();
  public final DyeColorableBlock BED = new DyeColorableBlock();
  public final DyeColorableBlock SHULKER_BOX = new DyeColorableBlock();
  public final DyeColorableBlock MAGIC_BLOCK = new DyeColorableBlock();

  public DyeColorableBlocks() {
    registerWool();
    registerCarpet();
    registerTerracotta();
    registerGlazedTerracotta();
    registerStainedGlass();
    registerStainedGlassPane();
    registerConcretePowder();
    registerConcrete();
    registerCandle();
    registerBed();
    registerShulkerBox();
    registerMagicBlocks();
  }

  public void registerWool() {
    WOOL.add(Blocks.BLACK_WOOL, DyeColor.BLACK);
    WOOL.add(Blocks.WHITE_WOOL, DyeColor.WHITE);
    WOOL.add(Blocks.BLUE_WOOL, DyeColor.BLUE);
    WOOL.add(Blocks.BROWN_WOOL, DyeColor.BROWN);
    WOOL.add(Blocks.CYAN_WOOL, DyeColor.CYAN);
    WOOL.add(Blocks.GRAY_WOOL, DyeColor.GRAY);
    WOOL.add(Blocks.GREEN_WOOL, DyeColor.GREEN);
    WOOL.add(Blocks.LIGHT_BLUE_WOOL, DyeColor.LIGHT_BLUE);
    WOOL.add(Blocks.LIGHT_GRAY_WOOL, DyeColor.LIGHT_GRAY);
    WOOL.add(Blocks.LIME_WOOL, DyeColor.LIME);
    WOOL.add(Blocks.MAGENTA_WOOL, DyeColor.MAGENTA);
    WOOL.add(Blocks.ORANGE_WOOL, DyeColor.ORANGE);
    WOOL.add(Blocks.PINK_WOOL, DyeColor.PINK);
    WOOL.add(Blocks.PURPLE_WOOL, DyeColor.PURPLE);
    WOOL.add(Blocks.RED_WOOL, DyeColor.RED);
    WOOL.add(Blocks.YELLOW_WOOL, DyeColor.YELLOW);
    WOOL.register();
  }

  public void registerTerracotta() {
    TERRACOTTA.add(Blocks.BLACK_TERRACOTTA, DyeColor.BLACK);
    TERRACOTTA.add(Blocks.WHITE_TERRACOTTA, DyeColor.WHITE);
    TERRACOTTA.add(Blocks.BLUE_TERRACOTTA, DyeColor.BLUE);
    TERRACOTTA.add(Blocks.BROWN_TERRACOTTA, DyeColor.BROWN);
    TERRACOTTA.add(Blocks.CYAN_TERRACOTTA, DyeColor.CYAN);
    TERRACOTTA.add(Blocks.GRAY_TERRACOTTA, DyeColor.GRAY);
    TERRACOTTA.add(Blocks.GREEN_TERRACOTTA, DyeColor.GREEN);
    TERRACOTTA.add(Blocks.LIGHT_BLUE_TERRACOTTA, DyeColor.LIGHT_BLUE);
    TERRACOTTA.add(Blocks.LIGHT_GRAY_TERRACOTTA, DyeColor.LIGHT_GRAY);
    TERRACOTTA.add(Blocks.LIME_TERRACOTTA, DyeColor.LIME);
    TERRACOTTA.add(Blocks.MAGENTA_TERRACOTTA, DyeColor.MAGENTA);
    TERRACOTTA.add(Blocks.ORANGE_TERRACOTTA, DyeColor.ORANGE);
    TERRACOTTA.add(Blocks.PINK_TERRACOTTA, DyeColor.PINK);
    TERRACOTTA.add(Blocks.PURPLE_TERRACOTTA, DyeColor.PURPLE);
    TERRACOTTA.add(Blocks.RED_TERRACOTTA, DyeColor.RED);
    TERRACOTTA.add(Blocks.YELLOW_TERRACOTTA, DyeColor.YELLOW);
    TERRACOTTA.register();
  }

  public void registerGlazedTerracotta() {
    GLAZED_TERRACOTTA.add(Blocks.BLACK_GLAZED_TERRACOTTA, DyeColor.BLACK);
    GLAZED_TERRACOTTA.add(Blocks.WHITE_GLAZED_TERRACOTTA, DyeColor.WHITE);
    GLAZED_TERRACOTTA.add(Blocks.BLUE_GLAZED_TERRACOTTA, DyeColor.BLUE);
    GLAZED_TERRACOTTA.add(Blocks.BROWN_GLAZED_TERRACOTTA, DyeColor.BROWN);
    GLAZED_TERRACOTTA.add(Blocks.CYAN_GLAZED_TERRACOTTA, DyeColor.CYAN);
    GLAZED_TERRACOTTA.add(Blocks.GRAY_GLAZED_TERRACOTTA, DyeColor.GRAY);
    GLAZED_TERRACOTTA.add(Blocks.GREEN_GLAZED_TERRACOTTA, DyeColor.GREEN);
    GLAZED_TERRACOTTA.add(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA, DyeColor.LIGHT_BLUE);
    GLAZED_TERRACOTTA.add(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA, DyeColor.LIGHT_GRAY);
    GLAZED_TERRACOTTA.add(Blocks.LIME_GLAZED_TERRACOTTA, DyeColor.LIME);
    GLAZED_TERRACOTTA.add(Blocks.MAGENTA_GLAZED_TERRACOTTA, DyeColor.MAGENTA);
    GLAZED_TERRACOTTA.add(Blocks.ORANGE_GLAZED_TERRACOTTA, DyeColor.ORANGE);
    GLAZED_TERRACOTTA.add(Blocks.PINK_GLAZED_TERRACOTTA, DyeColor.PINK);
    GLAZED_TERRACOTTA.add(Blocks.PURPLE_GLAZED_TERRACOTTA, DyeColor.PURPLE);
    GLAZED_TERRACOTTA.add(Blocks.RED_GLAZED_TERRACOTTA, DyeColor.RED);
    GLAZED_TERRACOTTA.add(Blocks.YELLOW_GLAZED_TERRACOTTA, DyeColor.YELLOW);
    GLAZED_TERRACOTTA.register();
  }

  public void registerBed() {
    BED.add(Blocks.BLACK_BED, DyeColor.BLACK);
    BED.add(Blocks.WHITE_BED, DyeColor.WHITE);
    BED.add(Blocks.BLUE_BED, DyeColor.BLUE);
    BED.add(Blocks.BROWN_BED, DyeColor.BROWN);
    BED.add(Blocks.CYAN_BED, DyeColor.CYAN);
    BED.add(Blocks.GRAY_BED, DyeColor.GRAY);
    BED.add(Blocks.GREEN_BED, DyeColor.GREEN);
    BED.add(Blocks.LIGHT_BLUE_BED, DyeColor.LIGHT_BLUE);
    BED.add(Blocks.LIGHT_GRAY_BED, DyeColor.LIGHT_GRAY);
    BED.add(Blocks.LIME_BED, DyeColor.LIME);
    BED.add(Blocks.MAGENTA_BED, DyeColor.MAGENTA);
    BED.add(Blocks.ORANGE_BED, DyeColor.ORANGE);
    BED.add(Blocks.PINK_BED, DyeColor.PINK);
    BED.add(Blocks.PURPLE_BED, DyeColor.PURPLE);
    BED.add(Blocks.RED_BED, DyeColor.RED);
    BED.add(Blocks.YELLOW_BED, DyeColor.YELLOW);
    BED.register();
  }

  public void registerCandle() {
    CANDLE.add(Blocks.BLACK_CANDLE, DyeColor.BLACK);
    CANDLE.add(Blocks.WHITE_CANDLE, DyeColor.WHITE);
    CANDLE.add(Blocks.BLUE_CANDLE, DyeColor.BLUE);
    CANDLE.add(Blocks.BROWN_CANDLE, DyeColor.BROWN);
    CANDLE.add(Blocks.CYAN_CANDLE, DyeColor.CYAN);
    CANDLE.add(Blocks.GRAY_CANDLE, DyeColor.GRAY);
    CANDLE.add(Blocks.GREEN_CANDLE, DyeColor.GREEN);
    CANDLE.add(Blocks.LIGHT_BLUE_CANDLE, DyeColor.LIGHT_BLUE);
    CANDLE.add(Blocks.LIGHT_GRAY_CANDLE, DyeColor.LIGHT_GRAY);
    CANDLE.add(Blocks.LIME_CANDLE, DyeColor.LIME);
    CANDLE.add(Blocks.MAGENTA_CANDLE, DyeColor.MAGENTA);
    CANDLE.add(Blocks.ORANGE_CANDLE, DyeColor.ORANGE);
    CANDLE.add(Blocks.PINK_CANDLE, DyeColor.PINK);
    CANDLE.add(Blocks.PURPLE_CANDLE, DyeColor.PURPLE);
    CANDLE.add(Blocks.RED_CANDLE, DyeColor.RED);
    CANDLE.add(Blocks.YELLOW_CANDLE, DyeColor.YELLOW);
    CANDLE.register();
  }

  public void registerCarpet() {
    CARPET.add(Blocks.BLACK_CARPET, DyeColor.BLACK);
    CARPET.add(Blocks.WHITE_CARPET, DyeColor.WHITE);
    CARPET.add(Blocks.BLUE_CARPET, DyeColor.BLUE);
    CARPET.add(Blocks.BROWN_CARPET, DyeColor.BROWN);
    CARPET.add(Blocks.CYAN_CARPET, DyeColor.CYAN);
    CARPET.add(Blocks.GRAY_CARPET, DyeColor.GRAY);
    CARPET.add(Blocks.GREEN_CARPET, DyeColor.GREEN);
    CARPET.add(Blocks.LIGHT_BLUE_CARPET, DyeColor.LIGHT_BLUE);
    CARPET.add(Blocks.LIGHT_GRAY_CARPET, DyeColor.LIGHT_GRAY);
    CARPET.add(Blocks.LIME_CARPET, DyeColor.LIME);
    CARPET.add(Blocks.MAGENTA_CARPET, DyeColor.MAGENTA);
    CARPET.add(Blocks.ORANGE_CARPET, DyeColor.ORANGE);
    CARPET.add(Blocks.PINK_CARPET, DyeColor.PINK);
    CARPET.add(Blocks.PURPLE_CARPET, DyeColor.PURPLE);
    CARPET.add(Blocks.RED_CARPET, DyeColor.RED);
    CARPET.add(Blocks.YELLOW_CARPET, DyeColor.YELLOW);
    CARPET.register();
  }

  public void registerConcretePowder() {
    CONCRETE_POWDER.add(Blocks.BLACK_CONCRETE_POWDER, DyeColor.BLACK);
    CONCRETE_POWDER.add(Blocks.WHITE_CONCRETE_POWDER, DyeColor.WHITE);
    CONCRETE_POWDER.add(Blocks.BLUE_CONCRETE_POWDER, DyeColor.BLUE);
    CONCRETE_POWDER.add(Blocks.BROWN_CONCRETE_POWDER, DyeColor.BROWN);
    CONCRETE_POWDER.add(Blocks.CYAN_CONCRETE_POWDER, DyeColor.CYAN);
    CONCRETE_POWDER.add(Blocks.GRAY_CONCRETE_POWDER, DyeColor.GRAY);
    CONCRETE_POWDER.add(Blocks.GREEN_CONCRETE_POWDER, DyeColor.GREEN);
    CONCRETE_POWDER.add(Blocks.LIGHT_BLUE_CONCRETE_POWDER, DyeColor.LIGHT_BLUE);
    CONCRETE_POWDER.add(Blocks.LIGHT_GRAY_CONCRETE_POWDER, DyeColor.LIGHT_GRAY);
    CONCRETE_POWDER.add(Blocks.LIME_CONCRETE_POWDER, DyeColor.LIME);
    CONCRETE_POWDER.add(Blocks.MAGENTA_CONCRETE_POWDER, DyeColor.MAGENTA);
    CONCRETE_POWDER.add(Blocks.ORANGE_CONCRETE_POWDER, DyeColor.ORANGE);
    CONCRETE_POWDER.add(Blocks.PINK_CONCRETE_POWDER, DyeColor.PINK);
    CONCRETE_POWDER.add(Blocks.PURPLE_CONCRETE_POWDER, DyeColor.PURPLE);
    CONCRETE_POWDER.add(Blocks.RED_CONCRETE_POWDER, DyeColor.RED);
    CONCRETE_POWDER.add(Blocks.YELLOW_CONCRETE_POWDER, DyeColor.YELLOW);
    CONCRETE_POWDER.register();
  }

  public void registerShulkerBox() {
    SHULKER_BOX.add(Blocks.BLACK_SHULKER_BOX, DyeColor.BLACK);
    SHULKER_BOX.add(Blocks.WHITE_SHULKER_BOX, DyeColor.WHITE);
    SHULKER_BOX.add(Blocks.BLUE_SHULKER_BOX, DyeColor.BLUE);
    SHULKER_BOX.add(Blocks.BROWN_SHULKER_BOX, DyeColor.BROWN);
    SHULKER_BOX.add(Blocks.CYAN_SHULKER_BOX, DyeColor.CYAN);
    SHULKER_BOX.add(Blocks.GRAY_SHULKER_BOX, DyeColor.GRAY);
    SHULKER_BOX.add(Blocks.GREEN_SHULKER_BOX, DyeColor.GREEN);
    SHULKER_BOX.add(Blocks.LIGHT_BLUE_SHULKER_BOX, DyeColor.LIGHT_BLUE);
    SHULKER_BOX.add(Blocks.LIGHT_GRAY_SHULKER_BOX, DyeColor.LIGHT_GRAY);
    SHULKER_BOX.add(Blocks.LIME_SHULKER_BOX, DyeColor.LIME);
    SHULKER_BOX.add(Blocks.MAGENTA_SHULKER_BOX, DyeColor.MAGENTA);
    SHULKER_BOX.add(Blocks.ORANGE_SHULKER_BOX, DyeColor.ORANGE);
    SHULKER_BOX.add(Blocks.PINK_SHULKER_BOX, DyeColor.PINK);
    SHULKER_BOX.add(Blocks.PURPLE_SHULKER_BOX, DyeColor.PURPLE);
    SHULKER_BOX.add(Blocks.RED_SHULKER_BOX, DyeColor.RED);
    SHULKER_BOX.add(Blocks.YELLOW_SHULKER_BOX, DyeColor.YELLOW);
    SHULKER_BOX.register();
  }

  public void registerStainedGlass() {
    STAINED_GLASS.add(Blocks.BLACK_STAINED_GLASS, DyeColor.BLACK);
    STAINED_GLASS.add(Blocks.WHITE_STAINED_GLASS, DyeColor.WHITE);
    STAINED_GLASS.add(Blocks.BLUE_STAINED_GLASS, DyeColor.BLUE);
    STAINED_GLASS.add(Blocks.BROWN_STAINED_GLASS, DyeColor.BROWN);
    STAINED_GLASS.add(Blocks.CYAN_STAINED_GLASS, DyeColor.CYAN);
    STAINED_GLASS.add(Blocks.GRAY_STAINED_GLASS, DyeColor.GRAY);
    STAINED_GLASS.add(Blocks.GREEN_STAINED_GLASS, DyeColor.GREEN);
    STAINED_GLASS.add(Blocks.LIGHT_BLUE_STAINED_GLASS, DyeColor.LIGHT_BLUE);
    STAINED_GLASS.add(Blocks.LIGHT_GRAY_STAINED_GLASS, DyeColor.LIGHT_GRAY);
    STAINED_GLASS.add(Blocks.LIME_STAINED_GLASS, DyeColor.LIME);
    STAINED_GLASS.add(Blocks.MAGENTA_STAINED_GLASS, DyeColor.MAGENTA);
    STAINED_GLASS.add(Blocks.ORANGE_STAINED_GLASS, DyeColor.ORANGE);
    STAINED_GLASS.add(Blocks.PINK_STAINED_GLASS, DyeColor.PINK);
    STAINED_GLASS.add(Blocks.PURPLE_STAINED_GLASS, DyeColor.PURPLE);
    STAINED_GLASS.add(Blocks.RED_STAINED_GLASS, DyeColor.RED);
    STAINED_GLASS.add(Blocks.YELLOW_STAINED_GLASS, DyeColor.YELLOW);
    STAINED_GLASS.register();
  }

  public void registerStainedGlassPane() {
    STAINED_GLASS_PANE.add(Blocks.BLACK_STAINED_GLASS_PANE, DyeColor.BLACK);
    STAINED_GLASS_PANE.add(Blocks.WHITE_STAINED_GLASS_PANE, DyeColor.WHITE);
    STAINED_GLASS_PANE.add(Blocks.BLUE_STAINED_GLASS_PANE, DyeColor.BLUE);
    STAINED_GLASS_PANE.add(Blocks.BROWN_STAINED_GLASS_PANE, DyeColor.BROWN);
    STAINED_GLASS_PANE.add(Blocks.CYAN_STAINED_GLASS_PANE, DyeColor.CYAN);
    STAINED_GLASS_PANE.add(Blocks.GRAY_STAINED_GLASS_PANE, DyeColor.GRAY);
    STAINED_GLASS_PANE.add(Blocks.GREEN_STAINED_GLASS_PANE, DyeColor.GREEN);
    STAINED_GLASS_PANE.add(Blocks.LIGHT_BLUE_STAINED_GLASS_PANE, DyeColor.LIGHT_BLUE);
    STAINED_GLASS_PANE.add(Blocks.LIGHT_GRAY_STAINED_GLASS_PANE, DyeColor.LIGHT_GRAY);
    STAINED_GLASS_PANE.add(Blocks.LIME_STAINED_GLASS_PANE, DyeColor.LIME);
    STAINED_GLASS_PANE.add(Blocks.MAGENTA_STAINED_GLASS_PANE, DyeColor.MAGENTA);
    STAINED_GLASS_PANE.add(Blocks.ORANGE_STAINED_GLASS_PANE, DyeColor.ORANGE);
    STAINED_GLASS_PANE.add(Blocks.PINK_STAINED_GLASS_PANE, DyeColor.PINK);
    STAINED_GLASS_PANE.add(Blocks.PURPLE_STAINED_GLASS_PANE, DyeColor.PURPLE);
    STAINED_GLASS_PANE.add(Blocks.RED_STAINED_GLASS_PANE, DyeColor.RED);
    STAINED_GLASS_PANE.add(Blocks.YELLOW_STAINED_GLASS_PANE, DyeColor.YELLOW);
    STAINED_GLASS_PANE.register();
  }

  public void registerConcrete() {
    CONCRETE.add(Blocks.BLACK_CONCRETE, DyeColor.BLACK);
    CONCRETE.add(Blocks.WHITE_CONCRETE, DyeColor.WHITE);
    CONCRETE.add(Blocks.BLUE_CONCRETE, DyeColor.BLUE);
    CONCRETE.add(Blocks.BROWN_CONCRETE, DyeColor.BROWN);
    CONCRETE.add(Blocks.CYAN_CONCRETE, DyeColor.CYAN);
    CONCRETE.add(Blocks.GRAY_CONCRETE, DyeColor.GRAY);
    CONCRETE.add(Blocks.GREEN_CONCRETE, DyeColor.GREEN);
    CONCRETE.add(Blocks.LIGHT_BLUE_CONCRETE, DyeColor.LIGHT_BLUE);
    CONCRETE.add(Blocks.LIGHT_GRAY_CONCRETE, DyeColor.LIGHT_GRAY);
    CONCRETE.add(Blocks.LIME_CONCRETE, DyeColor.LIME);
    CONCRETE.add(Blocks.MAGENTA_CONCRETE, DyeColor.MAGENTA);
    CONCRETE.add(Blocks.ORANGE_CONCRETE, DyeColor.ORANGE);
    CONCRETE.add(Blocks.PINK_CONCRETE, DyeColor.PINK);
    CONCRETE.add(Blocks.PURPLE_CONCRETE, DyeColor.PURPLE);
    CONCRETE.add(Blocks.RED_CONCRETE, DyeColor.RED);
    CONCRETE.add(Blocks.YELLOW_CONCRETE, DyeColor.YELLOW);
    CONCRETE.register();
  }

  public void registerMagicBlocks() {
    MAGIC_BLOCK.add(ScriptorBlocks.BLACK_MAGIC_BLOCK.get(), DyeColor.BLACK);
    MAGIC_BLOCK.add(ScriptorBlocks.WHITE_MAGIC_BLOCK.get(), DyeColor.WHITE);
    MAGIC_BLOCK.add(ScriptorBlocks.BLUE_MAGIC_BLOCK.get(), DyeColor.BLUE);
    MAGIC_BLOCK.add(ScriptorBlocks.BROWN_MAGIC_BLOCK.get(), DyeColor.BROWN);
    MAGIC_BLOCK.add(ScriptorBlocks.CYAN_MAGIC_BLOCK.get(), DyeColor.CYAN);
    MAGIC_BLOCK.add(ScriptorBlocks.GRAY_MAGIC_BLOCK.get(), DyeColor.GRAY);
    MAGIC_BLOCK.add(ScriptorBlocks.GREEN_MAGIC_BLOCK.get(), DyeColor.GREEN);
    MAGIC_BLOCK.add(ScriptorBlocks.LIGHT_BLUE_MAGIC_BLOCK.get(), DyeColor.LIGHT_BLUE);
    MAGIC_BLOCK.add(ScriptorBlocks.LIGHT_GRAY_MAGIC_BLOCK.get(), DyeColor.LIGHT_GRAY);
    MAGIC_BLOCK.add(ScriptorBlocks.LIME_MAGIC_BLOCK.get(), DyeColor.LIME);
    MAGIC_BLOCK.add(ScriptorBlocks.MAGENTA_MAGIC_BLOCK.get(), DyeColor.MAGENTA);
    MAGIC_BLOCK.add(ScriptorBlocks.ORANGE_MAGIC_BLOCK.get(), DyeColor.ORANGE);
    MAGIC_BLOCK.add(ScriptorBlocks.PINK_MAGIC_BLOCK.get(), DyeColor.PINK);
    MAGIC_BLOCK.add(ScriptorBlocks.PURPLE_MAGIC_BLOCK.get(), DyeColor.PURPLE);
    MAGIC_BLOCK.add(ScriptorBlocks.RED_MAGIC_BLOCK.get(), DyeColor.RED);
    MAGIC_BLOCK.add(ScriptorBlocks.YELLOW_MAGIC_BLOCK.get(), DyeColor.YELLOW);
    MAGIC_BLOCK.register();
  }
}

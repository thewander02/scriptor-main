package com.ssblur.scriptor.events.messages;

import com.ssblur.scriptor.events.ScriptorEvents;
import com.ssblur.scriptor.item.BookOfBooks;
import dev.architectury.networking.NetworkManager;
import io.netty.buffer.Unpooled;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.Tag;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.InteractionHand;

public class ScrollNetwork {
  public static void scrollBook(FriendlyByteBuf buf, NetworkManager.PacketContext context) {
    int direction = buf.readBoolean() ? 1 : -1;
    var hand = buf.readBoolean() ? InteractionHand.MAIN_HAND : InteractionHand.OFF_HAND;

    var player = context.getPlayer();
    var item = player.getItemInHand(hand);
    if(item.getItem() instanceof BookOfBooks) {
      var tag = item.getTagElement("scriptor");
      if(tag == null) return;

      var list = tag.getList("items", Tag.TAG_COMPOUND);
      if(list == null) return;

      int slot = tag.getInt("active_slot");
      slot = slot + direction + list.size();
      slot = slot % list.size();
      tag.putInt("active_slot", slot);
    }
  }

  public static void sendScroll(InteractionHand interactionHand, double amount) {
    FriendlyByteBuf out = new FriendlyByteBuf(Unpooled.buffer());
    out.writeBoolean(amount > 0);
    out.writeBoolean(interactionHand == InteractionHand.MAIN_HAND);
    NetworkManager.sendToServer(ScriptorEvents.SCROLL_NETWORK_C, out);
  }
}

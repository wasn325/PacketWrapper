package com.comphenix.packetwrapper;

import org.bukkit.inventory.ItemStack;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerWindowItems extends AbstractPacket {
    public static final PacketType TYPE = PacketType.Play.Server.WINDOW_ITEMS;
    
    public WrapperPlayServerWindowItems() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerWindowItems(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve Window ID.
     * <p>
     * Notes: the id of window which items are being sent for. 0 for player inventory.
     * @return The current Window ID
     */
    public byte getWindowId() {
        return (byte) handle.getIntegers().read(0);
    }
    
    /**
     * Set Window ID.
     * @param value - new value.
     */
    public void setWindowId(byte value) {
        handle.getIntegers().write(0, (int) value);
    }
    
    /**
     * Retrieve Count.
     * <p>
     * Notes: the number of slots (see below)
     * @return The current Count
     */
    public short getCount() {
        return (short) handle.getItemArrayModifier().read(0);
    }
    
    /**
     * Set Count.
     * @param value - new value.
     */
    public void setCount(short value) {
        handle.getItemArrayModifier().write(0, (ItemStack[]) value);
    }
    
    /**
     * Retrieve Slot data.
     * @return The current Slot data
     */
    public ofItemStacks[] getSlotData() {
        return (ofItemStacks[]) handle.getItemArrayModifier().read(0);
    }
    
    /**
     * Set Slot data.
     * @param value - new value.
     */
    public void setSlotData(ofItemStacks[] value) {
        handle.getItemArrayModifier().write(0, (ItemStack[]) value);
    }
    
}


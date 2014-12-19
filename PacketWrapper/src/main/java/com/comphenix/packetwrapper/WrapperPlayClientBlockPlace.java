package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayClientBlockPlace extends AbstractPacket {
    public static final PacketType TYPE = PacketType.Play.Client.BLOCK_PLACE;
    
    public WrapperPlayClientBlockPlace() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientBlockPlace(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve Location.
     * <p>
     * Notes: block position
     * @return The current Location
     */
    public BlockPosition getLocation() {
        return handle.getBlockPositions().read(0);
    }
    
    /**
     * Set Location.
     * @param value - new value.
     */
    public void setLocation(BlockPosition value) {
        handle.getBlockPositions().write(0, value);
    }
    
    /**
     * Retrieve Direction.
     * <p>
     * Notes: the offset to use for block/item placement (see below)
     * @return The current Direction
     */
    public byte getDirection() {
        return (byte) handle.getIntegers().read(0);
    }
    
    /**
     * Set Direction.
     * @param value - new value.
     */
    public void setDirection(byte value) {
        handle.getIntegers().write(0, (int) value);
    }
    
    /**
     * Retrieve Held item.
     * @return The current Held item
     */
    public ItemStack getHeldItem() {
        return handle.getItemModifier().read(0);
    }
    
    /**
     * Set Held item.
     * @param value - new value.
     */
    public void setHeldItem(ItemStack value) {
        handle.getItemModifier().write(0, value);
    }
    
    /**
     * Retrieve Cursor position X.
     * <p>
     * Notes: the position of the crosshair on the block
     * @return The current Cursor position X
     */
    public byte getCursorPositionX() {
        return (byte) handle.getFloat().read(0);
    }
    
    /**
     * Set Cursor position X.
     * @param value - new value.
     */
    public void setCursorPositionX(byte value) {
        handle.getFloat().write(0, (float) value);
    }
    
    /**
     * Retrieve Cursor position Y.
     * @return The current Cursor position Y
     */
    public byte getCursorPositionY() {
        return (byte) handle.getFloat().read(1);
    }
    
    /**
     * Set Cursor position Y.
     * @param value - new value.
     */
    public void setCursorPositionY(byte value) {
        handle.getFloat().write(1, (float) value);
    }
    
    /**
     * Retrieve Cursor position Z.
     * @return The current Cursor position Z
     */
    public byte getCursorPositionZ() {
        return (byte) handle.getFloat().read(2);
    }
    
    /**
     * Set Cursor position Z.
     * @param value - new value.
     */
    public void setCursorPositionZ(byte value) {
        handle.getFloat().write(2, (float) value);
    }
    
}


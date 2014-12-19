package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayClientUpdateSign extends AbstractPacket {
    public static final PacketType TYPE = PacketType.Play.Client.UPDATE_SIGN;
    
    public WrapperPlayClientUpdateSign() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientUpdateSign(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve Location.
     * <p>
     * Notes: block Coordinates
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
     * Retrieve Line 1.
     * <p>
     * Notes: first line of text in the sign
     * @return The current Line 1
     */
    public WrappedChatComponent[] getLine1() {
        return handle.getChatComponentArrays().read(0);
    }
    
    /**
     * Set Line 1.
     * @param value - new value.
     */
    public void setLine1(WrappedChatComponent[] value) {
        handle.getChatComponentArrays().write(0, value);
    }
    
    // Cannot generate field Line 2
    // Cannot generate field Line 3
    // Cannot generate field Line 4
}


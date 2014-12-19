package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerCraftProgressBar extends AbstractPacket {
    public static final PacketType TYPE = PacketType.Play.Server.CRAFT_PROGRESS_BAR;
    
    public WrapperPlayServerCraftProgressBar() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerCraftProgressBar(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve Window ID.
     * <p>
     * Notes: the id of the window.
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
     * Retrieve Property.
     * <p>
     * Notes: which property should be updated.
     * @return The current Property
     */
    public short getProperty() {
        return (short) handle.getIntegers().read(1);
    }
    
    /**
     * Set Property.
     * @param value - new value.
     */
    public void setProperty(short value) {
        handle.getIntegers().write(1, (int) value);
    }
    
    /**
     * Retrieve Value.
     * <p>
     * Notes: the new value for the property.
     * @return The current Value
     */
    public short getValue() {
        return (short) handle.getIntegers().read(2);
    }
    
    /**
     * Set Value.
     * @param value - new value.
     */
    public void setValue(short value) {
        handle.getIntegers().write(2, (int) value);
    }
    
}


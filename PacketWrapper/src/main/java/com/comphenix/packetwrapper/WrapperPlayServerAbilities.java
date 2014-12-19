package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerAbilities extends AbstractPacket {
    public static final PacketType TYPE = PacketType.Play.Server.ABILITIES;
    
    public WrapperPlayServerAbilities() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerAbilities(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve Flags.
     * @return The current Flags
     */
    public byte getFlags() {
        return (byte) handle.getFloat().read(0);
    }
    
    /**
     * Set Flags.
     * @param value - new value.
     */
    public void setFlags(byte value) {
        handle.getFloat().write(0, (float) value);
    }
    
    /**
     * Retrieve Flying speed.
     * <p>
     * Notes: previous integer value divided by 250
     * @return The current Flying speed
     */
    public float getFlyingSpeed() {
        return handle.getFloat().read(1);
    }
    
    /**
     * Set Flying speed.
     * @param value - new value.
     */
    public void setFlyingSpeed(float value) {
        handle.getFloat().write(1, value);
    }
    
    // Cannot generate field Walking speed
}


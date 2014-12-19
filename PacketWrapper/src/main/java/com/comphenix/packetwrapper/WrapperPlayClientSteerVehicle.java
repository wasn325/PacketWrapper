package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayClientSteerVehicle extends AbstractPacket {
    public static final PacketType TYPE = PacketType.Play.Client.STEER_VEHICLE;
    
    public WrapperPlayClientSteerVehicle() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientSteerVehicle(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve Sideways.
     * <p>
     * Notes: positive to the left of the player
     * @return The current Sideways
     */
    public float getSideways() {
        return handle.getFloat().read(0);
    }
    
    /**
     * Set Sideways.
     * @param value - new value.
     */
    public void setSideways(float value) {
        handle.getFloat().write(0, value);
    }
    
    /**
     * Retrieve Forward.
     * <p>
     * Notes: positive forward
     * @return The current Forward
     */
    public float getForward() {
        return handle.getFloat().read(1);
    }
    
    /**
     * Set Forward.
     * @param value - new value.
     */
    public void setForward(float value) {
        handle.getFloat().write(1, value);
    }
    
    /**
     * Retrieve Flags.
     * <p>
     * Notes: 0x1 Jump, 0x2 Unmount
     * @return The current Flags
     */
    public byte getFlags() {
        return (byte) handle.getSpecificModifier(boolean.class).read(0);
    }
    
    /**
     * Set Flags.
     * @param value - new value.
     */
    public void setFlags(byte value) {
        handle.getSpecificModifier(boolean.class).write(0, (boolean) value);
    }
    
}


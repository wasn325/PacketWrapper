package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerEntityVelocity extends AbstractPacket {
    public static final PacketType TYPE = PacketType.Play.Server.ENTITY_VELOCITY;
    
    public WrapperPlayServerEntityVelocity() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerEntityVelocity(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve Entity ID.
     * <p>
     * Notes: entity's ID
     * @return The current Entity ID
     */
    public int getEntityId() {
        return handle.getIntegers().read(0);
    }
    
    /**
     * Set Entity ID.
     * @param value - new value.
     */
    public void setEntityId(int value) {
        handle.getIntegers().write(0, value);
    }
    
    /**
     * Retrieve Velocity X.
     * <p>
     * Notes: velocity on the X axis
     * @return The current Velocity X
     */
    public short getVelocityX() {
        return (short) handle.getIntegers().read(1);
    }
    
    /**
     * Set Velocity X.
     * @param value - new value.
     */
    public void setVelocityX(short value) {
        handle.getIntegers().write(1, (int) value);
    }
    
    /**
     * Retrieve Velocity Y.
     * <p>
     * Notes: velocity on the Y axis
     * @return The current Velocity Y
     */
    public short getVelocityY() {
        return (short) handle.getIntegers().read(2);
    }
    
    /**
     * Set Velocity Y.
     * @param value - new value.
     */
    public void setVelocityY(short value) {
        handle.getIntegers().write(2, (int) value);
    }
    
    /**
     * Retrieve Velocity Z.
     * <p>
     * Notes: velocity on the Z axis
     * @return The current Velocity Z
     */
    public short getVelocityZ() {
        return (short) handle.getIntegers().read(3);
    }
    
    /**
     * Set Velocity Z.
     * @param value - new value.
     */
    public void setVelocityZ(short value) {
        handle.getIntegers().write(3, (int) value);
    }
    
}


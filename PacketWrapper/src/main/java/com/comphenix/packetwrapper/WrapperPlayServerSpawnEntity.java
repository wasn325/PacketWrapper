package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerSpawnEntity extends AbstractPacket {
    public static final PacketType TYPE = PacketType.Play.Server.SPAWN_ENTITY;
    
    public WrapperPlayServerSpawnEntity() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerSpawnEntity(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve Entity ID.
     * <p>
     * Notes: entity ID of the object
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
     * Retrieve Type.
     * <p>
     * Notes: the type of object (See Objects)
     * @return The current Type
     */
    public byte getType() {
        return (byte) handle.getIntegers().read(9);
    }
    
    /**
     * Set Type.
     * @param value - new value.
     */
    public void setType(byte value) {
        handle.getIntegers().write(9, (int) value);
    }
    
    /**
     * Retrieve X.
     * <p>
     * Notes: x position as a Fixed-Point number
     * @return The current X
     */
    public int getX() {
        return handle.getIntegers().read(1);
    }
    
    /**
     * Set X.
     * @param value - new value.
     */
    public void setX(int value) {
        handle.getIntegers().write(1, value);
    }
    
    /**
     * Retrieve Y.
     * <p>
     * Notes: y position as a Fixed-Point number
     * @return The current Y
     */
    public int getY() {
        return handle.getIntegers().read(2);
    }
    
    /**
     * Set Y.
     * @param value - new value.
     */
    public void setY(int value) {
        handle.getIntegers().write(2, value);
    }
    
    /**
     * Retrieve Z.
     * <p>
     * Notes: z position as a Fixed-Point number
     * @return The current Z
     */
    public int getZ() {
        return handle.getIntegers().read(3);
    }
    
    /**
     * Set Z.
     * @param value - new value.
     */
    public void setZ(int value) {
        handle.getIntegers().write(3, value);
    }
    
    /**
     * Retrieve Pitch.
     * <p>
     * Notes: the pitch in steps of 2p/256
     * @return The current Pitch
     */
    public byte getPitch() {
        return (byte) handle.getIntegers().read(7);
    }
    
    /**
     * Set Pitch.
     * @param value - new value.
     */
    public void setPitch(byte value) {
        handle.getIntegers().write(7, (int) value);
    }
    
    /**
     * Retrieve Yaw.
     * <p>
     * Notes: the yaw in steps of 2p/256
     * @return The current Yaw
     */
    public byte getYaw() {
        return (byte) handle.getIntegers().read(8);
    }
    
    /**
     * Set Yaw.
     * @param value - new value.
     */
    public void setYaw(byte value) {
        handle.getIntegers().write(8, (int) value);
    }
    
    /**
     * Retrieve Data.
     * @return The current Data
     */
    public objectdata getData() {
        return (objectdata) handle.getIntegers().read(10);
    }
    
    /**
     * Set Data.
     * @param value - new value.
     */
    public void setData(objectdata value) {
        handle.getIntegers().write(10, (int) value);
    }
    
}


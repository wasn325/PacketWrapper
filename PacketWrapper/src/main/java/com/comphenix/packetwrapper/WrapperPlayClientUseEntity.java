package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayClientUseEntity extends AbstractPacket {
    public static final PacketType TYPE = PacketType.Play.Client.USE_ENTITY;
    
    public WrapperPlayClientUseEntity() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientUseEntity(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve Target.
     * @return The current Target
     */
    public int getTarget() {
        return handle.getIntegers().read(0);
    }
    
    /**
     * Set Target.
     * @param value - new value.
     */
    public void setTarget(int value) {
        handle.getIntegers().write(0, value);
    }
    
    /**
     * Retrieve Type.
     * <p>
     * Notes: 0 = INTERACT, 1 = ATTACK, 2 = INTERACT_AT
     * @return The current Type
     */
    public int getType() {
        return (int) handle.getSpecificModifier(Enum.class).read(0);
    }
    
    /**
     * Set Type.
     * @param value - new value.
     */
    public void setType(int value) {
        handle.getSpecificModifier(Enum.class).write(0, (Enum<?>) value);
    }
    
    /**
     * Retrieve Target X.
     * <p>
     * Notes: only if Type == INTERACT_AT
     * @return The current Target X
     */
    public float getTargetX() {
        return (float) handle.getSpecificModifier(Enum.class).read(0);
    }
    
    /**
     * Set Target X.
     * @param value - new value.
     */
    public void setTargetX(float value) {
        handle.getSpecificModifier(Enum.class).write(0, (Enum<?>) value);
    }
    
    /**
     * Retrieve Target Y.
     * <p>
     * Notes: only if Type == INTERACT_AT
     * @return The current Target Y
     */
    public float getTargetY() {
        return (float) handle.getVectors().read(0);
    }
    
    /**
     * Set Target Y.
     * @param value - new value.
     */
    public void setTargetY(float value) {
        handle.getVectors().write(0, (Vector) value);
    }
    
    /**
     * Retrieve Target Z.
     * <p>
     * Notes: only if Type == INTERACT_AT
     * @return The current Target Z
     */
    public float getTargetZ() {
        return (float) handle.getVectors().read(0);
    }
    
    /**
     * Set Target Z.
     * @param value - new value.
     */
    public void setTargetZ(float value) {
        handle.getVectors().write(0, (Vector) value);
    }
    
}


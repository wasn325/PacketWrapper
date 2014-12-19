package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerCombatEvent extends AbstractPacket {
    public static final PacketType TYPE = PacketType.Play.Server.COMBAT_EVENT;
    
    public WrapperPlayServerCombatEvent() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerCombatEvent(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve Event.
     * <p>
     * Notes: 0 ENTER_COMBAT, 1 END_COMBAT, 2 ENTITY_DEAD
     * @return The current Event
     */
    public int getEvent() {
        return (int) handle.getSpecificModifier(Enum.class).read(0);
    }
    
    /**
     * Set Event.
     * @param value - new value.
     */
    public void setEvent(int value) {
        handle.getSpecificModifier(Enum.class).write(0, (Enum<?>) value);
    }
    
    /**
     * Retrieve Duration.
     * <p>
     * Notes: only for END_COMBAT
     * @return The current Duration
     */
    public int getDuration() {
        return (int) handle.getSpecificModifier(Enum.class).read(0);
    }
    
    /**
     * Set Duration.
     * @param value - new value.
     */
    public void setDuration(int value) {
        handle.getSpecificModifier(Enum.class).write(0, (Enum<?>) value);
    }
    
    /**
     * Retrieve Entity ID.
     * <p>
     * Notes: only for END_COMBAT
     * @return The current Entity ID
     */
    public int getEntityId() {
        return handle.getIntegers().read(2);
    }
    
    /**
     * Set Entity ID.
     * @param value - new value.
     */
    public void setEntityId(int value) {
        handle.getIntegers().write(2, value);
    }
    
    /**
     * Retrieve Player ID.
     * <p>
     * Notes: only for ENTITY_DEAD
     * @return The current Player ID
     */
    public int getPlayerId() {
        return handle.getIntegers().read(1);
    }
    
    /**
     * Set Player ID.
     * @param value - new value.
     */
    public void setPlayerId(int value) {
        handle.getIntegers().write(1, value);
    }
    
    /**
     * Retrieve Entity ID.
     * <p>
     * Notes: only for ENTITY_DEAD
     * @return The current Entity ID
     */
    public int getEntityId() {
        return (int) handle.getSpecificModifier(Enum.class).read(0);
    }
    
    /**
     * Set Entity ID.
     * @param value - new value.
     */
    public void setEntityId(int value) {
        handle.getSpecificModifier(Enum.class).write(0, (Enum<?>) value);
    }
    
    /**
     * Retrieve Message.
     * <p>
     * Notes: only for ENTITY_DEAD
     * @return The current Message
     */
    public String getMessage() {
        return (String) handle.getIntegers().read(0);
    }
    
    /**
     * Set Message.
     * @param value - new value.
     */
    public void setMessage(String value) {
        handle.getIntegers().write(0, (int) value);
    }
    
}


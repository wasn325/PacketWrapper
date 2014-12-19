package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerScoreboardScore extends AbstractPacket {
    public static final PacketType TYPE = PacketType.Play.Server.SCOREBOARD_SCORE;
    
    public WrapperPlayServerScoreboardScore() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerScoreboardScore(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve Score name.
     * <p>
     * Notes: the name of the score to be updated or removed.
     * @return The current Score name
     */
    public String getScoreName() {
        return handle.getStrings().read(0);
    }
    
    /**
     * Set Score name.
     * @param value - new value.
     */
    public void setScoreName(String value) {
        handle.getStrings().write(0, value);
    }
    
    /**
     * Retrieve Update/Remove.
     * <p>
     * Notes: 0 to create/update an item. 1 to remove an item.
     * @return The current Update/Remove
     */
    public byte getUpdateRemove() {
        return (byte) handle.getSpecificModifier(Enum.class).read(0);
    }
    
    /**
     * Set Update/Remove.
     * @param value - new value.
     */
    public void setUpdateRemove(byte value) {
        handle.getSpecificModifier(Enum.class).write(0, (Enum<?>) value);
    }
    
    /**
     * Retrieve Objective Name.
     * <p>
     * Notes: the name of the objective the score belongs to.
     * @return The current Objective Name
     */
    public String getObjectiveName() {
        return handle.getStrings().read(1);
    }
    
    /**
     * Set Objective Name.
     * @param value - new value.
     */
    public void setObjectiveName(String value) {
        handle.getStrings().write(1, value);
    }
    
    /**
     * Retrieve Value.
     * <p>
     * Notes: the score to be displayed next to the entry. Only sent when Update/Remove does not equal 1.
     * @return The current Value
     */
    public int getValue() {
        return (int) handle.getSpecificModifier(Enum.class).read(0);
    }
    
    /**
     * Set Value.
     * @param value - new value.
     */
    public void setValue(int value) {
        handle.getSpecificModifier(Enum.class).write(0, (Enum<?>) value);
    }
    
}


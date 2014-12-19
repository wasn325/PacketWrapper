package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerServerDifficulty extends AbstractPacket {
    public static final PacketType TYPE = PacketType.Play.Server.SERVER_DIFFICULTY;
    
    public WrapperPlayServerServerDifficulty() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerServerDifficulty(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve Difficulty.
     * <p>
     * Notes: 0:PEACEFUL, 1:EASY, 2:NORMAL, 3: HARD
     * @return The current Difficulty
     */
    public byte getDifficulty() {
        return (byte) handle.getSpecificModifier(Enum.class).read(0);
    }
    
    /**
     * Set Difficulty.
     * @param value - new value.
     */
    public void setDifficulty(byte value) {
        handle.getSpecificModifier(Enum.class).write(0, (Enum<?>) value);
    }
    
}


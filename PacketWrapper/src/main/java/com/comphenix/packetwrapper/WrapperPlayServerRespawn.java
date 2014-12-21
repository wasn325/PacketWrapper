package com.comphenix.packetwrapper;

import org.bukkit.WorldType;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerRespawn extends AbstractPacket {
    public static final PacketType TYPE = PacketType.Play.Server.RESPAWN;
    
    public WrapperPlayServerRespawn() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerRespawn(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve Dimension.
     * <p>
     * Notes: -1: The Nether, 0: The Overworld, 1: The End
     * @return The current Dimension
     */
    public int getDimension() {
        return handle.getIntegers().read(0);
    }
    
    /**
     * Set Dimension.
     * @param value - new value.
     */
    public void setDimension(int value) {
        handle.getIntegers().write(0, value);
    }
    
    /**
     * Retrieve Difficulty.
     * <p>
     * Notes: 0 thru 3 for Peaceful, Easy, Normal, Hard.
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
    
    /**
     * Retrieve Gamemode.
     * <p>
     * Notes: 0: survival, 1: creative, 2: adventure. The hardcore flag is not included
     * @return The current Gamemode
     */
    public byte getGamemode() {
        return (byte) handle.getSpecificModifier(Enum.class).read(0);
    }
    
    /**
     * Set Gamemode.
     * @param value - new value.
     */
    public void setGamemode(byte value) {
        handle.getSpecificModifier(Enum.class).write(0, (Enum<?>) value);
    }
    
    /**
     * Retrieve Level Type.
     * <p>
     * Notes: same as Join Game
     * @return The current Level Type
     */
    public String getLevelType() {
        return (String) handle.getWorldTypeModifier().read(0);
    }
    
    /**
     * Set Level Type.
     * @param value - new value.
     */
    public void setLevelType(String value) {
        handle.getWorldTypeModifier().write(0, (WorldType) value);
    }
    
}


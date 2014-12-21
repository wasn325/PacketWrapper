package com.comphenix.packetwrapper;

import org.bukkit.WorldType;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerLogin extends AbstractPacket {
    public static final PacketType TYPE = PacketType.Play.Server.LOGIN;
    
    public WrapperPlayServerLogin() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerLogin(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve Entity ID.
     * <p>
     * Notes: the player's Entity ID
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
     * Retrieve Gamemode.
     * <p>
     * Notes: 0: survival, 1: creative, 2: adventure. Bit 3 (0x8) is the hardcore flag
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
     * Retrieve Dimension.
     * <p>
     * Notes: -1: nether, 0: overworld, 1: end
     * @return The current Dimension
     */
    public byte getDimension() {
        return (byte) handle.getSpecificModifier(boolean.class).read(0);
    }
    
    /**
     * Set Dimension.
     * @param value - new value.
     */
    public void setDimension(byte value) {
        handle.getSpecificModifier(boolean.class).write(0, (boolean) value);
    }
    
    /**
     * Retrieve Difficulty.
     * <p>
     * Notes: 0 thru 3 for Peaceful, Easy, Normal, Hard
     * @return The current Difficulty
     */
    public byte getDifficulty() {
        return (byte) handle.getIntegers().read(1);
    }
    
    /**
     * Set Difficulty.
     * @param value - new value.
     */
    public void setDifficulty(byte value) {
        handle.getIntegers().write(1, (int) value);
    }
    
    /**
     * Retrieve Max Players.
     * <p>
     * Notes: used by the client to draw the player list
     * @return The current Max Players
     */
    public byte getMaxPlayers() {
        return (byte) handle.getSpecificModifier(Enum.class).read(0);
    }
    
    /**
     * Set Max Players.
     * @param value - new value.
     */
    public void setMaxPlayers(byte value) {
        handle.getSpecificModifier(Enum.class).write(0, (Enum<?>) value);
    }
    
    /**
     * Retrieve Level Type.
     * <p>
     * Notes: default, flat, largeBiomes, amplified, default_1_1
     * @return The current Level Type
     */
    public String getLevelType() {
        return (String) handle.getIntegers().read(2);
    }
    
    /**
     * Set Level Type.
     * @param value - new value.
     */
    public void setLevelType(String value) {
        handle.getIntegers().write(2, (int) value);
    }
    
    /**
     * Retrieve Reduced Debug Info.
     * @return The current Reduced Debug Info
     */
    public boolean getReducedDebugInfo() {
        return (boolean) handle.getWorldTypeModifier().read(0);
    }
    
    /**
     * Set Reduced Debug Info.
     * @param value - new value.
     */
    public void setReducedDebugInfo(boolean value) {
        handle.getWorldTypeModifier().write(0, (WorldType) value);
    }
    
}


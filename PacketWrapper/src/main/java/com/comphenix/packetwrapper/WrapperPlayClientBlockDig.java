package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayClientBlockDig extends AbstractPacket {
    public static final PacketType TYPE = PacketType.Play.Client.BLOCK_DIG;
    
    public WrapperPlayClientBlockDig() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientBlockDig(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve Status.
     * <p>
     * Notes: the action the player is taking against the block (see below)
     * @return The current Status
     */
    public byte getStatus() {
        return (byte) handle.getSpecificModifier(Enum.class).read(0);
    }
    
    /**
     * Set Status.
     * @param value - new value.
     */
    public void setStatus(byte value) {
        handle.getSpecificModifier(Enum.class).write(0, (Enum<?>) value);
    }
    
    /**
     * Retrieve Location.
     * <p>
     * Notes: block position
     * @return The current Location
     */
    public BlockPosition getLocation() {
        return handle.getBlockPositions().read(0);
    }
    
    /**
     * Set Location.
     * @param value - new value.
     */
    public void setLocation(BlockPosition value) {
        handle.getBlockPositions().write(0, value);
    }
    
    /**
     * Retrieve Face.
     * <p>
     * Notes: the face being hit (see below)
     * @return The current Face
     */
    public byte getFace() {
        return (byte) handle.getSpecificModifier(Enum.class).read(0);
    }
    
    /**
     * Set Face.
     * @param value - new value.
     */
    public void setFace(byte value) {
        handle.getSpecificModifier(Enum.class).write(0, (Enum<?>) value);
    }
    
}


package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerBlockAction extends AbstractPacket {
    public static final PacketType TYPE = PacketType.Play.Server.BLOCK_ACTION;
    
    public WrapperPlayServerBlockAction() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerBlockAction(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve Location.
     * <p>
     * Notes: block Coordinates
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
     * Retrieve Byte 1.
     * <p>
     * Notes: varies depending on block - see Block_Actions
     * @return The current Byte 1
     */
    public byte getByte1() {
        return (byte) handle.getIntegers().read(0);
    }
    
    /**
     * Set Byte 1.
     * @param value - new value.
     */
    public void setByte1(byte value) {
        handle.getIntegers().write(0, (int) value);
    }
    
    /**
     * Retrieve Byte 2.
     * <p>
     * Notes: varies depending on block - see Block_Actions
     * @return The current Byte 2
     */
    public byte getByte2() {
        return (byte) handle.getIntegers().read(1);
    }
    
    /**
     * Set Byte 2.
     * @param value - new value.
     */
    public void setByte2(byte value) {
        handle.getIntegers().write(1, (int) value);
    }
    
    /**
     * Retrieve Block Type.
     * <p>
     * Notes: the block type for the block
     * @return The current Block Type
     */
    public Material getBlockType() {
        return handle.getBlocks().read(0);
    }
    
    /**
     * Set Block Type.
     * @param value - new value.
     */
    public void setBlockType(Material value) {
        handle.getBlocks().write(0, value);
    }
    
}


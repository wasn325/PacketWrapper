package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.BlockPosition;

public class WrapperPlayServerSpawnEntityPainting extends AbstractPacket {
    public static final PacketType TYPE = PacketType.Play.Server.SPAWN_ENTITY_PAINTING;
    
    public WrapperPlayServerSpawnEntityPainting() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerSpawnEntityPainting(PacketContainer packet) {
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
     * Retrieve Title.
     * <p>
     * Notes: name of the painting. Max length 13
     * @return The current Title
     */
    public String getTitle() {
        return handle.getStrings().read(0);
    }
    
    /**
     * Set Title.
     * @param value - new value.
     */
    public void setTitle(String value) {
        handle.getStrings().write(0, value);
    }
    
    /**
     * Retrieve Location.
     * <p>
     * Notes: center coordinates
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
     * Retrieve Direction.
     * <p>
     * Notes: direction the painting faces (0 -z, 1 -x, 2 +z, 3 +x)
     * @return The current Direction
     */
    public byte getDirection() {
        return (byte) handle.getSpecificModifier(Enum.class).read(0);
    }
    
    /**
     * Set Direction.
     * @param value - new value.
     */
    public void setDirection(byte value) {
        handle.getSpecificModifier(Enum.class).write(0, (Enum<?>) value);
    }
    
}


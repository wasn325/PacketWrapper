package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerUpdateAttributes extends AbstractPacket {
    public static final PacketType TYPE = PacketType.Play.Server.UPDATE_ATTRIBUTES;
    
    public WrapperPlayServerUpdateAttributes() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerUpdateAttributes(PacketContainer packet) {
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
     * Retrieve Count.
     * <p>
     * Notes: length of following array
     * @return The current Count
     */
    public List<BlockPosition> getCount() {
        return handle.getPositionCollectionModifier().read(0);
    }
    
    /**
     * Set Count.
     * @param value - new value.
     */
    public void setCount(List<BlockPosition> value) {
        handle.getPositionCollectionModifier().write(0, value);
    }
    
    /**
     * Retrieve Properties.
     * @return The current Properties
     */
    public List<BlockPosition> getProperties() {
        return handle.getPositionCollectionModifier().read(0);
    }
    
    /**
     * Set Properties.
     * @param value - new value.
     */
    public void setProperties(List<BlockPosition> value) {
        handle.getPositionCollectionModifier().write(0, value);
    }
    
}


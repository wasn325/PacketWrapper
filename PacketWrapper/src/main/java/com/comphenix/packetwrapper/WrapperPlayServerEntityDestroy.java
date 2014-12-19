package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerEntityDestroy extends AbstractPacket {
    public static final PacketType TYPE = PacketType.Play.Server.ENTITY_DESTROY;
    
    public WrapperPlayServerEntityDestroy() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerEntityDestroy(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve Count.
     * <p>
     * Notes: length of following array
     * @return The current Count
     */
    public int getCount() {
        return (int) handle.getIntegerArrays().read(0);
    }
    
    /**
     * Set Count.
     * @param value - new value.
     */
    public void setCount(int value) {
        handle.getIntegerArrays().write(0, (int[]) value);
    }
    
    /**
     * Retrieve Entity IDs.
     * <p>
     * Notes: the list of entities of destroy
     * @return The current Entity IDs
     */
    public ofint[] getEntityIds() {
        return (ofint[]) handle.getIntegerArrays().read(0);
    }
    
    /**
     * Set Entity IDs.
     * @param value - new value.
     */
    public void setEntityIds(ofint[] value) {
        handle.getIntegerArrays().write(0, (int[]) value);
    }
    
}


package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerStatistics extends AbstractPacket {
    public static final PacketType TYPE = PacketType.Play.Server.STATISTICS;
    
    public WrapperPlayServerStatistics() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerStatistics(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve Count.
     * <p>
     * Notes: number of entries
     * @return The current Count
     */
    public int getCount() {
        return (int) handle.getSpecificModifier(Map.class).read(0);
    }
    
    /**
     * Set Count.
     * @param value - new value.
     */
    public void setCount(int value) {
        handle.getSpecificModifier(Map.class).write(0, (Map<?,?>) value);
    }
    
    /**
     * Retrieve Entry.
     * <p>
     * Notes: string
     * @return The current Entry
     */
    public statistic'sname getEntry() {
        return (statistic'sname) handle.getSpecificModifier(Map.class).read(0);
    }
    
    /**
     * Set Entry.
     * @param value - new value.
     */
    public void setEntry(statistic'sname value) {
        handle.getSpecificModifier(Map.class).write(0, (Map<?,?>) value);
    }
    
    // Cannot generate field Value
}


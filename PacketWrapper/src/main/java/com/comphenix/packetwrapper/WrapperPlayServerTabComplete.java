package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerTabComplete extends AbstractPacket {
    public static final PacketType TYPE = PacketType.Play.Server.TAB_COMPLETE;
    
    public WrapperPlayServerTabComplete() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerTabComplete(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve Count.
     * <p>
     * Notes: number of following strings
     * @return The current Count
     */
    public int getCount() {
        return (int) handle.getStringArrays().read(0);
    }
    
    /**
     * Set Count.
     * @param value - new value.
     */
    public void setCount(int value) {
        handle.getStringArrays().write(0, (String[]) value);
    }
    
    /**
     * Retrieve Match.
     * <p>
     * Notes: one eligible command, note that each command is sent separately instead of in a single string, hence the need for Count
     * @return The current Match
     */
    public String getMatch() {
        return (String) handle.getStringArrays().read(0);
    }
    
    /**
     * Set Match.
     * @param value - new value.
     */
    public void setMatch(String value) {
        handle.getStringArrays().write(0, (String[]) value);
    }
    
}


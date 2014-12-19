package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayClientResourcePackStatus extends AbstractPacket {
    public static final PacketType TYPE = PacketType.Play.Client.RESOURCE_PACK_STATUS;
    
    public WrapperPlayClientResourcePackStatus() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientResourcePackStatus(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve Hash.
     * <p>
     * Notes: the hash sent in the Resource Pack Send packet.
     * @return The current Hash
     */
    public String getHash() {
        return handle.getStrings().read(0);
    }
    
    /**
     * Set Hash.
     * @param value - new value.
     */
    public void setHash(String value) {
        handle.getStrings().write(0, value);
    }
    
    /**
     * Retrieve Result.
     * <p>
     * Notes: successfully loaded: 0, Declined: 1, Failed download: 2, Accepted: 3
     * @return The current Result
     */
    public int getResult() {
        return (int) handle.getSpecificModifier(Enum.class).read(0);
    }
    
    /**
     * Set Result.
     * @param value - new value.
     */
    public void setResult(int value) {
        handle.getSpecificModifier(Enum.class).write(0, (Enum<?>) value);
    }
    
}


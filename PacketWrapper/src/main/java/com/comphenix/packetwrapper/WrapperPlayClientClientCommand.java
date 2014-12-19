package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayClientClientCommand extends AbstractPacket {
    public static final PacketType TYPE = PacketType.Play.Client.CLIENT_COMMAND;
    
    public WrapperPlayClientClientCommand() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientClientCommand(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve Action ID.
     * <p>
     * Notes: see below
     * @return The current Action ID
     */
    public int getActionId() {
        return (int) handle.getSpecificModifier(Enum.class).read(0);
    }
    
    /**
     * Set Action ID.
     * @param value - new value.
     */
    public void setActionId(int value) {
        handle.getSpecificModifier(Enum.class).write(0, (Enum<?>) value);
    }
    
}


package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.EnumWrappers.CombatEventType;

public class WrapperPlayServerCombatEvent extends AbstractPacket {
    public static final PacketType TYPE = PacketType.Play.Server.COMBAT_EVENT;
    
    public WrapperPlayServerCombatEvent() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerCombatEvent(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve Event.
     * <p>
     * Notes: 0 ENTER_COMBAT, 1 END_COMBAT, 2 ENTITY_DEAD
     * @return The current Event
     */
    public CombatEventType getEvent() {
        return handle.getCombatEvents().read(0);
    }
    
    /**
     * Set Event.
     * @param value - new value.
     */
    public void setEvent(CombatEventType value) {
       handle.getCombatEvents().write(0, value);
    }

    // The fields in this class depend on the CombatEventType
    // TODO: Figure out a solution
}


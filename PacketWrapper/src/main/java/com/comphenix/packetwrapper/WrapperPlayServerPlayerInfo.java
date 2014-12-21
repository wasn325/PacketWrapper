package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.BlockPosition;

public class WrapperPlayServerPlayerInfo extends AbstractPacket {
    public static final PacketType TYPE = PacketType.Play.Server.PLAYER_INFO;
    
    public WrapperPlayServerPlayerInfo() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerPlayerInfo(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve Action.
     * @return The current Action
     */
    public int getAction() {
        return (int) handle.getSpecificModifier(Enum.class).read(0);
    }
    
    /**
     * Set Action.
     * @param value - new value.
     */
    public void setAction(int value) {
        handle.getSpecificModifier(Enum.class).write(0, (Enum<?>) value);
    }
    
    /**
     * Retrieve Length.
     * <p>
     * Notes: the following fields are repeated length times
     * @return The current Length
     */
    public List<BlockPosition> getLength() {
        return handle.getPositionCollectionModifier().read(0);
    }
    
    /**
     * Set Length.
     * @param value - new value.
     */
    public void setLength(List<BlockPosition> value) {
        handle.getPositionCollectionModifier().write(0, value);
    }
    
    /**
     * Retrieve UUID.
     * <p>
     * Notes: the uuid of the player
     * @return The current UUID
     */
    public List<BlockPosition> getUuid() {
        return handle.getPositionCollectionModifier().read(0);
    }
    
    /**
     * Set UUID.
     * @param value - new value.
     */
    public void setUuid(List<BlockPosition> value) {
        handle.getPositionCollectionModifier().write(0, value);
    }
    
    // Cannot generate getter a
    // Cannot generate setter a
    // Cannot generate field 0 (ADD_PLAYER)
    // Cannot generate field Number of properties
    // Cannot generate field Properties
    // Cannot generate field Value
    // Cannot generate field Is Signed
    // Cannot generate field Signature
    // Cannot generate field Gamemode
    // Cannot generate field Ping
    // Cannot generate field Has Display Name
    // Cannot generate field Display Name
    // Cannot generate field 1 (UPDATE_GAMEMODE)
    // Cannot generate field 2 (UPDATE_LATENCY)
    // Cannot generate field 3 (UPDATE_DISPLAY_NAME)
    // Cannot generate field Display Name
    // Cannot generate field 4 (REMOVE_PLAYER)
}


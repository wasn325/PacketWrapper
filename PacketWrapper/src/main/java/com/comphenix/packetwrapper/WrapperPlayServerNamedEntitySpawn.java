package com.comphenix.packetwrapper;

import java.util.UUID;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.WrappedDataWatcher;

public class WrapperPlayServerNamedEntitySpawn extends AbstractPacket {
    public static final PacketType TYPE = PacketType.Play.Server.NAMED_ENTITY_SPAWN;
    
    public WrapperPlayServerNamedEntitySpawn() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerNamedEntitySpawn(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve Entity ID.
     * <p>
     * Notes: player's Entity ID
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
     * Retrieve Player UUID.
     * <p>
     * Notes: player's UUID
     * @return The current Player UUID
     */
    public UUID getPlayerUuid() {
        return handle.getSpecificModifier(UUID.class).read(0);
    }
    
    /**
     * Set Player UUID.
     * @param value - new value.
     */
    public void setPlayerUuid(UUID value) {
        handle.getSpecificModifier(UUID.class).write(0, value);
    }
    
    /**
     * Retrieve X.
     * <p>
     * Notes: player X as a Fixed-Point number
     * @return The current X
     */
    public int getX() {
        return handle.getIntegers().read(1);
    }
    
    /**
     * Set X.
     * @param value - new value.
     */
    public void setX(int value) {
        handle.getIntegers().write(1, value);
    }
    
    /**
     * Retrieve Y.
     * <p>
     * Notes: player X as a Fixed-Point number
     * @return The current Y
     */
    public int getY() {
        return handle.getIntegers().read(2);
    }
    
    /**
     * Set Y.
     * @param value - new value.
     */
    public void setY(int value) {
        handle.getIntegers().write(2, value);
    }
    
    /**
     * Retrieve Z.
     * <p>
     * Notes: player X as a Fixed-Point number
     * @return The current Z
     */
    public int getZ() {
        return handle.getIntegers().read(3);
    }
    
    /**
     * Set Z.
     * @param value - new value.
     */
    public void setZ(int value) {
        handle.getIntegers().write(3, value);
    }
    
    /**
     * Retrieve Yaw.
     * <p>
     * Notes: player rotation as a packed byte
     * @return The current Yaw
     */
    public byte getYaw() {
        return handle.getBytes().read(0);
    }
    
    /**
     * Set Yaw.
     * @param value - new value.
     */
    public void setYaw(byte value) {
        handle.getBytes().write(0, value);
    }
    
    /**
     * Retrieve Pitch.
     * <p>
     * Notes: player rotation as a packet byte
     * @return The current Pitch
     */
    public byte getPitch() {
        return handle.getBytes().read(1);
    }
    
    /**
     * Set Pitch.
     * @param value - new value.
     */
    public void setPitch(byte value) {
        handle.getBytes().write(1, value);
    }
    
    /**
     * Retrieve Current Item.
     * <p>
     * Notes: the item the player is currently holding. Note that this should be 0 for "no item", unlike -1 used in other packets. A negative value crashes clients.
     * @return The current Current Item
     */
    public int getCurrentItem() {
        return handle.getIntegers().read(4);
    }
    
    /**
     * Set Current Item.
     * @param value - new value.
     */
    public void setCurrentItem(int value) {
        handle.getIntegers().write(4, value);
    }
    
    /**
     * Retrieve Metadata.
     * <p>
     * Notes: the client will crash if no metadata is sent
     * @return The current Metadata
     */
    public WrappedDataWatcher getMetadata() {
        return handle.getDataWatcherModifier().read(0);
    }
    
    /**
     * Set Metadata.
     * @param value - new value.
     */
    public void setMetadata(WrappedDataWatcher value) {
        handle.getDataWatcherModifier().write(0, value);
    }
    
}


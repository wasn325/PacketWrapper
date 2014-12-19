package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerExplosion extends AbstractPacket {
    public static final PacketType TYPE = PacketType.Play.Server.EXPLOSION;
    
    public WrapperPlayServerExplosion() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerExplosion(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve X.
     * @return The current X
     */
    public float getX() {
        return (float) handle.getDoubles().read(0);
    }
    
    /**
     * Set X.
     * @param value - new value.
     */
    public void setX(float value) {
        handle.getDoubles().write(0, (double) value);
    }
    
    /**
     * Retrieve Y.
     * @return The current Y
     */
    public float getY() {
        return (float) handle.getDoubles().read(1);
    }
    
    /**
     * Set Y.
     * @param value - new value.
     */
    public void setY(float value) {
        handle.getDoubles().write(1, (double) value);
    }
    
    /**
     * Retrieve Z.
     * @return The current Z
     */
    public float getZ() {
        return (float) handle.getDoubles().read(2);
    }
    
    /**
     * Set Z.
     * @param value - new value.
     */
    public void setZ(float value) {
        handle.getDoubles().write(2, (double) value);
    }
    
    /**
     * Retrieve Radius.
     * <p>
     * Notes: currently unused in the client
     * @return The current Radius
     */
    public float getRadius() {
        return handle.getFloat().read(0);
    }
    
    /**
     * Set Radius.
     * @param value - new value.
     */
    public void setRadius(float value) {
        handle.getFloat().write(0, value);
    }
    
    /**
     * Retrieve Record count.
     * <p>
     * Notes: this is the count, not the size. The size is 3 times this value.
     * @return The current Record count
     */
    public List<BlockPosition> getRecordCount() {
        return handle.getPositionCollectionModifier().read(0);
    }
    
    /**
     * Set Record count.
     * @param value - new value.
     */
    public void setRecordCount(List<BlockPosition> value) {
        handle.getPositionCollectionModifier().write(0, value);
    }
    
    /**
     * Retrieve Records.
     * <p>
     * Notes: each record is 3 signed bytes long, each bytes are the XYZ (respectively) offsets of affected blocks.
     * @return The current Records
     */
    public (byte,byte,byte)×count getRecords() {
        return ((byte,byte,byte)×count) handle.getDoubles().read(0);
    }
    
    /**
     * Set Records.
     * @param value - new value.
     */
    public void setRecords((byte,byte,byte)×count value) {
        handle.getDoubles().write(0, (double) value);
    }
    
    /**
     * Retrieve Player Motion X.
     * <p>
     * Notes: x velocity of the player being pushed by the explosion
     * @return The current Player Motion X
     */
    public float getPlayerMotionX() {
        return (float) handle.getDoubles().read(1);
    }
    
    /**
     * Set Player Motion X.
     * @param value - new value.
     */
    public void setPlayerMotionX(float value) {
        handle.getDoubles().write(1, (double) value);
    }
    
    /**
     * Retrieve Player Motion Y.
     * <p>
     * Notes: y velocity of the player being pushed by the explosion
     * @return The current Player Motion Y
     */
    public float getPlayerMotionY() {
        return (float) handle.getDoubles().read(2);
    }
    
    /**
     * Set Player Motion Y.
     * @param value - new value.
     */
    public void setPlayerMotionY(float value) {
        handle.getDoubles().write(2, (double) value);
    }
    
    /**
     * Retrieve Player Motion Z.
     * <p>
     * Notes: z velocity of the player being pushed by the explosion
     * @return The current Player Motion Z
     */
    public List<BlockPosition> getPlayerMotionZ() {
        return handle.getPositionCollectionModifier().read(0);
    }
    
    /**
     * Set Player Motion Z.
     * @param value - new value.
     */
    public void setPlayerMotionZ(List<BlockPosition> value) {
        handle.getPositionCollectionModifier().write(0, value);
    }
    
}


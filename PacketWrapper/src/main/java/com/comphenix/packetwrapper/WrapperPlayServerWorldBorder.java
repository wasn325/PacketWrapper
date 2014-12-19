package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerWorldBorder extends AbstractPacket {
    public static final PacketType TYPE = PacketType.Play.Server.WORLD_BORDER;
    
    public WrapperPlayServerWorldBorder() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerWorldBorder(PacketContainer packet) {
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
    
    // Cannot generate getter a
    // Cannot generate setter a
    /**
     * Retrieve 0 (SET_SIZE).
     * <p>
     * Notes: double
     * @return The current 0 (SET_SIZE)
     */
    public radius get0Set_size() {
        return (radius) handle.getDoubles().read(2);
    }
    
    /**
     * Set 0 (SET_SIZE).
     * @param value - new value.
     */
    public void set0Set_size(radius value) {
        handle.getDoubles().write(2, (double) value);
    }
    
    /**
     * Retrieve 1 (LERP_SIZE).
     * <p>
     * Notes: double
     * @return The current 1 (LERP_SIZE)
     */
    public oldradius get1Lerp_size() {
        return (oldradius) handle.getDoubles().read(3);
    }
    
    /**
     * Set 1 (LERP_SIZE).
     * @param value - new value.
     */
    public void set1Lerp_size(oldradius value) {
        handle.getDoubles().write(3, (double) value);
    }
    
    /**
     * Retrieve New radius.
     * @return The current New radius
     */
    public double getNewRadius() {
        return handle.getDoubles().read(2);
    }
    
    /**
     * Set New radius.
     * @param value - new value.
     */
    public void setNewRadius(double value) {
        handle.getDoubles().write(2, value);
    }
    
    /**
     * Retrieve Speed.
     * @return The current Speed
     */
    public varlong getSpeed() {
        return (varlong) handle.getLongs().read(0);
    }
    
    /**
     * Set Speed.
     * @param value - new value.
     */
    public void setSpeed(varlong value) {
        handle.getLongs().write(0, (long) value);
    }
    
    /**
     * Retrieve 2 (SET_CENTER).
     * <p>
     * Notes: double
     * @return The current 2 (SET_CENTER)
     */
    public x get2Set_center() {
        return (x) handle.getDoubles().read(0);
    }
    
    /**
     * Set 2 (SET_CENTER).
     * @param value - new value.
     */
    public void set2Set_center(x value) {
        handle.getDoubles().write(0, (double) value);
    }
    
    /**
     * Retrieve Z.
     * @return The current Z
     */
    public double getZ() {
        return handle.getDoubles().read(1);
    }
    
    /**
     * Set Z.
     * @param value - new value.
     */
    public void setZ(double value) {
        handle.getDoubles().write(1, value);
    }
    
    /**
     * Retrieve 3 (INITIALIZE).
     * <p>
     * Notes: double
     * @return The current 3 (INITIALIZE)
     */
    public x get3Initialize() {
        return (x) handle.getIntegers().read(1);
    }
    
    /**
     * Set 3 (INITIALIZE).
     * @param value - new value.
     */
    public void set3Initialize(x value) {
        handle.getIntegers().write(1, (int) value);
    }
    
    /**
     * Retrieve Z.
     * @return The current Z
     */
    public double getZ() {
        return (double) handle.getIntegers().read(2);
    }
    
    /**
     * Set Z.
     * @param value - new value.
     */
    public void setZ(double value) {
        handle.getIntegers().write(2, (int) value);
    }
    
    /**
     * Retrieve Old radius.
     * @return The current Old radius
     */
    public double getOldRadius() {
        return handle.getDoubles().read(0);
    }
    
    /**
     * Set Old radius.
     * @param value - new value.
     */
    public void setOldRadius(double value) {
        handle.getDoubles().write(0, value);
    }
    
    /**
     * Retrieve New radius.
     * @return The current New radius
     */
    public double getNewRadius() {
        return handle.getDoubles().read(1);
    }
    
    /**
     * Set New radius.
     * @param value - new value.
     */
    public void setNewRadius(double value) {
        handle.getDoubles().write(1, value);
    }
    
    /**
     * Retrieve Speed.
     * @return The current Speed
     */
    public varlong getSpeed() {
        return (varlong) handle.getDoubles().read(3);
    }
    
    /**
     * Set Speed.
     * @param value - new value.
     */
    public void setSpeed(varlong value) {
        handle.getDoubles().write(3, (double) value);
    }
    
    /**
     * Retrieve Portal Teleport Boundary.
     * <p>
     * Notes: resulting coordinates from a portal teleport are limited to +-value. Usually 29999984.
     * @return The current Portal Teleport Boundary
     */
    public int getPortalTeleportBoundary() {
        return (int) handle.getDoubles().read(2);
    }
    
    /**
     * Set Portal Teleport Boundary.
     * @param value - new value.
     */
    public void setPortalTeleportBoundary(int value) {
        handle.getDoubles().write(2, (double) value);
    }
    
    /**
     * Retrieve Warning time.
     * @return The current Warning time
     */
    public int getWarningTime() {
        return (int) handle.getLongs().read(0);
    }
    
    /**
     * Set Warning time.
     * @param value - new value.
     */
    public void setWarningTime(int value) {
        handle.getLongs().write(0, (long) value);
    }
    
    /**
     * Retrieve Warning blocks.
     * @return The current Warning blocks
     */
    public int getWarningBlocks() {
        return handle.getIntegers().read(0);
    }
    
    /**
     * Set Warning blocks.
     * @param value - new value.
     */
    public void setWarningBlocks(int value) {
        handle.getIntegers().write(0, value);
    }
    
    /**
     * Retrieve 4 (SET_WARNING_TIME).
     * <p>
     * Notes: varInt
     * @return The current 4 (SET_WARNING_TIME)
     */
    public warningtime get4Set_warning_time() {
        return (warningtime) handle.getIntegers().read(2);
    }
    
    /**
     * Set 4 (SET_WARNING_TIME).
     * @param value - new value.
     */
    public void set4Set_warning_time(warningtime value) {
        handle.getIntegers().write(2, (int) value);
    }
    
    /**
     * Retrieve 5 (SET_WARNING_BLOCKS).
     * <p>
     * Notes: varInt
     * @return The current 5 (SET_WARNING_BLOCKS)
     */
    public warningblocks get5Set_warning_blocks() {
        return (warningblocks) handle.getIntegers().read(1);
    }
    
    /**
     * Set 5 (SET_WARNING_BLOCKS).
     * @param value - new value.
     */
    public void set5Set_warning_blocks(warningblocks value) {
        handle.getIntegers().write(1, (int) value);
    }
    
}


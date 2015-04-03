/**
 * This file is part of PacketWrapper.
 * Copyright (C) 2012-2015 Kristian S. Strangeland
 * Copyright (C) 2015 dmulloy2
 *
 * PacketWrapper is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * PacketWrapper is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with PacketWrapper.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerSpawnEntity extends AbstractPacket {
    public static final PacketType TYPE = PacketType.Play.Server.SPAWN_ENTITY;
    
    public WrapperPlayServerSpawnEntity() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerSpawnEntity(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve Entity ID.
     * <p>
     * Notes: entity ID of the object
     * @return The current Entity ID
     */
    public int getEntityID() {
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
     * Retrieve Type.
     * <p>
     * Notes: the type of object (See Objects)
     * @return The current Type
     */
    public int getType() {
        return handle.getIntegers().read(9);
    }
    
    /**
     * Set Type.
     * @param value - new value.
     */
    public void setType(int value) {
        handle.getIntegers().write(9, value);
    }
    
    /**
     * Retrieve X.
     * <p>
     * Notes: x position as a Fixed-Point number
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
     * Notes: y position as a Fixed-Point number
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
     * Notes: z position as a Fixed-Point number
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
     * Retrieve Pitch.
     * <p>
     * Notes: the pitch in steps of 2p/256
     * @return The current Pitch
     */
    public int getPitch() {
        return handle.getIntegers().read(7);
    }
    
    /**
     * Set Pitch.
     * @param value - new value.
     */
    public void setPitch(int value) {
        handle.getIntegers().write(7, value);
    }
    
    /**
     * Retrieve Yaw.
     * <p>
     * Notes: the yaw in steps of 2p/256
     * @return The current Yaw
     */
    public int getYaw() {
        return handle.getIntegers().read(8);
    }
    
    /**
     * Set Yaw.
     * @param value - new value.
     */
    public void setYaw(int value) {
        handle.getIntegers().write(8, value);
    }
    
}


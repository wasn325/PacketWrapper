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

public class WrapperPlayServerEntityLook extends AbstractPacket {
    public static final PacketType TYPE = PacketType.Play.Server.ENTITY_LOOK;
    
    public WrapperPlayServerEntityLook() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerEntityLook(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve Entity ID.
     * <p>
     * Notes: entity's ID
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
     * Retrieve Yaw.
     * <p>
     * Notes: the X Axis rotation as a fraction of 360
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
     * Notes: the Y Axis rotation as a fraction of 360
     * @return The current Pitch
     */
    public byte getPitch() {
        return handle.getBytes().read(0);
    }
    
    /**
     * Set Pitch.
     * @param value - new value.
     */
    public void setPitch(byte value) {
        handle.getBytes().write(0, value);
    }
    
    /**
     * Retrieve On Ground.
     * @return The current On Ground
     */
    public boolean getOnGround() {
        return handle.getSpecificModifier(boolean.class).read(0);
    }
    
    /**
     * Set On Ground.
     * @param value - new value.
     */
    public void setOnGround(boolean value) {
        handle.getSpecificModifier(boolean.class).write(0, value);
    }
    
}


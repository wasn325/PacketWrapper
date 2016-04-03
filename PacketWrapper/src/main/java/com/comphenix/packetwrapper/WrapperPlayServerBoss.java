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

import java.util.UUID;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerBoss extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.BOSS;
    
    public WrapperPlayServerBoss() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerBoss(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve UUID.
     * <p>
     * Notes: unique ID for this bar
     * @return The current UUID
     */
    public UUID getUniqueId() {
        return handle.getSpecificModifier(UUID.class).read(0);
    }
    
    /**
     * Set UUID.
     * @param value - new value.
     */
    public void setUniqueId(UUID value) {
        handle.getSpecificModifier(UUID.class).write(0, value);
    }
    
    // TODO This field changes based on the action
}

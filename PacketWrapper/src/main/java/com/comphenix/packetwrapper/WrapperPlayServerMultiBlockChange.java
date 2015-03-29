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
import com.comphenix.protocol.wrappers.ChunkCoordIntPair;

public class WrapperPlayServerMultiBlockChange extends AbstractPacket {
    public static final PacketType TYPE = PacketType.Play.Server.MULTI_BLOCK_CHANGE;
    
    public WrapperPlayServerMultiBlockChange() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerMultiBlockChange(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve Chunk X.
     * <p>
     * Notes: chunk X coordinate
     * @return The current Chunk X
     */
    public ChunkCoordIntPair getChunkX() {
        return handle.getChunkCoordIntPairs().read(0);
    }
    
    /**
     * Set Chunk X.
     * @param value - new value.
     */
    public void setChunkX(ChunkCoordIntPair value) {
        handle.getChunkCoordIntPairs().write(0, value);
    }
    
    /**
     * Retrieve Chunk Z.
     * <p>
     * Notes: chunk Z Coordinate
     * @return The current Chunk Z
     */
    public ChunkCoordIntPair getChunkZ() {
        return handle.getChunkCoordIntPairs().read(0);
    }
    
    /**
     * Set Chunk Z.
     * @param value - new value.
     */
    public void setChunkZ(ChunkCoordIntPair value) {
        handle.getChunkCoordIntPairs().write(0, value);
    }
    
    // Cannot find type for b
    // Cannot find type for b
}


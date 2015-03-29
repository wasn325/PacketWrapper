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
import com.comphenix.protocol.wrappers.WrappedChatComponent;

public class WrapperPlayServerChat extends AbstractPacket {
    public static final PacketType TYPE = PacketType.Play.Server.CHAT;
    
    public WrapperPlayServerChat() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerChat(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve JSON Data.
     * <p>
     * Notes: chat , Limited to 32767 bytes
     * @return The current JSON Data
     */
    public WrappedChatComponent getJsonData() {
        return handle.getChatComponents().read(0);
    }
    
    /**
     * Set JSON Data.
     * @param value - new value.
     */
    public void setJsonData(WrappedChatComponent value) {
        handle.getChatComponents().write(0, value);
    }
    
    /**
     * Retrieve Position.
     * <p>
     * Notes: 0 - Chat (chat box) ,1 - System Message (chat box), 2 - Above action bar
     * @return The current Position
     */
    public byte getPosition() {
        return handle.getBytes().read(0);
    }
    
    /**
     * Set Position.
     * @param value - new value.
     */
    public void setPosition(byte value) {
        handle.getBytes().write(0, value);
    }
    
}


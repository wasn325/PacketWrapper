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

import org.bukkit.inventory.ItemStack;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerEntityEquipment extends AbstractPacket {
    public static final PacketType TYPE = PacketType.Play.Server.ENTITY_EQUIPMENT;
    
    public WrapperPlayServerEntityEquipment() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerEntityEquipment(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve EntityID.
     * <p>
     * Notes: entity's ID
     * @return The current EntityID
     */
    public int getEntityid() {
        return handle.getIntegers().read(0);
    }
    
    /**
     * Set EntityID.
     * @param value - new value.
     */
    public void setEntityid(int value) {
        handle.getIntegers().write(0, value);
    }
    
    /**
     * Retrieve Slot.
     * <p>
     * Notes: equipment slot: 0=held, 1-4=armor slot (1 - boots, 2 - leggings, 3 - chestplate, 4 - helmet)
     * @return The current Slot
     */
    public int getSlot() {
        return handle.getIntegers().read(1);
    }
    
    /**
     * Set Slot.
     * @param value - new value.
     */
    public void setSlot(int value) {
        handle.getIntegers().write(1, value);
    }
    
    /**
     * Retrieve Item.
     * <p>
     * Notes: item in slot format
     * @return The current Item
     */
    public ItemStack getItem() {
        return handle.getItemModifier().read(0);
    }
    
    /**
     * Set Item.
     * @param value - new value.
     */
    public void setItem(ItemStack value) {
        handle.getItemModifier().write(0, value);
    }
    
}


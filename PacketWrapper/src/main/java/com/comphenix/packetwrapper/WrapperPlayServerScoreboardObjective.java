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

public class WrapperPlayServerScoreboardObjective extends AbstractPacket {
    public static final PacketType TYPE = PacketType.Play.Server.SCOREBOARD_OBJECTIVE;
    
    public WrapperPlayServerScoreboardObjective() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerScoreboardObjective(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve Objective name.
     * <p>
     * Notes: an unique name for the objective
     * @return The current Objective name
     */
    public String getObjectiveName() {
        return handle.getStrings().read(0);
    }
    
    /**
     * Set Objective name.
     * @param value - new value.
     */
    public void setObjectiveName(String value) {
        handle.getStrings().write(0, value);
    }
    
    /**
     * Retrieve Mode.
     * <p>
     * Notes: 0 to create the scoreboard. 1 to remove the scoreboard. 2 to update the display text.
     * @return The current Mode
     */
    public int getMode() {
        return handle.getIntegers().read(0);
    }
    
    /**
     * Set Mode.
     * @param value - new value.
     */
    public void setMode(int value) {
        handle.getIntegers().write(0, value);
    }
    
    /**
     * Retrieve Objective value.
     * <p>
     * Notes: only if mode is 0 or 2. The text to be displayed for the score.
     * @return The current Objective value
     */
    public String getObjectiveValue() {
        return handle.getStrings().read(0);
    }
    
    /**
     * Set Objective value.
     * @param value - new value.
     */
    public void setObjectiveValue(String value) {
        handle.getStrings().read(0);
    }

    // TODO: Type
    
}


package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerScoreboardTeam extends AbstractPacket {
    public static final PacketType TYPE = PacketType.Play.Server.SCOREBOARD_TEAM;
    
    public WrapperPlayServerScoreboardTeam() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerScoreboardTeam(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve Team Name.
     * <p>
     * Notes: a unique name for the team. (Shared with scoreboard).
     * @return The current Team Name
     */
    public String getTeamName() {
        return handle.getStrings().read(0);
    }
    
    /**
     * Set Team Name.
     * @param value - new value.
     */
    public void setTeamName(String value) {
        handle.getStrings().write(0, value);
    }
    
    /**
     * Retrieve Mode.
     * <p>
     * Notes: if 0 then the team is created. If 1 then the team is removed. If 2 the team team information is updated. If 3 then new players are added to the team. If 4 then players are removed from the team.
     * @return The current Mode
     */
    public byte getMode() {
        return (byte) handle.getIntegers().read(1);
    }
    
    /**
     * Set Mode.
     * @param value - new value.
     */
    public void setMode(byte value) {
        handle.getIntegers().write(1, (int) value);
    }
    
    /**
     * Retrieve Team Display Name.
     * <p>
     * Notes: only if Mode = 0 or 2.
     * @return The current Team Display Name
     */
    public String getTeamDisplayName() {
        return (String) handle.getIntegers().read(1);
    }
    
    /**
     * Set Team Display Name.
     * @param value - new value.
     */
    public void setTeamDisplayName(String value) {
        handle.getIntegers().write(1, (int) value);
    }
    
    /**
     * Retrieve Team Prefix.
     * <p>
     * Notes: only if Mode = 0 or 2. Displayed before the players' name that are part of this team.
     * @return The current Team Prefix
     */
    public String getTeamPrefix() {
        return handle.getStrings().read(1);
    }
    
    /**
     * Set Team Prefix.
     * @param value - new value.
     */
    public void setTeamPrefix(String value) {
        handle.getStrings().write(1, value);
    }
    
    /**
     * Retrieve Team Suffix.
     * <p>
     * Notes: only if Mode = 0 or 2. Displayed after the players' name that are part of this team.
     * @return The current Team Suffix
     */
    public String getTeamSuffix() {
        return handle.getStrings().read(2);
    }
    
    /**
     * Set Team Suffix.
     * @param value - new value.
     */
    public void setTeamSuffix(String value) {
        handle.getStrings().write(2, value);
    }
    
    /**
     * Retrieve Friendly fire.
     * <p>
     * Notes: only if Mode = 0 or 2; 0 for off, 1 for on, 3 for seeing friendly invisibles
     * @return The current Friendly fire
     */
    public byte getFriendlyFire() {
        return (byte) handle.getStrings().read(3);
    }
    
    /**
     * Set Friendly fire.
     * @param value - new value.
     */
    public void setFriendlyFire(byte value) {
        handle.getStrings().write(3, (String) value);
    }
    
    /**
     * Retrieve Name Tag Visibility.
     * <p>
     * Notes: only if Mode = 0 or 2. always, hideForOtherTeams, hideForOwnTeam, never.
     * @return The current Name Tag Visibility
     */
    public String getNameTagVisibility() {
        return (String) handle.getIntegers().read(2);
    }
    
    /**
     * Set Name Tag Visibility.
     * @param value - new value.
     */
    public void setNameTagVisibility(String value) {
        handle.getIntegers().write(2, (int) value);
    }
    
    /**
     * Retrieve Color.
     * <p>
     * Notes: only if Mode = 0 or 2. Same as Chat colors.
     * @return The current Color
     */
    public byte getColor() {
        return (byte) handle.getStrings().read(4);
    }
    
    /**
     * Set Color.
     * @param value - new value.
     */
    public void setColor(byte value) {
        handle.getStrings().write(4, (String) value);
    }
    
    /**
     * Retrieve Player count.
     * <p>
     * Notes: only if Mode = 0 or 3 or 4. Number of players in the array
     * @return The current Player count
     */
    public int getPlayerCount() {
        return handle.getIntegers().read(0);
    }
    
    /**
     * Set Player count.
     * @param value - new value.
     */
    public void setPlayerCount(int value) {
        handle.getIntegers().write(0, value);
    }
    
    /**
     * Retrieve Players.
     * <p>
     * Notes: only if Mode = 0 or 3 or 4. Players to be added/remove from the team. Max 40 characters so may be uuid's later
     * @return The current Players
     */
    public ofStrings[] getPlayers() {
        return (ofStrings[]) handle.getIntegers().read(1);
    }
    
    /**
     * Set Players.
     * @param value - new value.
     */
    public void setPlayers(ofStrings[] value) {
        handle.getIntegers().write(1, (int) value);
    }
    
}


package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayClientSettings extends AbstractPacket {
    public static final PacketType TYPE = PacketType.Play.Client.SETTINGS;
    
    public WrapperPlayClientSettings() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientSettings(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve Locale.
     * <p>
     * Notes: en_GB
     * @return The current Locale
     */
    public String getLocale() {
        return handle.getStrings().read(0);
    }
    
    /**
     * Set Locale.
     * @param value - new value.
     */
    public void setLocale(String value) {
        handle.getStrings().write(0, value);
    }
    
    /**
     * Retrieve View distance.
     * <p>
     * Notes: client-side render distance(chunks)
     * @return The current View distance
     */
    public byte getViewDistance() {
        return (byte) handle.getIntegers().read(0);
    }
    
    /**
     * Set View distance.
     * @param value - new value.
     */
    public void setViewDistance(byte value) {
        handle.getIntegers().write(0, (int) value);
    }
    
    /**
     * Retrieve Chat flags.
     * <p>
     * Notes: chat settings. See notes below.
     * @return The current Chat flags
     */
    public byte getChatFlags() {
        return (byte) handle.getSpecificModifier(Enum.class).read(0);
    }
    
    /**
     * Set Chat flags.
     * @param value - new value.
     */
    public void setChatFlags(byte value) {
        handle.getSpecificModifier(Enum.class).write(0, (Enum<?>) value);
    }
    
    /**
     * Retrieve Chat colours.
     * <p>
     * Notes: "Colours" multiplayer setting
     * @return The current Chat colours
     */
    public boolean getChatColours() {
        return (boolean) handle.getSpecificModifier(boolean.class).read(0);
    }
    
    /**
     * Set Chat colours.
     * @param value - new value.
     */
    public void setChatColours(boolean value) {
        handle.getSpecificModifier(boolean.class).write(0, (boolean) value);
    }
    
    /**
     * Retrieve Displayed skin parts.
     * <p>
     * Notes: skin parts. See note below
     * @return The current Displayed skin parts
     */
    public byte getDisplayedSkinParts() {
        return (byte) handle.getIntegers().read(1);
    }
    
    /**
     * Set Displayed skin parts.
     * @param value - new value.
     */
    public void setDisplayedSkinParts(byte value) {
        handle.getIntegers().write(1, (int) value);
    }
    
}


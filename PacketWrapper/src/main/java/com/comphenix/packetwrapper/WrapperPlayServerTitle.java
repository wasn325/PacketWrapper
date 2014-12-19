package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerTitle extends AbstractPacket {
    public static final PacketType TYPE = PacketType.Play.Server.TITLE;
    
    public WrapperPlayServerTitle() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerTitle(PacketContainer packet) {
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
     * Retrieve 0 (TITLE).
     * <p>
     * Notes: chat
     * @return The current 0 (TITLE)
     */
    public WrappedChatComponent get0Title() {
        return handle.getChatComponents().read(0);
    }
    
    /**
     * Set 0 (TITLE).
     * @param value - new value.
     */
    public void set0Title(WrappedChatComponent value) {
        handle.getChatComponents().write(0, value);
    }
    
    /**
     * Retrieve 1 (SUBTITLE).
     * <p>
     * Notes: chat
     * @return The current 1 (SUBTITLE)
     */
    public text get1Subtitle() {
        return (text) handle.getSpecificModifier(Enum.class).read(0);
    }
    
    /**
     * Set 1 (SUBTITLE).
     * @param value - new value.
     */
    public void set1Subtitle(text value) {
        handle.getSpecificModifier(Enum.class).write(0, (Enum<?>) value);
    }
    
    /**
     * Retrieve 2 (TIMES).
     * <p>
     * Notes: int
     * @return The current 2 (TIMES)
     */
    public fadein get2Times() {
        return (fadein) handle.getIntegers().read(0);
    }
    
    /**
     * Set 2 (TIMES).
     * @param value - new value.
     */
    public void set2Times(fadein value) {
        handle.getIntegers().write(0, (int) value);
    }
    
    /**
     * Retrieve Stay.
     * @return The current Stay
     */
    public int getStay() {
        return handle.getIntegers().read(1);
    }
    
    /**
     * Set Stay.
     * @param value - new value.
     */
    public void setStay(int value) {
        handle.getIntegers().write(1, value);
    }
    
    /**
     * Retrieve Fade Out.
     * @return The current Fade Out
     */
    public int getFadeOut() {
        return handle.getIntegers().read(2);
    }
    
    /**
     * Set Fade Out.
     * @param value - new value.
     */
    public void setFadeOut(int value) {
        handle.getIntegers().write(2, value);
    }
    
    // Cannot generate field 3 (CLEAR)
    // Cannot generate field 4 (RESET)
}


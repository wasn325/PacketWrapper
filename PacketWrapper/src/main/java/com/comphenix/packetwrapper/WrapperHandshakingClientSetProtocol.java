package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperHandshakingClientSetProtocol extends AbstractPacket {
    public static final PacketType TYPE = PacketType.Handshaking.Client.SET_PROTOCOL;
    
    public WrapperHandshakingClientSetProtocol() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }
    
    public WrapperHandshakingClientSetProtocol(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve Protocol Version.
     * <p>
     * Notes: (4 as of 1.7.2)
     * @return The current Protocol Version
     */
    public int getProtocolVersion() {
        return handle.getIntegers().read(0);
    }
    
    /**
     * Set Protocol Version.
     * @param value - new value.
     */
    public void setProtocolVersion(int value) {
        handle.getIntegers().write(0, value);
    }
    
    /**
     * Retrieve Server Address (hostname or IP).
     * <p>
     * Notes: localhost
     * @return The current Server Address (hostname or IP)
     */
    public String getServerAddressHostnameOrIp() {
        return handle.getStrings().read(0);
    }
    
    /**
     * Set Server Address (hostname or IP).
     * @param value - new value.
     */
    public void setServerAddressHostnameOrIp(String value) {
        handle.getStrings().write(0, value);
    }
    
    /**
     * Retrieve Server Port.
     * <p>
     * Notes: 25565
     * @return The current Server Port
     */
    public short getServerPort() {
        return (short) handle.getIntegers().read(1);
    }
    
    /**
     * Set Server Port.
     * @param value - new value.
     */
    public void setServerPort(short value) {
        handle.getIntegers().write(1, (int) value);
    }
    
    /**
     * Retrieve Next state.
     * <p>
     * Notes: 1 for status, 2 for login
     * @return The current Next state
     */
    public int getNextState() {
        return (int) handle.getSpecificModifier(Enum.class).read(0);
    }
    
    /**
     * Set Next state.
     * @param value - new value.
     */
    public void setNextState(int value) {
        handle.getSpecificModifier(Enum.class).write(0, (Enum<?>) value);
    }
    
}


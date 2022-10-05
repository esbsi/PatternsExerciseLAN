package be.abis.patternsexercise.observer;

import be.abis.patternsexercise.model.LanComponent;

public interface PacketReceivedListener {

    void confirmWorkstationReceivedPacketArrivedEvent(LanComponent eventOrigin, String reason);

}

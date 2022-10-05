package be.abis.patternsexercise.model;

import be.abis.patternsexercise.observer.PacketReceivedListener;

public class WorkStation extends Node implements PacketReceivedListener {

    public WorkStation(String address) {
        super(address);
    }


    // business

    public void originate(PacketComponent packet){
        packet.setOriginAddress(this.getAddress());
        this.getNextComponent().receive(packet);
    }

    @Override
    public void confirmWorkstationReceivedPacketArrivedEvent(LanComponent eventOrigin, String reason) {
        System.out.println("\nWorkstation " + this.getAddress() + " received event '" + reason + "' from packet handler '" + eventOrigin.getClass().getSimpleName() + " " + eventOrigin.getAddress() + "'.");
    }

}

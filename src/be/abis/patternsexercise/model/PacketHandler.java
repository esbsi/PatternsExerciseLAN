package be.abis.patternsexercise.model;

import be.abis.patternsexercise.observer.PacketReceivedListener;

import java.util.ArrayList;
import java.util.List;

public abstract class PacketHandler extends Node {

    private static List<PacketReceivedListener> workstations = new ArrayList<>();

    public PacketHandler(String address) {
        super(address);
    }

    // business

    @Override
    public void receive(PacketComponent packet) {
        if (packet.getDestinationAddress().equals(this.getAddress())){
            PacketReceivedListener origin = findWorkStation(packet.getOriginAddress());
            ((PacketReceivedListener)origin).confirmWorkstationReceivedPacketArrivedEvent(this, "Packet arrived");
            if ("SuperPacket".equals(packet.getClass().getSimpleName())){
                String contents = "";
                List<PacketComponent> sentencePackets = ((SuperPacket)packet).getPacketComponents();
                for (PacketComponent sentencePacket : sentencePackets){
                    List<PacketComponent> wordPackets = ((SuperPacket)sentencePacket).getPacketComponents();
                    for (PacketComponent wordPacket : wordPackets){
                        String word = wordPacket.getContents();
                        contents += word + " ";
                    }
                    contents = contents.replaceAll("\\s+$", "");
                    contents += ".";
                }
                PacketComponent reassembledPacket = new Packet(packet.getDestinationAddress(), contents);
                packet = reassembledPacket;
            }
            this.handle(packet);
        } else {
            this.getNextComponent().receive(packet);
        }
    }

    public abstract void handle(PacketComponent packet);


    public static void addWorkstation(PacketReceivedListener workstation){
        workstations.add(workstation);
    }

    public static void removeWorkstation(PacketReceivedListener workstation){
        workstations.remove(workstation);
    }

    public PacketReceivedListener findWorkStation(String address){
        for (PacketReceivedListener workstation : this.workstations){
            if (address.equals(((LanComponent)workstation).getAddress())){
                return workstation;
            }
        }
        System.out.println("Workstation with address " + address + " not found.");
        return null;
    }


}

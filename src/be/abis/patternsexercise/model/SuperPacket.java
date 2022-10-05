package be.abis.patternsexercise.model;

import java.util.ArrayList;
import java.util.List;

public class SuperPacket implements PacketComponent{

    private String destinationAddress;
    private String contents;

    private List<PacketComponent> packetComponents = new ArrayList<>() ;

    public SuperPacket(String destinationAddress, String contents) {
        this.destinationAddress = destinationAddress;
        this.contents = contents;
    }


    // business

    public void addPacketComponent(PacketComponent packetComponent){packetComponents.add(packetComponent);}


    // getset


    public List<PacketComponent> getPacketComponents() {
        return packetComponents;
    }

    public void setPacketComponents(List<PacketComponent> packetComponents) {
        this.packetComponents = packetComponents;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}

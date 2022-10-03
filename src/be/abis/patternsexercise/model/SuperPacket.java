package be.abis.patternsexercise.model;

import java.util.ArrayList;
import java.util.List;

public class SuperPacket implements PacketComponent{

    private List<PacketComponent> packetComponents = new ArrayList<>();



    // getset


    public List<PacketComponent> getPacketComponents() {
        return packetComponents;
    }

    public void setPacketComponents(List<PacketComponent> packetComponents) {
        this.packetComponents = packetComponents;
    }
}

package be.abis.patternsexercise.test;

import be.abis.patternsexercise.model.*;

public class Test {
    public static void main(String[] args) {

        LanComponentFactory lanComponentFactory = LanComponentFactory.getInstance();
//        lanComponentFactory.createLanComponent(ComponentType.WORKSTATION, "1");



//        Packet packet1 = new Packet("10", "test message");
        PacketFactory textPacketFactory = PacketFactory.createPacketFactory(PacketType.TEXT);
        Packet packet1 = textPacketFactory.createPacket("8", "Simple LAN factory test message");
        Packet packet2 = textPacketFactory.createPacket("11", "Extended LAN factory test message");


        SimpleLanFactory simpleLanFactory = SimpleLanFactory.getInstance();
        simpleLanFactory.createNodes();
        simpleLanFactory.createLan(simpleLanFactory.getNodes());
        (simpleLanFactory.findWorkStation(simpleLanFactory.getNodes(), "1")).originate(packet1);

        ExtendedLanFactory extendedLanFactory = ExtendedLanFactory.getInstance();
        extendedLanFactory.createNodes();
        extendedLanFactory.createLan(extendedLanFactory.getNodes());
        extendedLanFactory.findWorkStation(extendedLanFactory.getNodes(), "2").originate(packet2);



    }
}

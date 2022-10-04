package be.abis.patternsexercise.factory;

import be.abis.patternsexercise.model.Packet;
import be.abis.patternsexercise.model.PacketComponent;
import be.abis.patternsexercise.model.PacketType;
import be.abis.patternsexercise.model.SuperPacket;

public abstract class PacketFactory {
    public static PacketFactory createPacketFactory(PacketType packetType){
        switch (packetType){
            default:
            case TEXT : return SuperPacketFactory.getInstance();
        }
    }

    public abstract PacketComponent createPacket(String destinationAddress, String contents);

}

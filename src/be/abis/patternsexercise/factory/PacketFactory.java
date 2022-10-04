package be.abis.patternsexercise.factory;

import be.abis.patternsexercise.model.PacketComponent;
import be.abis.patternsexercise.enums.PacketType;

public abstract class PacketFactory {
    public static PacketFactory createPacketFactory(PacketType packetType){
        switch (packetType){
            default:
            case TEXT : return TextPacketFactory.getInstance();
            case SUPER: return SuperPacketFactory.getInstance();
        }
    }

    public abstract PacketComponent createPacket(String destinationAddress, String contents);

}

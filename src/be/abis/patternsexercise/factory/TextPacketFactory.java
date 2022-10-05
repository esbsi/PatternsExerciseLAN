package be.abis.patternsexercise.factory;

import be.abis.patternsexercise.model.Packet;
import be.abis.patternsexercise.model.PacketComponent;

public class TextPacketFactory extends PacketFactory {
    private static TextPacketFactory instance = new TextPacketFactory();
    private TextPacketFactory(){}

    public static TextPacketFactory getInstance(){return instance;}

    public PacketComponent createPacket(String destinationAddress, String contents){
        return new Packet(destinationAddress, contents);
    }


}

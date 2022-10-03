package be.abis.patternsexercise.model;

public class TextPacketFactory extends PacketFactory {
    private static TextPacketFactory instance = new TextPacketFactory();
    private TextPacketFactory(){}
    public static TextPacketFactory getInstance(){return instance;}

    public Packet createPacket(String destinationAddress, String contents){
        return new Packet(destinationAddress, contents);
    }


}

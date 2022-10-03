package be.abis.patternsexercise.model;

public abstract class PacketFactory {
    public static PacketFactory createPacketFactory(PacketType packetType){
        switch (packetType){
            default:
            case TEXT : return TextPacketFactory.getInstance();
        }
    }

    public abstract Packet createPacket(String destinationAddress, String contents);

}

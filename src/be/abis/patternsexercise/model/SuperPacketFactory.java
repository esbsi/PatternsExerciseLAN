package be.abis.patternsexercise.model;

public class SuperPacketFactory {

    private static SuperPacketFactory instance;
    private SuperPacketFactory(){}
    public static SuperPacketFactory getInstance() {
        if (instance != null){
            instance = new SuperPacketFactory();
        }
        return instance;
    }

//    private SuperPacket superPacket1 =

    public PacketComponent createPacketComponents(String contents, String destinationAddress){
        SuperPacket fullPackage = new SuperPacket();

        SuperPacket sentence = new SuperPacket();
//        sentence.getPacketComponents().add(word);


//        contents.split("\\."
        return null;

    }

}

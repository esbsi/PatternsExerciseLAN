package be.abis.patternsexercise.factory;

import be.abis.patternsexercise.model.Packet;
import be.abis.patternsexercise.model.PacketComponent;
import be.abis.patternsexercise.model.SuperPacket;

public class SuperPacketFactory extends PacketFactory {

    private static PacketFactory instance = new SuperPacketFactory();
    private SuperPacketFactory(){}

    public static PacketFactory getInstance() {
        return instance;
    }




//    private SuperPacket superPacket1 =

    public PacketComponent createPacket(String destinationAddress, String contents){
        PacketComponent superPacket = new SuperPacket(destinationAddress, null);
        String[] sentences = contents.split("\\.");
        for (String sentence : sentences){
            PacketComponent sentencePacket = new SuperPacket(destinationAddress, sentence);
            String[] words = sentence.split("\\s");
            for (String word : words){
                PacketComponent wordPacket = new Packet(destinationAddress, word);
                ((SuperPacket)sentencePacket).addPacketComponent(wordPacket);
            }
            ((SuperPacket)superPacket).addPacketComponent(sentencePacket);
        } return superPacket;
    }

 /*   @Override
    public SuperPacket createPacket(String destinationAddress, String contents) {
        return new SuperPacket(destinationAddress, contents);
    }

  */
}

package be.abis.patternsexercise.test;

import be.abis.patternsexercise.decorator.*;
import be.abis.patternsexercise.enums.PacketType;
import be.abis.patternsexercise.facade.LanFactoryFacade;
import be.abis.patternsexercise.factory.ExtendedLanFactory;
import be.abis.patternsexercise.factory.LanComponentFactory;
import be.abis.patternsexercise.factory.PacketFactory;
import be.abis.patternsexercise.factory.SimpleLanFactory;
import be.abis.patternsexercise.model.*;
import be.abis.patternsexercise.strategy.LaserPrinter;

public class Test {
    public static void main(String[] args) {

        PacketFactory textPacketFactory = PacketFactory.createPacketFactory(PacketType.TEXT);
        PacketComponent packet1 = textPacketFactory.createPacket("8", "Simple LAN factory test message");
        PacketComponent packet2 = textPacketFactory.createPacket("10", "Extended LAN factory test message");

        PacketFactory superPacketFactory = PacketFactory.createPacketFactory(PacketType.SUPER);
        PacketComponent packetCompositeExercise = superPacketFactory.createPacket("11", "This sentence should be split and reassembled. Hope you received it well. Please confirm. Thanks.");

/*        SimpleLanFactory simpleLanFactory = SimpleLanFactory.getInstance();
        LanFactoryFacade simpleLanFactoryFacade = new LanFactoryFacade(simpleLanFactory);
        simpleLanFactoryFacade.constructLan();
        (simpleLanFactoryFacade.findWorkStation(simpleLanFactory.getNodes(), "1")).originate(packet1);
*/
        ExtendedLanFactory extendedLanFactory = ExtendedLanFactory.getInstance();
        LanFactoryFacade extendedLanFactoryFacade = new LanFactoryFacade(extendedLanFactory);
        extendedLanFactoryFacade.constructLan();
        extendedLanFactoryFacade.findWorkStation(extendedLanFactory.getNodes(), "1").originate(packetCompositeExercise);








/*        // Exercise 9. Decorator

        Node node = new PrintServer("6", new LaserPrinter());
        Pictogram pictogram = new NodeName(new NodeImage(new Shade(new Circle(node))));
        System.out.println(pictogram);
*/


    }
}

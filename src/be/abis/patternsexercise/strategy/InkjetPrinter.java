package be.abis.patternsexercise.strategy;

import be.abis.patternsexercise.model.PacketComponent;

public class InkjetPrinter implements PrintServerStrategy{

    @Override
    public void print(PacketComponent packet) {
        System.out.println("Printing:\n\n" + packet.getContents());
    }

}

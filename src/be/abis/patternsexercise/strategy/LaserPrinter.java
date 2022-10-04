package be.abis.patternsexercise.strategy;

import be.abis.patternsexercise.model.Packet;

public class LaserPrinter implements PrintServerStrategy{

    @Override
    public void print(Packet packet) {
        System.out.println("Printing:\n\n" + packet.getContents());
    }

}

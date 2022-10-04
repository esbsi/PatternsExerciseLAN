package be.abis.patternsexercise.strategy;

import be.abis.patternsexercise.model.Packet;

public class Printer3D implements PrintServerStrategy{

    @Override
    public void print(Packet packet) {
        System.out.println("3D Printing:\n\n" + packet.getContents());
    }

}

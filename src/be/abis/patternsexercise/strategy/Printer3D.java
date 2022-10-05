package be.abis.patternsexercise.strategy;

import be.abis.patternsexercise.model.PacketComponent;

public class Printer3D implements PrintServerStrategy{

    @Override
    public void print(PacketComponent packet) {
        System.out.println("3D Printing:\n\n" + packet.getContents());
    }

}

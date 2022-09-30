package be.abis.patternsexercise.model;

public class Printer3D implements PrintServerStrategy{

    @Override
    public void print(Packet packet) {
        System.out.println("3D Printing:\n\n" + packet.getContents());
    }

}

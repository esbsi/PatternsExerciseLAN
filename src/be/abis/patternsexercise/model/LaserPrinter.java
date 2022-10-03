package be.abis.patternsexercise.model;

public class LaserPrinter implements PrintServerStrategy{

    @Override
    public void print(Packet packet) {
        System.out.println("Printing:\n\n" + packet.getContents());
    }

}

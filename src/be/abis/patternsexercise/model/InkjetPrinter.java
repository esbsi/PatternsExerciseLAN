package be.abis.patternsexercise.model;

public class InkjetPrinter implements PrintServerStrategy{

    @Override
    public void print(Packet packet) {
        System.out.println("Printing:\n\n" + packet.getContents());
    }

}

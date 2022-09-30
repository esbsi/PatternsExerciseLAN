package be.abis.patternsexercise.model;

public class PaperPrinter implements PrintServerStrategy{

    @Override
    public void print(Packet packet) {
        System.out.println("Printing:\n\n" + packet.getContents());
    }


}

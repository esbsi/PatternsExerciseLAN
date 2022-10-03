package be.abis.patternsexercise.model;

public class PrintServer extends PacketHandler{

    private PrintServerStrategy printServerStrategy;

    public PrintServer(String address, PrintServerStrategy printServerStrategy) {
        super(address);
        this.printServerStrategy = printServerStrategy;
    }


    // business

    @Override
    public void handle(Packet packet) {
        printServerStrategy.print(packet);
    }


}

package be.abis.patternsexercise.model;

import be.abis.patternsexercise.strategy.PrintServerStrategy;

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

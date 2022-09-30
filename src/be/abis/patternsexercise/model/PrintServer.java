package be.abis.patternsexercise.model;

public class PrintServer extends Node{

    public PrintServer(String address) {
        super(address);
    }


    // business

    @Override
    public void receive(Packet packet) {
        if (packet.getDestinationAddress() == this.getAddress()){
            PrintServerStrategy.print(packet);
        } else {
            this.getNextComponent().receive(packet);
        }


    }


}

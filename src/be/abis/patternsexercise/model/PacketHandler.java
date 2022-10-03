package be.abis.patternsexercise.model;

public abstract class PacketHandler extends Node {

    public PacketHandler(String address) {
        super(address);
    }

    // business

    @Override
    public void receive(Packet packet) {
        if (packet.getDestinationAddress().equals(this.getAddress())){
            this.handle(packet);
        } else {
            this.getNextComponent().receive(packet);
        }
    }

    public abstract void handle(Packet packet);

}

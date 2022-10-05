package be.abis.patternsexercise.model;

public class Node extends LanComponent{

    public Node(String address) {
        super(address);
    }



    // business

    @Override
    public void send(PacketComponent packet){
        this.getNextComponent().receive(packet);
    }

    @Override
    public void receive(PacketComponent packet){
        this.send(packet);
    }

}

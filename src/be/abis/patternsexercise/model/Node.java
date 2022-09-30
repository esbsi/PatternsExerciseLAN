package be.abis.patternsexercise.model;

public class Node extends LanComponent{

    public Node(String address) {
        super(address);
    }



    // business

    @Override
    public void send(Packet packet){
        this.getNextComponent().receive(packet);
    }

    @Override
    public void receive(Packet packet){
        this.send(packet);
    }

}

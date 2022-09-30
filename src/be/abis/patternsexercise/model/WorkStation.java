package be.abis.patternsexercise.model;

public class WorkStation extends Node{

    public WorkStation(String address) {
        super(address);
    }


    // business

    public void originate(Packet packet){
        this.getNextComponent().receive(packet);
    }

}

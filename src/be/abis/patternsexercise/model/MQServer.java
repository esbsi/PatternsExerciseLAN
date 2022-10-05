package be.abis.patternsexercise.model;

public class MQServer extends PacketHandler{

    public MQServer(String address) {
        super(address);
    }

    @Override
    public void handle(PacketComponent packet) {
        System.out.println("Putting in message queue:\n\n" + packet.getContents());
    }
}

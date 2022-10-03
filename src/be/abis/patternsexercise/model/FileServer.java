package be.abis.patternsexercise.model;

public class FileServer extends PacketHandler{

    public FileServer(String address) {
        super(address);
    }

    @Override
    public void handle(Packet packet) {
        System.out.println("Saving file:\n\n" + packet.getContents());
    }
}

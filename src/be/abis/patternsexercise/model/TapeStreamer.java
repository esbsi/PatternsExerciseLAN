package be.abis.patternsexercise.model;

public class TapeStreamer{

    public TapeStreamer() {}

    public void stream(PacketComponent packet) {
        System.out.println("\nSaving file to tapestreamer:\n\n" + packet.getContents());
    }
}

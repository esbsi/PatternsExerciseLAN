package be.abis.patternsexercise.model;

public class TapeStreamer{

    public TapeStreamer() {}

    public void stream(Packet packet) {
        System.out.println("\nSaving file to tapestreamer:\n\n" + packet.getContents());
    }
}

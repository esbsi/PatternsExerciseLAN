package be.abis.patternsexercise.model;

public class TapeStreamerAdapter extends PacketHandler implements TapeStreamerAdapterInterface{

    private TapeStreamer tapeStreamer;

    public TapeStreamerAdapter(String address, TapeStreamer tapeStreamer) {
        super(address);
        this.tapeStreamer = tapeStreamer;
    }

    public void setTapeStreamer(TapeStreamer tapeStreamer){
        this.tapeStreamer = tapeStreamer;
    }

    @Override
    public void handle(PacketComponent packet) {
        tapeStreamer.stream(packet);
    }
}

package be.abis.patternsexercise.model;

public class Packet implements PacketComponent{

    private String destinationAddress;
    private String contents;
    private String originAddress;


    public Packet(String destinationAddress, String contents) {
        this.destinationAddress = destinationAddress;
        this.contents = contents;
    }




    // get&set


    public String getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    @Override
    public String getOriginAddress() {
        return originAddress;
    }

    @Override
    public void setOriginAddress(String originAddress) {
        this.originAddress = originAddress;
    }
}

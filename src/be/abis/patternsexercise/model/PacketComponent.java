package be.abis.patternsexercise.model;

public interface PacketComponent {

    String getDestinationAddress();
    String getContents();
    String getOriginAddress();
    void setOriginAddress(String originAddress);

}

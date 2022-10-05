package be.abis.patternsexercise.strategy;

import be.abis.patternsexercise.model.PacketComponent;

public interface PrintServerStrategy {

    void print(PacketComponent packet);

}

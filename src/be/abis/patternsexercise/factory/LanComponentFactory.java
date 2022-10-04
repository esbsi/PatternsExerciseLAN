package be.abis.patternsexercise.factory;

import be.abis.patternsexercise.model.*;
import be.abis.patternsexercise.strategy.PrintServerStrategy;

public class LanComponentFactory extends ComponentFactory{

    private static LanComponentFactory instance;
    private LanComponentFactory(){}
    public static LanComponentFactory getInstance() {
        if (instance==null){
            instance = new LanComponentFactory();
        }
        return instance;
    }


    @Override
    public LanComponent createLanComponent(ComponentType componentType, String address) {
        switch (componentType){
            default:
            case NODE: return new Node(address);
            case WORKSTATION: return new WorkStation(address);
            case FILESERVER: return new FileServer(address);
        }
    }

    @Override
    public LanComponent createLanComponent(ComponentType componentType, String address, PrintServerStrategy printServerStrategy) {
        switch (componentType) {
            default:
            case PRINTSERVER:
                return new PrintServer(address, printServerStrategy);
        }
    }

}

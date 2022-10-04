package be.abis.patternsexercise.factory;

import be.abis.patternsexercise.model.ComponentType;
import be.abis.patternsexercise.model.LanComponent;
import be.abis.patternsexercise.strategy.PrintServerStrategy;

public abstract class ComponentFactory {

    public static ComponentFactory createFactory(){
        return LanComponentFactory.getInstance();
    }

    public abstract LanComponent createLanComponent(ComponentType componentType, String address);
    public abstract LanComponent createLanComponent(ComponentType componentType, String address, PrintServerStrategy printServerStrategy);

}

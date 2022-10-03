package be.abis.patternsexercise.model;

public abstract class ComponentFactory {

    public static ComponentFactory createFactory(){
        return LanComponentFactory.getInstance();
    }

    public abstract LanComponent createLanComponent(ComponentType componentType, String address);
    public abstract LanComponent createLanComponent(ComponentType componentType, String address, PrintServerStrategy printServerStrategy);

}

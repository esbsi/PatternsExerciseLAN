package be.abis.patternsexercise.factory;

import be.abis.patternsexercise.model.*;
import be.abis.patternsexercise.strategy.LaserPrinter;
import be.abis.patternsexercise.strategy.Printer3D;

import java.util.ArrayList;
import java.util.List;

public class SimpleLanFactory extends LanFactory{

    List<Node> nodes = new ArrayList<>();

    private static SimpleLanFactory instance;
    private SimpleLanFactory(){}

    public static SimpleLanFactory getInstance() {
        if (instance==null){
            instance = new SimpleLanFactory();
        }
        return instance;
    }

    @Override
    public List<Node> createNodes() {
        nodes.add(new WorkStation("1"));
        nodes.add(new WorkStation("2"));
        nodes.add(new Node("3"));
        nodes.add(new Node("4"));
        nodes.add(new PrintServer("8", new Printer3D()));
        nodes.add(new PrintServer("9", new LaserPrinter()));
        return nodes;
    }


    // getset

    @Override
    public List<Node> getNodes() {
        return nodes;
    }

}

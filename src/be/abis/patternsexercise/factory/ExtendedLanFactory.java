package be.abis.patternsexercise.factory;

import be.abis.patternsexercise.model.*;
import be.abis.patternsexercise.strategy.Printer3D;

import java.util.ArrayList;
import java.util.List;

public class ExtendedLanFactory extends LanFactory{

    List<Node> nodes = new ArrayList<>();

    private static ExtendedLanFactory instance;
    private ExtendedLanFactory(){}
    public static ExtendedLanFactory getInstance() {
        if (instance==null){
            instance = new ExtendedLanFactory();
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
        nodes.add(new FileServer("10"));
        nodes.add(new TapeStreamerAdapter("11", new TapeStreamer()));
        nodes.add(new MQServer("12"));
        return nodes;
    }


    // getset

    @Override
    public List<Node> getNodes() {
        return nodes;
    }

}

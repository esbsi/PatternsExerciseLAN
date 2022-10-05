package be.abis.patternsexercise.facade;

import be.abis.patternsexercise.enums.LanType;
import be.abis.patternsexercise.factory.LanFactory;
import be.abis.patternsexercise.model.Node;
import be.abis.patternsexercise.model.WorkStation;

import java.util.List;

public class LanFactoryFacade {

    private LanFactory lanFactory;
    private List<Node> nodes;

    public LanFactoryFacade(LanFactory lanFactory) {
        this.lanFactory = lanFactory;
    }


    // business

    public List<Node> constructLan(){
        this.nodes = lanFactory.createNodes();
        lanFactory.createLan(this.nodes);
        return this.nodes;
    }

    public WorkStation findWorkStation(String address){
        return lanFactory.findWorkStation(this.nodes, address);
    }

    public WorkStation findWorkStation(List<Node> nodes, String address){
        return lanFactory.findWorkStation(nodes, address);
    }


}

package be.abis.patternsexercise.facade;

import be.abis.patternsexercise.enums.LanType;
import be.abis.patternsexercise.factory.LanFactory;
import be.abis.patternsexercise.model.Node;
import be.abis.patternsexercise.model.WorkStation;

import java.util.List;

public class LanFactoryFacade {

    private LanFactory lanFactory;

    public LanFactoryFacade(LanFactory lanFactory) {
        this.lanFactory = lanFactory;
    }


    // business

    public List<Node> constructLan(){
        List<Node> nodes = lanFactory.createNodes();
        lanFactory.createLan(nodes);
        return nodes;
    }

    public WorkStation findWorkStation(List<Node> nodes, String address){
        return lanFactory.findWorkStation(nodes, address);
    }


}

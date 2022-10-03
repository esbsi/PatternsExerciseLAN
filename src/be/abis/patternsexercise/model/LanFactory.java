package be.abis.patternsexercise.model;

import java.util.List;

public abstract class LanFactory {

    List<Node> nodes;

    public static LanFactory createFactory(LanType lanType){
        switch (lanType){
            default:
            case SIMPLE: return SimpleLanFactory.getInstance();
            case EXTENDED: return ExtendedLanFactory.getInstance();
        }
    }


    // business

    public abstract List<Node> createNodes();

    public void createLan(List<Node> nodesList) {
        for (int i = 0; i < nodesList.size(); i++ ){
            if (i == nodesList.size() - 1){
                nodesList.get(i).setNextComponent(nodesList.get(0));
            } else {
                nodesList.get(i).setNextComponent(nodesList.get(i + 1));
            }
        }
    }

    public WorkStation findWorkStation(List<Node> nodes, String address){
        for (Node node : nodes){
            if (address.equals(node.getAddress())){
                return (WorkStation)node;
            }
        }
        System.out.println("Workstation with address " + address + " not found.");
        return null;
    }


    // getset

    public abstract List<Node> getNodes();


}
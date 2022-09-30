package be.abis.patternsexercise.test;

import be.abis.patternsexercise.model.Node;
import be.abis.patternsexercise.model.Packet;
import be.abis.patternsexercise.model.PrintServer;
import be.abis.patternsexercise.model.WorkStation;

public class Test {
    public static void main(String[] args) {

        Packet packet1 = new Packet("9", "testmessage");

        WorkStation workStation1 = new WorkStation("1");
        WorkStation workStation2 = new WorkStation("2");
        Node node3 = new Node("3");
        Node node4 = new Node("4");
        PrintServer printServer9 = new PrintServer("9");

        workStation1.setNextComponent(node3);
        node3.setNextComponent(printServer9);

        workStation1.originate(packet1);

    }
}

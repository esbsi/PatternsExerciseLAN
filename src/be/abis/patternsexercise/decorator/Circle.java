package be.abis.patternsexercise.decorator;

import be.abis.patternsexercise.model.Node;

public class Circle implements Pictogram{

    private String message = "A circle";
    private Node node;

    public Circle(Node node) {
        this.node = node;
    }


    @Override
    public String toString() {
        return message;
    }



        // getset

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }
}

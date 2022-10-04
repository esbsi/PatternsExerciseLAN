package be.abis.patternsexercise.decorator;

import be.abis.patternsexercise.model.Node;

public abstract class PictogramDecorator implements Pictogram{

    private String message;
    private Node node;
    private Pictogram pictogram;
    public PictogramDecorator(Pictogram pictogram) {
        this.pictogram = pictogram;
        this.node = pictogram.getNode();
        this.message = pictogram.getMessage() + this.message;
//        pictogram.setMessage(pictogram.getMessage() + this.message);
    }


    // getset

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }

    @Override
    public Node getNode() {
        return node;
    }

}

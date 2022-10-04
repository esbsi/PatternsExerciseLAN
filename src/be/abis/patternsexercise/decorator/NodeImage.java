package be.abis.patternsexercise.decorator;

public class NodeImage extends PictogramDecorator{
    private String message = "an image representing " + "placeholder for node name";

    public NodeImage(Pictogram pictogram) {
        super(pictogram);
    }
}

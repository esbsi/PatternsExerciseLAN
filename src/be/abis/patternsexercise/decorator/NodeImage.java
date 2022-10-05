package be.abis.patternsexercise.decorator;

public class NodeImage extends PictogramDecorator{
    private String message = ", containing an image representing a " + super.getNode().getClass().getSimpleName();

    public NodeImage(Pictogram pictogram) {
        super(pictogram);
        this.message = pictogram.getMessage() + this.message;
    }



    @Override
    public String toString() {
        return message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void setMessage(String s) {

    }
}

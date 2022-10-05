package be.abis.patternsexercise.decorator;

public class NodeName extends PictogramDecorator{
    private String message = ", with the text '" + super.getNode().getClass().getSimpleName() + "'";

    public NodeName(Pictogram pictogram) {
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
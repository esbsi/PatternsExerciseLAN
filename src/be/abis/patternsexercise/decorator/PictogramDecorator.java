package be.abis.patternsexercise.decorator;

public abstract class PictogramDecorator implements Pictogram{

    private String message;

    @Override
    public String getMessage() {
        return message;
    }
}

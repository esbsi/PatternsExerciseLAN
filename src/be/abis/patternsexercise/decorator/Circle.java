package be.abis.patternsexercise.decorator;

public class Circle implements Pictogram{

    private String message = "A circle";

    @Override
    public String getMessage() {
        return message;
    }
}

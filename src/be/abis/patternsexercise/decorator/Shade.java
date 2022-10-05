package be.abis.patternsexercise.decorator;

import be.abis.patternsexercise.model.Node;

public class Shade extends PictogramDecorator{

    private String message = ", shaded";


    public Shade(Pictogram pictogram) {
        super(pictogram);
//        this.node = pictogram.getNode();
        this.message = pictogram.getMessage() + this.message;
    }




/*    private Pictogram pictogram;
    private Node node;

    public Shade(Pictogram pictogram) {
        this.pictogram = pictogram;
        this.node = pictogram.getNode();
        this.message = (pictogram.getMessage() + this.message);
    }
*/

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

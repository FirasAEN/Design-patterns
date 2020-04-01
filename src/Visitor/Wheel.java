package Visitor;

/**
 * Created by Firas on 9/17/2018.
 */
public class Wheel implements Part {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

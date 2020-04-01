package Visitor;

/**
 * Created by Firas on 9/17/2018.
 */
public class Oil implements Part {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

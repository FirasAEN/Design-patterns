package Visitor;

/**
 * Created by Firas on 9/17/2018.
 */
public interface Visitor {

    void visit(Wheel wheel);

    void visit(Oil oil);

    void visit(Brakes brakes);
}

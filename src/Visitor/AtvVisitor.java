package Visitor;

/**
 * Created by Firas on 9/17/2018.
 */
public class AtvVisitor implements Visitor {
    private double totalSum;

    @Override
    public void visit(Wheel wheel) {
        totalSum += 12;
    }

    @Override
    public void visit(Oil oil) {
        totalSum += 14;
    }

    @Override
    public void visit(Brakes brakes) {
        totalSum += 6;
    }

    public double getTotalSum() {
        return totalSum;
    }
}

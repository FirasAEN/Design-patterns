package Visitor;

/**
 * Created by Firas on 9/16/2018.
 */
public class AtvParts {

    public static void main(String[] args){
        AtvVisitor atvPartsVisitor = new AtvVisitor();
        OrderParts order = new OrderParts(atvPartsVisitor);

        order.addPart(new Wheel());
        order.addPart(new Oil());
        order.addPart(new Brakes());

        System.out.println("Total cost: " + order.calculateTotalCost());
    }
}

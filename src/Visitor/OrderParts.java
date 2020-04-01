package Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Firas on 9/17/2018.
 */
public class OrderParts {
    private AtvVisitor atvPartVisitor;
    private List<Part> parts = new ArrayList<Part>();

    public OrderParts(AtvVisitor visitor){
        this.atvPartVisitor = visitor;
    }

    public void addPart(Part item){
        parts.add(item);
    }

    public double calculateTotalCost(){
        parts.forEach(part -> {
            part.accept(atvPartVisitor);
        });

        return atvPartVisitor.getTotalSum();
    }
}

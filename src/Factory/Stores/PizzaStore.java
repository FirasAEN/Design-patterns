package Factory.Stores;

import Factory.Products.Pizza;
import Factory.Products.PizzaType;

/**
 * Created by FAB3659 on 2017-07-04.
 */
public abstract class PizzaStore {

    public Pizza orderPizza(PizzaType pizzaType){
        System.out.println("Pizza order registered...");
        Pizza pizza = createPizza(pizzaType);

        pizza.bake();
        pizza.cut();
        pizza.pack();
        pizza.deliver();
        return pizza;
    }

    public abstract Pizza createPizza(PizzaType pizzaType);
}

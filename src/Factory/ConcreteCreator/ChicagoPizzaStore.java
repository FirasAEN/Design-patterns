package Factory.ConcreteCreator;

import Factory.AbstractCreator.PizzaStore;
import Factory.AbstractProduct.Pizza;
import Factory.ConcreteProduct.PizzaType;

/**
 * Created by FAB3659 on 2017-07-04.
 */
public class ChicagoPizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(PizzaType pizzaType) {
        return null;
    }
}

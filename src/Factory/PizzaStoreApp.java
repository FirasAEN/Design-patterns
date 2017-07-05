package Factory;

import Factory.AbstractCreator.PizzaStore;
import Factory.ConcreteCreator.NYPizzaStore;
import Factory.ConcreteProduct.PizzaType;

/**
 * Created by FAB3659 on 2017-07-05.
 */
public class PizzaStoreApp {

    public static void main(String[] args){

        PizzaStore pizzaStore = new NYPizzaStore();
        pizzaStore.orderPizza(PizzaType.CHEESE);

    }
}

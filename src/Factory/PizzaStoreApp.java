package Factory;

import Factory.Stores.PizzaStore;
import Factory.Stores.NYPizzaStore;
import Factory.Products.PizzaType;

/**
 * Created by FAB3659 on 2017-07-05.
 */
public class PizzaStoreApp {

    public static void main(String[] args){

        PizzaStore pizzaStore = new NYPizzaStore();
        pizzaStore.orderPizza(PizzaType.CHEESE);

    }
}

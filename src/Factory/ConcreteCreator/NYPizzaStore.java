package Factory.ConcreteCreator;

import Factory.AbstractCreator.PizzaStore;
import Factory.AbstractFactory.IngredientsFactory;
import Factory.AbstractProduct.Pizza;
import Factory.ConcreteFactory.NYIngredientsFactory;
import Factory.ConcreteProduct.CheesePizza;
import Factory.ConcreteProduct.PizzaType;

/**
 * Created by FAB3659 on 2017-07-04.
 */
public class NYPizzaStore extends PizzaStore {
    IngredientsFactory ingredientsFactory;

    public NYPizzaStore() {
        this.ingredientsFactory = new NYIngredientsFactory();
    }

    @Override
    public Pizza createPizza(PizzaType pizzaType) {
        Pizza pizza;
        switch (pizzaType){
            case CHEESE:
                System.out.println("Preparing Cheese Pizza...");
                pizza = new CheesePizza(this.ingredientsFactory);
                return pizza;
            default:
                pizza = new CheesePizza(this.ingredientsFactory);
                return pizza;
        }
    }
}

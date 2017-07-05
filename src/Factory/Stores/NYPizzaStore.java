package Factory.Stores;

import Factory.Factories.IngredientsFactory;
import Factory.Products.Pizza;
import Factory.Factories.ConcreteFactories.NYIngredientsFactory;
import Factory.Products.CheesePizza;
import Factory.Products.PizzaType;

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
                System.out.println("Used Cheese: " + pizza.getCheese().getName());
                return pizza;
            default:
                pizza = new CheesePizza(this.ingredientsFactory);
                return pizza;
        }
    }
}

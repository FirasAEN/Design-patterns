package Factory;

import Factory.Condiments.Condiment;
import Factory.Food.Food;
import Factory.Ingredients.ConcreteIngredients.Cheese.MozzarellaCheese;
import Factory.Ingredients.ConcreteIngredients.Meat.Pepperoni;
import Factory.Products.Pizza;
import Factory.Stores.PizzaStore;
import Factory.Stores.NYPizzaStore;
import Factory.Products.PizzaType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by FAB3659 on 2017-07-05.
 */
public class PizzaStoreApp {

    public static void main(String[] args){

        PizzaStore pizzaStore = new NYPizzaStore();
        Food myPizza = pizzaStore.orderPizza(PizzaType.CHEESE);

        List<Condiment> condiments = new ArrayList<>();
        condiments.add(new MozzarellaCheese());
        condiments.add(new Pepperoni());
        condiments.add(new Pepperoni());
        condiments.add(new Pepperoni());
        condiments.add(new Pepperoni());


        System.out.println("Pizza price = " + Food.getTotalPrice(myPizza, condiments));

        Food food = new MozzarellaCheese(new MozzarellaCheese(myPizza));
        System.out.println("Pizza price = " + food.getFoodPrice());
    }
}

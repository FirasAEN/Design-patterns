package Factory.Ingredients.ConcreteIngredients.Meat;

import Factory.Food.Food;
import Factory.Ingredients.Meat;

/**
 * Created by FAB3659 on 2017-07-05.
 */
public class Pepperoni extends Meat {
    private final double price = 1.5;

    public Pepperoni() {
        super.setCondimentPrice(this.price);
    }

    public Pepperoni(Food food) {
        super.setCondimentPrice(this.price);
        super.calculatePrice(food);
    }
}

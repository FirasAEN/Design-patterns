package Factory.Ingredients.ConcreteIngredients.Cheese;

import Factory.Food.Food;
import Factory.Ingredients.Cheese;

/**
 * Created by FAB3659 on 2017-07-04.
 */
public class MozzarellaCheese extends Cheese {
    private final double price = 2.50;

    public MozzarellaCheese(){
        super.setName(CheeseName.MOZZARELLA);
        super.setCondimentPrice(this.price);
    }

    public MozzarellaCheese(Food food) {
        super.setName(CheeseName.MOZZARELLA);
        super.setCondimentPrice(this.price);
        super.calculatePrice(food);
    }
}

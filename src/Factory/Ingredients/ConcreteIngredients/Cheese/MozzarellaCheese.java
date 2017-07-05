package Factory.Ingredients.ConcreteIngredients.Cheese;

import Factory.Ingredients.Cheese;

/**
 * Created by FAB3659 on 2017-07-04.
 */
public class MozzarellaCheese extends Cheese {
    private final double price = 2.50;

    public MozzarellaCheese() {
        super.setCondimentPrice(this.price);
        super.setName(CheeseName.MOZZARELLA);
    }
}

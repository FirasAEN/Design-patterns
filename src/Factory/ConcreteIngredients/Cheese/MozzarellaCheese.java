package Factory.ConcreteIngredients.Cheese;

import Factory.AbstractIngredients.Cheese;

/**
 * Created by FAB3659 on 2017-07-04.
 */
public class MozzarellaCheese extends Cheese {

    public MozzarellaCheese() {
        super.setName(CheeseNames.MOZZARELLA);
    }
}

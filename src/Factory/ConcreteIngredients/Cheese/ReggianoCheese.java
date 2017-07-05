package Factory.ConcreteIngredients.Cheese;

import Factory.AbstractIngredients.Cheese;

/**
 * Created by FAB3659 on 2017-07-04.
 */
public class ReggianoCheese extends Cheese{
    public ReggianoCheese() {
        super.setName(CheeseNames.REGGIANO);
    }
}

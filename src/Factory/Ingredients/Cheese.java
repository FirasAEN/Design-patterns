package Factory.Ingredients;

import Factory.Condiments.Condiment;
import Factory.Ingredients.ConcreteIngredients.Cheese.CheeseName;

/**
 * Created by FAB3659 on 2017-07-04.
 */
public abstract class Cheese extends Condiment {
    private CheeseName name;

    public String getName() {
        return String.valueOf(name);
    }

    protected void setName(CheeseName name) {
        this.name = name;
    }
}

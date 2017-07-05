package Factory.AbstractIngredients;

import Factory.ConcreteIngredients.Cheese.CheeseNames;

/**
 * Created by FAB3659 on 2017-07-04.
 */
public class Cheese {
    private CheeseNames name;

    public String getName() {
        return String.valueOf(name);
    }

    protected void setName(CheeseNames name) {
        this.name = name;
    }
}

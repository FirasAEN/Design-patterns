package Factory.Factories;

import Factory.Ingredients.*;

/**
 * Created by FAB3659 on 2017-07-04.
 */
public abstract class IngredientsFactory {

    public abstract Cheese selectCheese();

    public abstract Doe selectDoe();

    public abstract Meat selectMeat();

    public abstract SeaFood selectSeaFood();

    public abstract Vegetable[] selectVegetables();
}

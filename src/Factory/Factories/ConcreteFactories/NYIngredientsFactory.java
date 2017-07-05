package Factory.Factories.ConcreteFactories;

import Factory.Factories.IngredientsFactory;
import Factory.Ingredients.*;
import Factory.Ingredients.ConcreteIngredients.Cheese.MozzarellaCheese;
import Factory.Ingredients.ConcreteIngredients.Meat.Pepperoni;
import Factory.Ingredients.ConcreteIngredients.Doe.ThickCheeseFilledDoe;

/**
 * Created by FAB3659 on 2017-07-05.
 */
public class NYIngredientsFactory extends IngredientsFactory {
    @Override
    public Cheese selectCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Doe selectDoe() {
        return new ThickCheeseFilledDoe();
    }

    @Override
    public Meat selectMeat() {
        return new Pepperoni();
    }

    @Override
    public SeaFood selectSeaFood() {
        return null;
    }

    @Override
    public Vegetable[] selectVegetables() {
        return null;
    }
}

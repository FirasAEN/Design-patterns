package Factory.ConcreteFactory;

import Factory.AbstractFactory.IngredientsFactory;
import Factory.AbstractIngredients.*;
import Factory.ConcreteIngredients.Cheese.MozzarellaCheese;
import Factory.ConcreteIngredients.Meat.Pepperoni;
import Factory.ConcreteIngredients.Doe.ThickCheeseFilledDoe;

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
        return new Vegetable[0];
    }
}

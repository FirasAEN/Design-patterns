package Factory.ConcreteProduct;

import Factory.AbstractFactory.IngredientsFactory;
import Factory.AbstractProduct.Pizza;

/**
 * Created by FAB3659 on 2017-07-04.
 */
public class CheesePizza extends Pizza {

    public CheesePizza(IngredientsFactory ingredientsFactory) {
        
        super.setCheese(ingredientsFactory.selectCheese());
        super.setDoe(ingredientsFactory.selectDoe());
        super.setMeat(ingredientsFactory.selectMeat());
        super.setSeaFood(ingredientsFactory.selectSeaFood());
        super.setVegetables(ingredientsFactory.selectVegetables());
    }
}

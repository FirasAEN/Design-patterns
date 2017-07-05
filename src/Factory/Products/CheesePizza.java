package Factory.Products;

import Factory.Factories.IngredientsFactory;

/**
 * Created by FAB3659 on 2017-07-04.
 */
public class CheesePizza extends Pizza {
    private final double price = 12.5;
    public CheesePizza(IngredientsFactory ingredientsFactory) {

        super.setPrice(this.price);
        super.setCheese(ingredientsFactory.selectCheese());
        super.setDoe(ingredientsFactory.selectDoe());
        super.setVegetables(ingredientsFactory.selectVegetables());
    }
}

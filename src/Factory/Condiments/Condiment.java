package Factory.Condiments;

import Factory.Food.Food;

/**
 * Created by FAB3659 on 2017-07-05.
 */
public abstract class Condiment extends Food{
    private double condimentPrice;

    public double getCondimentPrice() {
        return condimentPrice;
    }

    public void setCondimentPrice(double condimentPrice) {
        this.condimentPrice = condimentPrice;
    }


    public void calculatePrice(Food food) {
        super.setFoodPrice(food.getFoodPrice()+getCondimentPrice());
    }
}

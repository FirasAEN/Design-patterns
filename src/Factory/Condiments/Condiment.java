package Factory.Condiments;

import Factory.Food.Food;

/**
 * Created by FAB3659 on 2017-07-05.
 */
public abstract class Condiment extends Food{
    private double condimentPrice;
    private Food food;

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
        super.setPrice(this.food.getPrice() + this.getCondimentPrice());
    }

    public double getCondimentPrice() {
        return condimentPrice;
    }

    public void setCondimentPrice(double condimentPrice) {
        this.condimentPrice = condimentPrice;
    }

    public double getTotalPrice(){
        return super.getPrice();
    }
}

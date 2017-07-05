package Factory.Food;

import Factory.Condiments.Condiment;

import java.util.List;

/**
 * Created by FAB3659 on 2017-07-05.
 */
public abstract class Food {
    private double foodPrice;

    public double getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(double price) {
        this.foodPrice= price;
    }

    public static double getTotalPrice(Food food, List<Condiment> condiments){
        double totalPrice;
        totalPrice = condiments.stream().mapToDouble(Condiment::getCondimentPrice).sum();
        totalPrice = totalPrice + food.getFoodPrice();
        return totalPrice;

    }
}

package Factory.Food;

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
}

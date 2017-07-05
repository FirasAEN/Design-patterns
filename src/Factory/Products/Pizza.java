package Factory.Products;

import Factory.Food.Food;
import Factory.Ingredients.*;

/**
 * Created by FAB3659 on 2017-07-04.
 */
public abstract class Pizza extends Food {
    private Cheese cheese;
    private Doe doe;
    private Meat meat;
    private SeaFood seaFood;
    private Vegetable[] vegetables;

    public Cheese getCheese() {
        return cheese;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    public Doe getDoe() {
        return doe;
    }

    public void setDoe(Doe doe) {
        this.doe = doe;
    }

    public Meat getMeat() {
        return meat;
    }

    public void setMeat(Meat meat) {
        this.meat = meat;
    }

    public SeaFood getSeaFood() {
        return seaFood;
    }

    public void setSeaFood(SeaFood seaFood) {
        this.seaFood = seaFood;
    }

    public Vegetable[] getVegetables() {
        return vegetables;
    }

    public void setVegetables(Vegetable[] vegetables) {
        this.vegetables = vegetables;
    }

    public void bake() {
        System.out.println("Baking...");
    }

    public void cut() {
        System.out.println("Cutting...");
    }

    public void pack() {
        System.out.println("Packing...");
    }

    public void deliver() {
        System.out.println("Delivering Pizza...");
    }

}

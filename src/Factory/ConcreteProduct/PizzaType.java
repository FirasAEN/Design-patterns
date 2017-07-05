package Factory.ConcreteProduct;

/**
 * Created by FAB3659 on 2017-07-05.
 */
public enum PizzaType {
    CHEESE("Cheese"), CLAM("Clam"), PEPPERONI("Pepperoni"), VEGETERIAN("Veggies");

    PizzaType(String pizzaType) {
        this.pizzaType = pizzaType;
    }

    private String pizzaType;

    public static String getValueof(PizzaType type){
        return type.toString();
    }

    @Override
    public String toString() {
        return this.pizzaType;
    }
}

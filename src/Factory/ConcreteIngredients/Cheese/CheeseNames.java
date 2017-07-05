package Factory.ConcreteIngredients.Cheese;

/**
 * Created by FAB3659 on 2017-07-05.
 */
public enum CheeseNames {
    MOZZARELLA("Mozzarella"), PARMESAN("Parmesan"), REGGIANO("Reggiano"), GRANA_PADANO("Grana Padano");

    private String name;

    CheeseNames(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

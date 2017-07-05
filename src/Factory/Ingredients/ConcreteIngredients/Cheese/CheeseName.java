package Factory.Ingredients.ConcreteIngredients.Cheese;

/**
 * Created by FAB3659 on 2017-07-05.
 */
public enum CheeseName {
    MOZZARELLA("Mozzarella"), PARMESAN("Parmesan"), REGGIANO("Reggiano"), GRANA_PADANO("Grana Padano");

    private String name;

    CheeseName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

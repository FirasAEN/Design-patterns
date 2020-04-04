package Rules;

public abstract class Rule {
    protected int rate;
    public abstract int check(Person p);
}

package Rules;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int rate;
        Person jerry = new Person(23, true);
        Person thomas = new Person(45, false);
        Person timmy = new Person(75, false);
        Person mike = new Person(78, true);

        computeDiscountRate(jerry);
        computeDiscountRate(thomas);
        computeDiscountRate(timmy);
        computeDiscountRate(mike);
    }

    private static int computeDiscountRate(Person p) {
        int rate = 0;
        List<Rule> rules = new ArrayList<>();
        Rule birthdayRule = new BirthdayRule();
        rules.add(birthdayRule);
        Rule seniorityRule = new SeniorRule();
        rules.add(seniorityRule);

        for (Rule r: rules) {
            rate = rate + r.check(p);
        }
        System.out.println("Age: "+ p.getAge() + " - rate: " + rate);
        return rate;
    }
}

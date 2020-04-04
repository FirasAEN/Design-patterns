package Rules;

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
        if (p.getAge() < 70) {
            if (p.isBirthday()) {
                rate = 15;
            }
        } else {
            rate = 20;
            if (p.isBirthday()) {
                rate = 30;
            }
        }
        System.out.println("Age: "+ p.getAge() + " - rate: " + rate);
        return rate;
    }
}

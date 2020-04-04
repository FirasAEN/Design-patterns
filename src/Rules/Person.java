package Rules;

public class Person {
    private final int age;
    private final boolean isBirthday;

    public Person(int age, boolean isBirthday) {
        this.age = age;
        this.isBirthday = isBirthday;
    }

    public int getAge() {
        return age;
    }

    public boolean isBirthday() {
        return isBirthday;
    }
}

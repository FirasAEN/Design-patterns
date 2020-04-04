package Rules;

public class BirthdayRule extends Rule {
    public BirthdayRule() {
        this.rate = 10;
    }

    @Override
    public int check(Person p) {
        return p.isBirthday() ? this.rate : 0;
    }
}

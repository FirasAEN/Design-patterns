package Rules;

public class SeniorRule extends Rule {
    private final int seniorityAge = 70;

    public SeniorRule() {
        this.rate = 15;
    }

    @Override
    public int check(Person p) {
        return p.getAge() >= seniorityAge ? this.rate : 0;
    }
}

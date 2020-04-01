package Adapter;

public class EmployeeLdap {
    private String sn;
    private String name;

    public EmployeeLdap(String sn, String name) {
        this.sn = sn;
        this.name = name;
    }

    public String getSn() {
        return sn;
    }

    public String getName() {
        return name;
    }
}

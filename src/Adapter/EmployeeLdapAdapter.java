package Adapter;

public class EmployeeLdapAdapter implements Employee {

    private final EmployeeLdap employee;

    public EmployeeLdapAdapter(EmployeeLdap ldapEmployee) {
        this.employee = ldapEmployee;
    }

    @Override
    public String getId() {
        return employee.getSn();
    }

    @Override
    public String getFirstName() {
        return employee.getName();
    }

    @Override
    public String getLastName() {
        return employee.getName();
    }

    @Override
    public String getEmail() {
        return null;
    }
}

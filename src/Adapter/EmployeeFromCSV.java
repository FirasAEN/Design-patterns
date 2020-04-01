package Adapter;

public class EmployeeFromCSV implements Employee {
    private final EmployeeCSV employee;

    public EmployeeFromCSV(EmployeeCSV instance) {
        this.employee = instance;
    }

    @Override
    public String getId() {
        // some logic to extract Id
        return null;
    }

    @Override
    public String getFirstName() {
        // some logic to extract first name
        return null;
    }

    @Override
    public String getLastName() {
        // some logic to extract last name
        return null;
    }

    @Override
    public String getEmail() {
        // some logic to extract email
        return null;
    }
}

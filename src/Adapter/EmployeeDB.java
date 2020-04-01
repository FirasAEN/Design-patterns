package Adapter;

public class EmployeeDB implements Employee {

    private final String id;
    private final String firstName;
    private final String lastName;
    private final String email;

    public EmployeeDB(String id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String getEmail() {
        return this.email;
    }
}

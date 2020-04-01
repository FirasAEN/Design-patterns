package Adapter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Employee dbEmployee = new EmployeeDB("1", "Stephen", "Colbert", "steph.colb@live.com");
        employees.add(dbEmployee);

        Employee ldapEmployee = new EmployeeLdapAdapter(new EmployeeLdap("2", "Stephen Colbert"));
        employees.add(ldapEmployee);
        employees.forEach(System.out::println);
    }
}

package com.teaminnovate.employeemanagement;

public class EmployeeManager {
    private Employees employees;

    public EmployeeManager() {
        employees = new Employees();
        initializeEmployees();
    }

    private void initializeEmployees() {
        employees.getEmployees().add(new Employee(1, "John", "Doe", "john.doe@example.com", "Software Engineer"));
        employees.getEmployees().add(new Employee(2, "Jane", "Smith", "jane.smith@example.com", "Product Manager"));
        employees.getEmployees().add(new Employee(3, "Michael", "Johnson", "michael.johnson@example.com", "Data Analyst"));
    }

    public Employees getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.getEmployees().add(employee);
    }
}

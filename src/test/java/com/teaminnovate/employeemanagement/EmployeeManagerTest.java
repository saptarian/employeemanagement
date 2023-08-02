package com.teaminnovate.employeemanagement;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

class EmployeeManagerTest {

    private EmployeeManager employeeManager;

    @BeforeEach
    void setUp() {
        employeeManager = new EmployeeManager();
    }

    @Test
    void testAddEmployee() {
        // Mock data for the new employee
        Employee newEmployee = new Employee(4, "Alice", "Johnson", "alice.johnson@example.com", "Data Scientist");
        
        // Call the addEmployee method
        employeeManager.addEmployee(newEmployee);

        // Verify that the employee was added to the list
        List<Employee> employees = employeeManager.getEmployees().getEmployees();
        assertTrue(employees.contains(newEmployee));
    }
}

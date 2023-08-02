package com.teaminnovate.employeemanagement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeControllerTest {

    private EmployeeController employeeController;
    private EmployeeManager employeeManager;

    @BeforeEach
    void setUp() {
        employeeManager = mock(EmployeeManager.class);
        employeeController = new EmployeeController(employeeManager);
    }

    @Test
    void testGetAllEmployees() {
        // Mock data
        Employees employees = new Employees();
        employees.getEmployees().add(new Employee(1, "John", "Doe", "john.doe@example.com", "Software Engineer"));
        employees.getEmployees().add(new Employee(2, "Jane", "Smith", "jane.smith@example.com", "Product Manager"));
        
        // Mock the behavior of the EmployeeManager method
        when(employeeManager.getEmployees()).thenReturn(employees);
        
        // Call the GET request
        Employees response = employeeController.getAllEmployees();
        
        // Verify the response
        assertEquals(2, response.getEmployees().size());
    }

    @Test
    void testAddEmployee() {
        // Mock data for the new employee
        Employee newEmployee = new Employee(3, "Michael", "Johnson", "michael.johnson@example.com", "Data Analyst");
        
        // Call the POST request
        employeeController.addEmployee(newEmployee);
        
        // Verify that the EmployeeManager's addEmployee method was called with the new employee
        verify(employeeManager).addEmployee(newEmployee);
    }
}

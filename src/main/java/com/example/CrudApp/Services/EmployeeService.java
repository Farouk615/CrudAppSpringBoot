package com.example.CrudApp.Services;

import com.example.CrudApp.Models.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    List<Employee> getAllEmployees();
    void addEmployee(Employee employee);
}

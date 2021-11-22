package com.example.CrudApp.Controllers;

import com.example.CrudApp.Models.Employee;
import com.example.CrudApp.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
    // Injection of service Interface
    @Autowired
    public EmployeeService employeeService;
    // display list of employees
    @GetMapping("/")
    public String viewHomePage(Model model){
        model.addAttribute("listEmployees",employeeService.getAllEmployees());
        return  "index";
    }
    @GetMapping("/showNewEmployeeForm") // bech Thymleaf yaarafha
    public String showNewEmployeeForm(Model model){
        Employee employee = new Employee();
        model.addAttribute("employee",employee);
        return "New_Employee";
    }
}

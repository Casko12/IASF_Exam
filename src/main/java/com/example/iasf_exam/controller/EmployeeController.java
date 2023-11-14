package com.example.iasf_exam.controller;

import com.example.iasf_exam.service.EmployeeService;
import com.example.iasf_exam.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/employees_list")

public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping
    public String findAllEmployees(Model model){
        List <Employee> employees = employeeService.findAllEmployees();
        model.addAttribute("employees", employees);
        return "employeesList";
    }
    @GetMapping
    public String createEmployeeForm(Model model) {
        model.addAttribute("employees", new Employee());
        return "employeeForm";
    }
    @PostMapping("/new")
    public String createEmployee(@ModelAttribute Employee employee) {
        employeeService.createEmployee(employee);
        return "redirect:/employees_list";
    }
}

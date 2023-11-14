package com.example.iasf_exam.service;

import com.example.iasf_exam.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public interface EmployeeService {
    void createEmployee (Employee employee);
    List <Employee> findAllEmployees();
}

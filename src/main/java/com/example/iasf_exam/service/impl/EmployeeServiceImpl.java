package com.example.iasf_exam.service.impl;

import com.example.iasf_exam.entity.Employee;
import com.example.iasf_exam.repository.EmployeeRepository;
import com.example.iasf_exam.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public void createEmployee (Employee employee) {
        employeeRepository.save(employee);
    }
    @Override
    public List<Employee> findAllEmployees(){
        return employeeRepository.findAll(Sort.by(Sort.Direction.ASC,"id"));
    }
}

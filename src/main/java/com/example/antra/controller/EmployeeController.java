package com.example.antra.controller;

import com.example.antra.module.Employee;
import com.example.antra.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class EmployeeController {
    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService=employeeService;
    }

    @GetMapping("/employee")
    public ResponseEntity<List<Employee>> getAllEmployee() throws IOException {
        return new ResponseEntity<>(employeeService.getAllEmployee(), HttpStatus.OK);
    }

    @GetMapping("/employee/{age}")
    public ResponseEntity<List<Employee>> getEmployeeByAge(@PathVariable("age") int age) throws IOException {
        return new ResponseEntity<>(employeeService.getEmployeeByAge(age),HttpStatus.OK);
    }
}

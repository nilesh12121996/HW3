package com.example.antra.service;

import com.example.antra.module.Employee;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public interface EmployeeService {

    List<Employee> getAllEmployee() ;

    List<Employee> getEmployeeByAge(int age) ;

}

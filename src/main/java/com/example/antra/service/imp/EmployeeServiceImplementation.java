package com.example.antra.service.imp;

import com.example.antra.resttemplate.EmployeeRestTemplate;
import com.example.antra.module.Employee;
import com.example.antra.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImplementation implements EmployeeService {

    @Autowired
    private EmployeeRestTemplate employeeRestTemplate;


    @Override
    public List<Employee> getAllEmployee()  {

        return employeeRestTemplate.getEmployeeData();
    }

    @Override
    public List<Employee> getEmployeeByAge(int age)  {
        return employeeRestTemplate.getEmployeeData().stream().filter(x-> x.getEmployee_age()==age).collect(Collectors.toList());
    }
}

package com.example.antra.resttemplate;

import com.example.antra.module.Employee;
import com.example.antra.resttemplate.EmployeeJsonFormat;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class EmployeeRestTemplate {

    public List<Employee> getEmployeeData() {
        RestTemplate restTemplate=new RestTemplate();
        String url="http://dummy.restapiexample.com/api/v1/employees";
        ResponseEntity<EmployeeJsonFormat> response= restTemplate.getForEntity(url, EmployeeJsonFormat.class);
        EmployeeJsonFormat result=response.getBody();
        return result.getData();
    }


}

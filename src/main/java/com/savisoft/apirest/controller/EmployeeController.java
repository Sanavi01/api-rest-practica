package com.savisoft.apirest.controller;


import com.savisoft.apirest.entity.Employee;
import com.savisoft.apirest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/saveEmployee")
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @DeleteMapping("/deleteEmployee/{id}")
    public void deleteEmployee(@PathVariable Long id){
        employeeService.deleteEmployee(id);
    }

    @GetMapping("/findAllEmployees")
    public List<Employee> listAllEmployees(){
        return employeeService.listAllEmployee();
    }




}

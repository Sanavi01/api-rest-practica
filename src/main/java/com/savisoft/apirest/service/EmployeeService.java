package com.savisoft.apirest.service;

import com.savisoft.apirest.entity.Employee;

import java.util.List;

public interface EmployeeService {

    Employee saveEmployee(Employee employee);
    void deleteEmployee(Long id);
    List<Employee> listAllEmployee();
}

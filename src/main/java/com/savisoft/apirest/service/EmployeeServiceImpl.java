package com.savisoft.apirest.service;

import com.savisoft.apirest.entity.Employee;
import com.savisoft.apirest.repository.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeRepository employeRepository;

    @Override
    public Employee saveEmployee(Employee employee) {
        return  employeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Long id) {
        employeRepository.deleteById(id);
    }

    @Override
    public List<Employee> listAllEmployee() {
        return employeRepository.findAll();
    }


}

package com.savisoft.apirest.repository;

import com.savisoft.apirest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeRepository extends JpaRepository<Employee, Long> {
}

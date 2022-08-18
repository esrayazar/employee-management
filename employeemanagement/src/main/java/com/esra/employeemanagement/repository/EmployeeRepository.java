package com.esra.employeemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esra.employeemanagement.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository <Employee, Long> {

}

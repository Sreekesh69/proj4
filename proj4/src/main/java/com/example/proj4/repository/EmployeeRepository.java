package com.example.proj4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.proj4.model.Employee;

public interface  EmployeeRepository extends JpaRepository<Employee ,Long> {
    
}

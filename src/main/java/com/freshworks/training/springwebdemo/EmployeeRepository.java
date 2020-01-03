package com.freshworks.training.springwebdemo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository
        extends JpaRepository<EmployeeEntity, Long> {

  EmployeeEntity findFirstByName(String empName);
}

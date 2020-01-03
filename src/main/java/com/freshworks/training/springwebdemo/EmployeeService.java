package com.freshworks.training.springwebdemo;

import java.util.List;

public interface EmployeeService {
  String printEmpName(String empName);

  List<EmployeeEntity> getAllEmployees();

  EmployeeEntity getSpecificEmployee(Long id);

  EmployeeEntity create(EmployeeEntity employeeEntity);
}

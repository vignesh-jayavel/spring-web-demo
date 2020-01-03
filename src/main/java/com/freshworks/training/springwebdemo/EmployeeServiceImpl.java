package com.freshworks.training.springwebdemo;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

  @Override
  public String printEmpName(String empName) {
    if (StringUtils.isEmpty(empName)) {
      return "Hello world";
    } else {
      return "Hello " + empName;
    }
  }

  @Override
  public List<EmployeeEntity> getAllEmployees() {
    return null;
  }

  @Override
  public EmployeeEntity getSpecificEmployee(Long id) {
    return null;
  }

  @Override
  public EmployeeEntity create(EmployeeEntity employeeEntity) {
    return null;
  }
}

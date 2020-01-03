package com.freshworks.training.springwebdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeDynamicDataServiceImpl  implements EmployeeService{

  @Autowired EmployeeRepository employeeRepository;

  @Override
  public String printEmpName(String empName) {
    EmployeeEntity employeeEntity = employeeRepository.findFirstByName(empName);
    if (employeeEntity == null) {
      return "Hello world";
    } else {
      return "Hello " + empName + " , your EmpId:"
              +employeeEntity.id;
    }
  }

  @Override
  public List<EmployeeEntity> getAllEmployees() {
    return employeeRepository.findAll();
  }

  @Override
  public EmployeeEntity getSpecificEmployee(Long id) {
    return employeeRepository.findById(id).get();
  }

  @Override
  public EmployeeEntity create(EmployeeEntity employeeEntity) {
    return employeeRepository.save(employeeEntity);
  }
}

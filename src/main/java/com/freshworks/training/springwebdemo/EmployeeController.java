package com.freshworks.training.springwebdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.util.List;

@RestController
@Validated
public class EmployeeController {

//  @Autowired EmployeeService employeeService;
//   When you have multiple Bean definitions for the Same Interface type
//  1. Directly use the class name as reference
//@Autowired EmployeeDynamicDataServiceImpl employeeDynamicDataServiceImpl;
//  2. Use @Qualifier("className")
//  @Autowired
//  @Qualifier("employeeDynamicDataServiceImpl")
//EmployeeService employeeService;
//  3. Leverage Spring convention
//  Use InterfaceName as reference & className as object name
    @Autowired EmployeeService employeeDynamicDataServiceImpl;

  @GetMapping("/api/hello")
  public String sayHello(
          @RequestParam(name = "empName",
                  required=false)
         @Size(min = 5, message="hey 5chars for name")
         String empName,
          @Min(20)
          @RequestParam(name = "empAge",
                  required=false)
          Integer age) {
    return employeeDynamicDataServiceImpl.printEmpName(empName);
  }

  @GetMapping("/api/employees")
  public List<EmployeeEntity> getAllEmployees() {
    return employeeDynamicDataServiceImpl.getAllEmployees();
  }

  @GetMapping("/api/employees/{empId}")
  public EmployeeEntity getSpecificEmployee(
          @PathVariable(name = "empId") Long id) {
    return employeeDynamicDataServiceImpl.getSpecificEmployee(id);
  }

  @PostMapping("/api/employees")
  public EmployeeEntity createEmployee(
          @RequestBody
          EmployeeEntity employeeEntity) {
    return employeeDynamicDataServiceImpl.create(employeeEntity);
  }


}

# spring-web-demo

Take home assignment::

Extend the application.
1. Delete Employee by Id using API

2. Introduce a new Department resource
should have 
Table(department_id, department_name), 
Spring Implementation:: Controller, Service, Entity, Repository

3. Alter the employee table to contain department_id as Foreign key to Department table in Mysql

4. User @OneToOne annotation in EmployeeEntity to introduce DepartmentEntity as part of EmployeeEntity

5. Return EmployeeEntity with department info eg.
Current format::
{
  "id": 123,
  "name": "adam",
}

Expected format::
{
  "id": 123,
  "name": "adam",
  "department": {
    "departmentId": 1,
    "departmentName": "Software Engineering"
  }
}

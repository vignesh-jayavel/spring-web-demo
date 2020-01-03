package com.freshworks.training.springwebdemo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
@Data
public class EmployeeEntity {

  @Id
  @GeneratedValue
  Long id;

  String name;
}

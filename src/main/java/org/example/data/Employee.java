package org.example.data;

public class Employee {

  private String name;
  private EmployeeType type;

  public Employee(EmployeeType type) {
    this.type = type;
  }

  public EmployeeType getType() {
    return type;
  }
}

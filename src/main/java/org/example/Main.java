package org.example;

import org.example.data.Employee;
import org.example.data.EmployeeType;
import org.example.exceptions.InvalidEmployeeTypeException;

public class Main {

  public static void main(String[] args) throws InvalidEmployeeTypeException {
    System.out.println("Let's begin calculating");
    EmployeePaymentStrategyFactory employeePaymentStrategyFactory = new EmployeePaymentStrategyFactory();
    Employee emp = new Employee(EmployeeType.SALARIED);

    System.out.println(employeePaymentStrategyFactory.createPaymentStrategy(emp).calculatePay(emp).getOutputDescription());
    System.out.println(employeePaymentStrategyFactory.createPaymentStrategy(emp).calculateBonus(emp).getOutputDescription());
  }
}

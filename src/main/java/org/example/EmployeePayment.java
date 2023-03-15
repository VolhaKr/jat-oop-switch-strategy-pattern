package org.example;

import org.example.data.Employee;
import org.example.exceptions.InvalidEmployeeTypeException;
import org.example.paymentstrategies.EmployeePaymentStrategy;

public class EmployeePayment {

    EmployeePaymentStrategy employeePaymentStrategy;
    public EmployeePayment(EmployeePaymentStrategy employeePaymentStrategy)
    {
     this.employeePaymentStrategy=employeePaymentStrategy;
    }
    public void pay(Employee employee) throws InvalidEmployeeTypeException {
      employeePaymentStrategy.calculatePay(employee);
      employeePaymentStrategy.calculateBonus(employee);
    }
  }

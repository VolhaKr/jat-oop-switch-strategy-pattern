package org.example;

import org.example.data.Employee;
import org.example.exceptions.InvalidEmployeeTypeException;
import org.example.paymentstrategies.CommissionedEmployeePaymentStrategy;
import org.example.paymentstrategies.EmployeePaymentStrategy;
import org.example.paymentstrategies.HourlyEmployeePaymentStrategy;
import org.example.paymentstrategies.SalariedEmployeePaymentStrategy;

public class EmployeePaymentStrategyFactory {
  EmployeePaymentStrategy createPaymentStrategy(Employee employee) throws InvalidEmployeeTypeException {

    return switch (employee.getType()) {
      case COMMISSIONED -> new CommissionedEmployeePaymentStrategy();
      case HOURLY -> new HourlyEmployeePaymentStrategy();
      case SALARIED -> new SalariedEmployeePaymentStrategy();
      default -> throw new InvalidEmployeeTypeException();
    };
    }
  }

package org.example.paymentstrategies;

import org.example.data.Employee;
import org.example.data.Money;
import org.example.exceptions.InvalidEmployeeTypeException;

public interface EmployeePaymentStrategy {
  Money calculatePay(Employee employee) throws InvalidEmployeeTypeException;
  Money calculateBonus(Employee employee) throws InvalidEmployeeTypeException;
 }

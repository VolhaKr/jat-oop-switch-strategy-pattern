package org.example.paymentstrategies;

import org.example.data.Employee;
import org.example.data.Money;
import org.example.exceptions.InvalidEmployeeTypeException;

public class SalariedEmployeePaymentStrategy implements EmployeePaymentStrategy {

  @Override
  public Money calculatePay(Employee employee) throws InvalidEmployeeTypeException {
    return calculateSalariedPay(employee);
  }

  private Money calculateSalariedPay(Employee employee) {
    return new Money("Salaried pay calculated");
  }

  @Override
  public Money calculateBonus(Employee employee) throws InvalidEmployeeTypeException {
    return calculateSalariedBonus(employee);
  }

  private Money calculateSalariedBonus(Employee employee) {
    return new Money("Salaried bonus calculated");
  }
}

package org.example.paymentstrategies;

import org.example.data.Employee;
import org.example.data.Money;
import org.example.exceptions.InvalidEmployeeTypeException;

public class HourlyEmployeePaymentStrategy implements EmployeePaymentStrategy {

    @Override
    public Money calculatePay(Employee employee) throws InvalidEmployeeTypeException {
      return calculateHourlyPay(employee);
    }

    private Money calculateHourlyPay(Employee employee) {
      return new Money("Hourly pay calculated");
    }

    @Override
    public Money calculateBonus(Employee employee) throws InvalidEmployeeTypeException {
      return calculateHourlyBonus(employee);
    }

  private Money calculateHourlyBonus(Employee employee) {
    return new Money("Hourly bonus calculated");
  }
}

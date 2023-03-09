package org.example.paymentstrategies;

import org.example.data.Employee;
import org.example.data.Money;
import org.example.exceptions.InvalidEmployeeTypeException;

public class CommissionedEmployeePaymentStrategy implements EmployeePaymentStrategy {

  @Override
  public Money calculatePay(Employee employee) throws InvalidEmployeeTypeException {
    return calculateCommissionedPay(employee);
  }

  private Money calculateCommissionedPay(Employee employee) {
    return new Money("Commissioned pay calculated");
  }

  @Override
  public Money calculateBonus(Employee employee) throws InvalidEmployeeTypeException {
    return calculateCommissionedBonus(employee);
  }
  private Money calculateCommissionedBonus(Employee employee){
    return new Money("Commissioned bonus calculated");
  }
}

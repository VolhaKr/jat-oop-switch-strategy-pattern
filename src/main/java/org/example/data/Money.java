package org.example.data;

import java.math.BigDecimal;

public class Money {
  private String outputDescription;
  private BigDecimal sum;

  public String getOutputDescription() {
    return outputDescription;
  }

  public void setOutputDescription(String outputDescription) {
    this.outputDescription = outputDescription;
  }

  public BigDecimal getSum() {
    return sum;
  }

  public void setSum(BigDecimal sum) {
    this.sum = sum;
  }

  public Money() {
  }

  public Money(String outputDescription) {
    this.outputDescription = outputDescription;
  }

}

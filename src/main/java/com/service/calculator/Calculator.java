package com.service.calculator;

public class Calculator {
  double firstOperand;
  double secondOperand;
  String operation;
  public Calculator(double firstOperand, double secondOperand, String operation) {
    this.firstOperand = firstOperand;
    this.secondOperand = secondOperand;
    this.operation = operation;
    System.out.println("result : "+ result());
  }
  private double result(){
    if (operation.equals("+"))
      return firstOperand + secondOperand;
    if (operation.equals("-"))
      return firstOperand - secondOperand;
    if (operation.equals("*"))
      return firstOperand * secondOperand;
    if (operation.equals("/") && secondOperand != 0)
      return firstOperand / secondOperand;
    if (operation.equals("/") && secondOperand == 0)
      throw new ArithmeticException("0으로는 나눌수가 없다.");
    else
      throw new IllegalArgumentException("지원하지 않는 연산자입니다.");
  }

}

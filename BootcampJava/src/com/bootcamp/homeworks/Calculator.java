package com.bootcamp.homeworks;

public class Calculator {
  private int number1;
  private int number2;

  public Calculator(int number1, int number2) {
    this.number1 = number1;
    this.number2 = number2;
  }

  public int sum() {
    return number1 + number2;
  }

  public int mines() {
    return number1 - number2;
  }

  public int divide() {
    return number1 / number2;
  }

  public int cross() {
    return number1 * number2;
  }

  public int mod() {
    return number1 % number2;
  }

  public int increase() {
    int a = number1;
    a++;
    return a+10;
  }

  public int decrease() {
    int b = number1;
    b--;
    return b;
  }
}

package com.bootcamp.secondWeek;

public class IfElse {

  private int age;

  public IfElse(int age) {
    this.age = age;
  }

  public String akbilUcretiGosterme() {
    String tarife;
    if (age >= 0 && age <= 18) {
      tarife = "ücretsiz";
    } else if (age >= 19 && age <= 50) {
      tarife = "3 TL öde";
    } else if (age >= 51 && age <= 55) {
      tarife = "1,5 TL öde";
    } else {
      tarife = "yaşlı ücretsiz";
    }
    System.out.println(tarife);
    return tarife;
  }
}

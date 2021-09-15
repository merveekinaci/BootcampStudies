package com.bootcamp.secondWeek;

public class SwitchCase {

  private int number;

  public SwitchCase(int number) {
    this.number = number;
  }

  public String atm() {
    String result;

    switch (number) {
      case 1:
        result = "Para Yatırın!";
        break;

      case 2:
        result = "Para Çekiniz";
        break;

      case 3:
        result = "Kredi çekin";
        break;

      default:
        result = "İşlem Geçersiz";

    }
    System.out.println(result);
    return result;
  }
}

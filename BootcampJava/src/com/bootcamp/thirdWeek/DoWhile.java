package com.bootcamp.thirdWeek;

public class DoWhile {

  private int basımHakkı;

  public DoWhile(int basımHakkıx) {
    this.basımHakkı = basımHakkıx;
  }

  public void basımHakkıBitinceYazdır() {
    boolean hakBitis = false;
    do {
      basımHakkı--;
      if (basımHakkı == 0) {
        hakBitis = true;
      }else {
        System.out.println(basımHakkı + " hakkınız kaldı");
      }
    } while (!hakBitis);
    System.out.println("Hakkınız bitti");
  }
}

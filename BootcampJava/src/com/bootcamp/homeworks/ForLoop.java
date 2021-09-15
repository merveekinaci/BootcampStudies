package com.bootcamp.homeworks;

public class ForLoop {

  public int sayıDöndür() {
    int count = 0;
    for (int i = 100; i >= 0; i--) {
      if(i % 7 == 0){
        System.out.println(i);
        count++;
      }
    }
    System.out.println("Sonuc " + count);
    return count;
  }
}

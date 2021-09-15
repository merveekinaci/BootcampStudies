package com.bootcamp.fourthWeek;

import java.util.Scanner;

public class GradeAvarage {
  Scanner sc = new Scanner(System.in);
  String dersler[] = {"Mat", "Fen", "Türkçe", "Sosyal", "Beden", "İngilizce" , "Resim"};
  double notlar[] = new double[dersler.length];  //{90,80,70  }

  public double dersNotOrtalamasıBulma() {
    System.out.println("Derslerinizin Notunu Girmeye Hazırlanınız!");
    System.out.println("******************************************");
    double notToplamı = 0;
    for (int i = 0; i < notlar.length; i++) {
      System.out.println(dersler[i] + " notunuzu giriniz");
      double not = sc.nextDouble();
      //TODO : Adam notunu doğru girmedikçe kod çalışmaya devam etsin ve adam doğru notu girince dursun.
      if (not > 100 || not < 0) {
        System.out.println("Girdiğiniz not yanlıştır");
        System.out.println("Tekrardan notunuzu giriniz!");
        notlar[i] = sc.nextDouble();
      } else {
        notlar[i] = not;
      }
      notToplamı += notlar[i];
    }
    return notToplamı / notlar.length;
  }
}

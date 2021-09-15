package com.bootcamp.fourthWeek;

import java.util.Scanner;

public class GradeAvarage {
  Scanner sc = new Scanner(System.in);
  String dersler[] = {"Mat", "Fen", "Türkçe", "Sosyal", "Beden", "İngilizce" , "Resim"};
  double notlar[] = new double[dersler.length];

  public double dersNotOrtalamasıBulma() {
    System.out.println("Derslerinizin Notunu Girmeye Hazırlanınız!");
    System.out.println("******************************************");
    double notToplamı = 0;
    for (int i = 0; i < notlar.length; i++) {
      boolean gradeControl = false;
      System.out.println(dersler[i] + " notunuzu giriniz");
      while (!gradeControl) {
        double not = sc.nextDouble();
        if (not > 100 || not < 0) {
          System.out.println("Girdiğiniz not yanlıştır");
          System.out.println("Tekrardan notunuzu giriniz!");
        } else {
          notlar[i] = not;
          gradeControl = true;
        }
      }
      notToplamı += notlar[i];
    }
    return notToplamı / notlar.length;
  }
}

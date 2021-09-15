package com.bootcamp.homeworks;

import java.util.Scanner;

public class Student {

  private int dogruSifre;

  public Student(int dogruSifre) {
    this.dogruSifre = dogruSifre;
  }

  Scanner sc = new Scanner(System.in);


  public void ogrenciGectimiKaldımıEkranaYazdır() {
    System.out.println("Notunuzu giriniz!");
    int ogrenciNotu = sc.nextInt();
    if (ogrenciNotu > 100 && ogrenciNotu < 0) {
      System.out.println("Geçersiz Not");
    } else if (ogrenciNotu > 50) {
      System.out.println("Geçtiniz");
    } else {
      System.out.println("Kaldınız");
    }
  }

  public void dolabınSifresiniDogruGirme() {
    boolean sifreDogrumu = false;
    int denemeHakkı = 3;
    System.out.println("Sifrenizi giriniz!");
    while (!sifreDogrumu && denemeHakkı != 0) {
      int sifre = sc.nextInt();
      if (sifre == dogruSifre) {
        sifreDogrumu = true;
        System.out.println("Başarılı");
      } else {
        denemeHakkı--;
        if (denemeHakkı == 0) {
          System.out.println("Hesabınız bloke olmuştur.");
        } else {
          System.out.println("Tekrar Dene");
        }
      }
    }
  }

  public void derstenKalma() {
    int kalmaHakkı = 2;
    int dersSayısı = 6;
    System.out.println("Sırasıyla ders notlarını giriniz!");
    while (kalmaHakkı != 0 && dersSayısı != 0) {
      int not = sc.nextInt();
      if (not < 50) {
        kalmaHakkı--;
        if (kalmaHakkı == 0) {
          System.out.println("Sınıf Tekrarı");
        }
      }
      dersSayısı--;
    }
  }
}

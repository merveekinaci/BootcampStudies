package com.bootcamp.thirdWeek;

import java.util.Scanner;

public class While {

  private String password;
  Scanner sc = new Scanner(System.in);

  public While(String passwordx){
    this.password = passwordx;
  }

  public void passwordControl() {
    boolean şifreKontrol = false;
    while(!şifreKontrol) {
      System.out.println("şifreyi giriniz");
      if(sc.next().equals(password)){
        şifreKontrol = true;
        System.out.println("sisteme başarılı giriş yaptınız!");
      } else {
        System.out.println("tekrar deneyiniz");
      }
    }
  }
}

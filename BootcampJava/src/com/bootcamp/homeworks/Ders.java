package com.bootcamp.homeworks;

public class Ders {

  private int dersSüresi;
  private int derseKatılımNumarası;

  public Ders(int dersSüresi, int derseKatılımNumarası) {
    this.dersSüresi = dersSüresi;
    this.derseKatılımNumarası = derseKatılımNumarası;
  }

  public void dersleriSüresineGöreGösterme() {
    if (dersSüresi <= 30 && dersSüresi > 0) {
      System.out.println("Ders: Matematik");
    } else if (dersSüresi <= 50 && dersSüresi > 30) {
      System.out.println("Ders: Türkçe");
    } else {
      System.out.println("Ders süresini yanlış girdiniz");
    }
  }

  public String derseKatılım() {
    String katılım;
    switch (derseKatılımNumarası) {
      case 1:
        katılım = "Derse katıldım";
        break;
      case 2:
        katılım = "Derse yarım katıldım";
        break;
      case 3:
        katılım = "derse katılmadım";
        break;
      default:
        katılım = "ders nedir?";
        break;
    }
    System.out.println(katılım);
    return katılım;
  }
}

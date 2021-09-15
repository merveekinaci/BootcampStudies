package com.bootcamp.thirdWeek;

public class For {
  private int first;
  private int second;

  public For(int first, int second) {
    this.first = first;
    this.second = second;
  }

  public int ikiSayıArasıKacAdetTekSayıVarGösterme() {
    if(first > second){
      System.out.println("İşlem geçersizdir birinci sayı ikinciden büyük olamaz");
      return -1;
    }

    int count = 0;
    for(int i = first; i<second; i++) {
      if(i % 2 == 1) {
        System.out.println(i + ",");
        count++;
      }
    }

    System.out.println("Sonuç: Toplam Tek Sayı " + count +" tanedir");
    return count;
  }
}

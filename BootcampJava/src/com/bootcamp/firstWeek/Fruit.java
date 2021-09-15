package com.bootcamp.firstWeek;

public class Fruit {

  public int calori = 100;
  public String type = "Banana";

  public void grow(){
    System.out.println("Grow");
  }

  public String eat() {
    return calori + " " + type +" calori Ate";
  }
}

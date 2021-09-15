package com.bootcamp.firstWeek;

public class Car {

  private int model;
  private String brand;
  private String color;

  public Car(int model, String marka, String renk) {
    this.model = model;
    this.brand = marka;
    this.color = renk;
  }

  public void start() {
    System.out.println("Start");
  }

  public String gearChanging() {
    String text = model + " " + color + " car have 7 gear.";
    System.out.println(brand + text);
    return brand + text;
  }
}

package com.bootcamp.firstWeek;

public class House {

  private String color;
  private int roomCount;

  public House() {
  }

  public House(int roomCount){
    this.roomCount = roomCount;
  }

  public House(String color, int roomCount) {
    this.color = color;
    this.roomCount = roomCount;
  }

  public void hot() {
    System.out.println(color + " house is hot.");
  }

  public int cold() {
    int result = roomCount + 3;
    System.out.println(result);
    return result;
  }

  public String airCondition() {
    String air = "cold";
    System.out.println(air);
    return air;
  }

  public boolean isDoorOpen() {
    boolean door = false;
    return door;
  }
}

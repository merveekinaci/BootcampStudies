package com.bootcamp.firstWeek;

public class School {

  private String className;
  private int deskNumber;

  public School(String classname,int desknumber) {
    this.className = classname;
    this.deskNumber = desknumber;
  }

  public void teach() {
    System.out.println("Teached");
  }

  public int countOfStudents() {
    System.out.println(className + " Student count : "+ (deskNumber*2));
    return deskNumber*2;
  }
}

package com.talios.frege;

public class MyJavaClass {
  
  private String name;

  public String getName() {
    return name;
  }

  private MyJavaClass(String name) {
    this.name = name;
  }

  public static MyJavaClass makeClass(String name) {
    return new MyJavaClass(name);
  }

}
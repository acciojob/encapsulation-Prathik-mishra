package com.driver;

public class Main {
  public static void main(String[] args) {
    RWOnly obj = new RWOnly();

     obj.name = "";
     System.out.println(obj.name);

    //error message 'name' has private access in 'com.driver.RWOnly'

    obj.setName("Prathik");
    String name = obj.getName();
  }
}
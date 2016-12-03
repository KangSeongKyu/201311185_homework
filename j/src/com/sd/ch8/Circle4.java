package com.sd.ch8;

public class Circle4 extends Shape4 {
  private double radius, area, perimeter;
  
  public Circle4(double radius) {
    this.radius = radius;
    this.area = (radius*radius)*(3.14);
    this.perimeter = 2*(3.14)*radius;
  }
  
  public double calcArea() {
    return this.area;
  }
  
  public double calcPerimeter() {
    return this.perimeter;
  }
  
  public String toString() {
    return "Circle..."+super.toString();
  }
}
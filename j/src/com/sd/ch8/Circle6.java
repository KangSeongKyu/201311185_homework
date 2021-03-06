package com.sd.ch8;

public class Circle6 extends Shape6 {
  private double radius, area, perimeter;
  
  public Circle6(double radius) {
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
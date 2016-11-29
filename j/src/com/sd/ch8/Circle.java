package com.sd.ch8;

class Circle extends Point {
  protected double radius;
  protected double area;
  
  public Circle(int x, int y, double radius) {
    super(x, y);
    this.radius=radius;
  }
  
  public double getArea() {
    area = radius*radius*(3.14);
    return area;
  }
}
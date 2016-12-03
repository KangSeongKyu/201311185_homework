package com.sd.ch8;

public class Rectangle4 extends Shape4 {
  private double width, height, area, perimeter;
  public Rectangle4(double width, double height){
    this.width=width;
    this.height=height;
    this.area=width*height;
    this.perimeter=(width+height)*2;
  }
  public double calcArea() {
    return this.area;
  }
  public double calcPerimeter() {
    return this.perimeter;
  }
  
  public String toString() {
    return "Rectangle..."+super.toString();
  }
}
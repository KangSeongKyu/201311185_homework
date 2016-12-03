package com.sd.ch8;

public class Rectangle6 extends Shape6 {
  private double width, height, area, perimeter;
  
  public Rectangle6(double width, double height){
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
package com.sd.ch8;

public class Point{
  protected int x;
  protected int y;
  
  public Point(int x, int y) {
    x = this.x;
    y = this.y;
  }
  
  public static void main(String[] args){
    Circle c1 = new Circle(20,30,5);
    Circle c2 = new Circle(28,56,10);
    
    System.out.println("Area: "+c1.getArea());
    System.out.println("Area: "+c2.getArea());
  }
}
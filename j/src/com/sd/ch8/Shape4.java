package com.sd.ch8;

public abstract class Shape4 {
	public String name="Shape";
	public abstract double calcArea();
	public abstract double calcPerimeter();
	public String getName() {
		return this.name;
	}
	public String toString() {
		return "Shape..."+super.toString();
	}
	
	public static void main(String[] args) {
    Rectangle4 r = new Rectangle4(4,5);
    Circle4 c = new Circle4(10);
    
    r.toString();
    c.toString();
    
    System.out.println("Rectangle's Area: " + r.calcArea());
    System.out.println("Rectangle's Perimeter: "+r.calcPerimeter());
    
    System.out.println("Circle's Area: "+c.calcArea());
    System.out.println("Circle's Perimeter: "+c.calcPerimeter());
	}
}
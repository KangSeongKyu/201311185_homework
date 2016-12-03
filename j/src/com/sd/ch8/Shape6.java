package com.sd.ch8;

public abstract class Shape6 {
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
    Rectangle6 r = new Rectangle6(5,4);
    Circle6 c = new Circle6(10);
    
    if(r instanceof Shape6 && r instanceof Rectangle6)
      System.out.println(r.toString());
    ////////////////////////////////////////////////////  
    Shape6[] s = new Shape6[2];
    s[0]=r;
    s[1]=c;
    
    for(Shape6 my : s) {
      if(my instanceof Rectangle6) {
        System.out.println(my.toString());
      } else if(my instanceof Circle6) {
        System.out.println(my.toString());
      }
    }
    /////////////////////////////////////////////////////
    for(Shape6 me : s)
      System.out.println(me.toString());
	}
}
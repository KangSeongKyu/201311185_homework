package com.sd.ch8;

class Hello {
  private String name;
  
  public Hello(String name) {
    this.name = name;
  }
  public void sayHello() {
    System.out.println("Hello "+name);
  }
  
  public static void main(String[] args) {
    Hello hello = new Hello("Gamst");
    
    Hello[] h = new Hello[5];
    
    h[0]=new Hello("Ronaldo");
    h[1]=new Hello("Messi");
    h[2]=new Hello("Zlatan");
    h[3]=new Hello("Rooney");
    h[4]=new Hello("Pogba");
      
    for(Hello e : h)
      e.sayHello();
  }
    
}
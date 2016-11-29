package com.sd.ch8;

class Turtle {
  protected int nLimb = 4;
  protected String food;
  
  public void setFood(String f) {
    f=this.food;
  }
  public void eat() {
    System.out.print("Turtles eat" + food);
  }
  public void getNlimb(){
    System.out.print("Common ");
    System.out.println("Turtle's leg total: "+nLimb);
  }
  
  public static void main(String[] args) {
    Turtle t = new Turtle();
    SeaTurtle st = new SeaTurtle();
    LandTurtle lt = new LandTurtle();
    
    t.getNlimb();
    st.getNlimb();
    lt.getNlimb();
  }
}
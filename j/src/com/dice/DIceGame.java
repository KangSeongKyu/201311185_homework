package com.sd.dice;

class DiceGame{
  private Player p1;
  private Player p2;
  private int point1=0;
  private int point2=0;
  
  public DiceGame(String one, String two) {
    p1 = new Player(one);
    p2 = new Player(two);
    
    for(int i=0; i<2; i++){
      p1.play();
      p2.play();
      startGame();
      System.out.println(" ");
    }
    result();
  }
  public void result() {
    if(point1 > point2) {
      p1.score+=1;
      System.out.println(p1.getName() + "'s total point : " + point1);
      System.out.println(p2.getName() + "'s total point : " + point2);
      System.out.println(" ");
      System.out.println(p1.getName() + " win!!!!!!");
      System.out.println(p2.getName() + " lose......");
    }else if (point1 == point2) {
        System.out.println(p1.getName() + "'s total point : " + point1);
        System.out.println(p2.getName() + "'s total point : " + point2);
        System.out.println(" ");
        System.out.println("draw~~~~~~~");
    }else {
        p2.score+=1;
        System.out.println(p2.getName() + "'s total point : " + point2);
        System.out.println(p1.getName() + "'s total point : " + point1);
        System.out.println(" ");
        System.out.println(p2.getName() + " win!!!!!!");
        System.out.println(p1.getName() + " lose......");   
      }  
   }
   public void startGame() {
      if(p1.getNum() > p2.getNum() || p1.getNum()==p2.getNum()) {
        System.out.println("Player1 "+p1.getName()+"'s Dice Number is "+p1.getNum());
        System.out.println("Player2 "+p2.getName()+"'s Dice Number is "+p2.getNum());
        point1+=p1.getNum();
        point2+=p2.getNum();
      }else if(p1.getNum() < p2.getNum()){
        System.out.println("Player2 "+p2.getName()+"'s Dice Number is "+p2.getNum());
        System.out.println("Player1 "+p1.getName()+"'s Dice Number is "+p1.getNum());
        point1+=p1.getNum();
        point2+=p2.getNum();
      }
   }
}
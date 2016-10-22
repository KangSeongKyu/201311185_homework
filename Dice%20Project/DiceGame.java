package com.smu.dicegame;

class DiceGame {
     Player p1;
     Player p2;
     public void startGame() {
         p1 = new Player("Media");
         p2 = new Player("Software");
         p1.play();
         p2.play();
         if (p1.getNum() > p2.getNum()) {
	     p1.score++;
             System.out.println(p1.getName() + " win");
             System.out.println(p1.getName()+"score: "+p1.score);
             System.out.println(p2.getName()+"score: "+p2.score);
         }
         else if (p1.getNum() == p2.getNum()) {
             System.out.println(" draw");
             System.out.println(p1.getName()+"score: "+p1.score);
             System.out.println(p1.getName()+"score: "+p1.score);
         }
         else
	     p2.score++;
             System.out.println(p2.getName() + " won");
             System.out.println(p2.getName()+"score: "+p2.score);
             System.out.println(p1.getName()+"score: "+p1.score);
     }
 }
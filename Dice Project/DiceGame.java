class DiceGame {
     Player p1;
     Player p2;
     public void startGame() {
         p1 = new Player("Media");
         p2 = new Player("Software");
         p1.play();
         p2.play();
         if (p1.getNum() > p2.getNum()) {
             System.out.println(p1.getName() + " won");
         }
         else if (p1.getNum() == p2.getNum()) {
             System.out.println(" draw");
         }
         else
             System.out.println(p2.getName() + " won");
     }
 }

DiceGame d = new DiceGame();
d.startGame();
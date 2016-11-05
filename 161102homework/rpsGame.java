class rpsGame {
    
  static void playgame(String x, String y) {  
    if(x.equals("rock") && y.equals("sissors")) {
      System.out.println("Player1 win!");
    }else if (x.equals("sissors") && y.equals("sissors")) {
      System.out.println("Player1 win!");
    }else if (x.equals("paper") && y.equals("sissors")) {
      System.out.println("Player1 win!");
    }else if(x.length() == y.length()) {
      System.out.println("Draw...");
    }else {
      System.out.println("Player 2 win!");
    }
  }
  public static void main(String[] args) {
    String x = "rock";
    String y = "paper";
    
    System.out.println("Player 1: "+x);
    System.out.println("Player 2: "+y);
    playgame(x,y);
  }
}
package com.sd.dice;

import java.util.Scanner;
import java.util.Date;

public class Main {
  public static void main(String[] args) {
  Date d = new Date();
  
  while(true){
    Scanner scan = new Scanner(System.in);
    Scanner scan2 = new Scanner(System.in);
    System.out.println("Join Yutnori or DiceGame?");
    System.out.print("1. Yutnori, 2. DiceGame, 3. Exit : ");
    int s = scan.nextInt();
        
    if(s==1) {
      System.out.print("Write Player1's name : ");
      String p1 = scan2.next();
      System.out.print("Write Player2's name : ");
      String p2 = scan2.next();
      System.out.println(d);
      PlayYut y = new PlayYut(p1,p2);
    }else if(s==2) {
      System.out.print("Write Player1's name : ");
      String p1 = scan2.next();
      System.out.print("Write Player2's name : ");
      String p2 = scan2.next();
      System.out.println(" ");
      System.out.println(d);
      DiceGame dg = new DiceGame(p1,p2);
    }else if(s==3)
      break;
  }
 }
}
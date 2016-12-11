package com.sd.dice;

public class Yutnori extends Dice {
  public void roll() {
    number=(int)(Math.random()*5+1);
  }
}
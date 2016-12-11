package com.sd.dice;

public class Player {
    private String name=null;
    int num=0;
    int score=0;

    public Player(String _name) {
        name=_name;
    }
    public void play() {
        Dice d=new Dice();
        d.roll();
        num=d.getNum();
    }
    public String getName() {
        return this.name;
    }
    public int getNum() {
        return this.num;
    }
}
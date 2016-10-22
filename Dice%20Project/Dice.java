package com.smu.dicegame;

class dice {
	private int number=0;
	public void roll(){
		number=(int)(Math.random()*6)+1;
		System.out.println("Turns on "+number);
	}
	public int getNum() {
		return this.number;
	}
}
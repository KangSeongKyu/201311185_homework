package com.sd.turtle;
import ch.aplu.turtle.*;


class TurtleDemoMain {
	void TurtleDomoMain() {
		Turtle t1 = new Turtle();
		for(int i=0; i < 4; i++) {
			t1.forward(50);
			t1.left(90);
		}
	}

	public static void main(String[] args) {
		new TurtleDemoMain();
	}

}
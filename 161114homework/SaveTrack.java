import ch.aplu.turtle.*;
import java.util.ArrayList;

class SaveTrack{
  static Turtle t1 = new Turtle();
  
  static void drawSquareAtSave() {
    ArrayList<Double[]> posArr = new ArrayList<Double[]>(); //¹è¿­ÀÇ ArrayList
    
    for(int i=0; i<4; i++) {
      Double[] pos = new Double[2];
      pos[0]=t1.getX();
      pos[1]=t1.getY();
      posArr.add(pos);
      t1.forward(100);
      t1.right(90);
    }
    for(Double[] d : posArr) {
      System.out.printf("(%.1f, %.1f)",d[0],d[1]);
    }
  }
  
  public static void main(String[] args) {
    drawSquareAtSave();
  }
}
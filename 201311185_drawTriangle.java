Turtle t2 = new Turtle();
import ch.aplu.turtle.*;
void drawTriangle(int size){
for(int i=0; i<3; i++){
t2.forward(size);
t2.right(120);
}
}
drawTriangle(100);
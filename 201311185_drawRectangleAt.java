import ch.aplu.turtle.*;
Turtle t = new Turtle();
void drawRectangleAt(int size, double x, double y) {
for(int i=0;i<4;i++) {
t.forward(size);
t.right(90);
}
t.setPos(x,y);
}
drawRectangleAt(50,0,0);
drawRectangleAt(50,60,0);
drawRectangleAt(50,0,60);
drawRectangleAt(70,30,30);
import ch.aplu.turtle.*;
Turtle t4 = new Turtle();
void drawRectangle(int size) {
for(int i=0; i<4; i++) {
t4.forward(size);
t4.right(90);
}
}
drawRectangle(100);
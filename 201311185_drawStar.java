import ch.aplu.turtle.*;
Turtle t1 = new Turtle();
void drawStar(int size) {
for (int i=0; i<6; i++) {
t1.right(144);
t1.forward(size);
}
}
drawStar(100);
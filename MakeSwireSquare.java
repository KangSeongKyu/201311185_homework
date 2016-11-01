import ch.aplu.turtle.*;


class MakeSwireSquare {
static Turtle t1 = new Turtle();
static void makeSquare(int size, int bigger, int turns, double degree) {
for(int i=0; i<turns; i++) {
if(i%2 !=0) {
size+=bigger;
}
t1.forward(size);
t1.right(degree);
}
}
public static void main(String[] args) {
int size=10;
int bigger=20;
int turns=15;
double degree=90.0;
makeSquare(size,bigger,turns,degree);
}
}
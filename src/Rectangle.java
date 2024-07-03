
// rectangle is a 2d figure
public class Rectangle extends Figure {

    // create a rectangle
    public Rectangle(int x, int y) {
        super(x, y);
    }

    // calculate area of rectangle
    // area of rectangle is x * y
    @Override
    public double area() {
        return getX() * getY();
    }
}

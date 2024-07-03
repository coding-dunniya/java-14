public class Triangle extends Figure {

    // create a traingle with given coordinates
    public Triangle(int x, int y) {
        super(x, y);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double area() {
        return (getX() * getY()) / 2.0;
    }
}

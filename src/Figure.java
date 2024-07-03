// the 2d figure parent class
public abstract class Figure {

    // the x dimension of 2d figure
    private final int x;

    // the y dimension of 2d figure
    private final int y;

    // create instance of a figure with given dimensions
    public Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // calculate area of 2d figure
    public abstract double area();

    // getters and setters

    /**
     * Get the value of x
     *
     * @return the value of x
     */
    public int getX() {
        return x;
    }

    /**
     * Get the value of y
     *
     * @return the value of y
     */
    public int getY() {
        return y;
    }
}

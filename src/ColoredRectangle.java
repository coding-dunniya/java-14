// a colored rectangle
public class ColoredRectangle extends Rectangle {

    // the color of rectangle
    private final String color;

    // create instance of a colored rectangle
    public ColoredRectangle(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    /**
     * Get the value of color
     *
     * @return the value of color
     */
    public String getColor() {
        return color;
    }
}

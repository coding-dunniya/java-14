// main class - contains main method
public class Main {

    // main method - jvm calls this method
    public static void main(String[] args) {
        ColoredRectangle r = new ColoredRectangle(10, 20, "blue");
        double area = r.area();
        System.out.println("area of colored rectangle ==> " + area);
    }
}

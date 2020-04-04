package Bridge;

public class Main {
    public static void main(String[] args) {
        Color red = new Red();
        Shape square = new Square();
        square.applyColor(red);

        Color green = new Green();
        square.applyColor(green);
    }
}

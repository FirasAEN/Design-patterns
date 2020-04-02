package Bridge;

public class Square extends Shape {
    public Square() {
    }

    @Override
    public void applyColor(Color instance) {
        System.out.println("Square: ");
        instance.applyColor();
    }
}

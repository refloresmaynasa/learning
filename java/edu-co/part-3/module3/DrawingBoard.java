package module3;

public class DrawingBoard {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();

        shape = new Square();
        shape.draw();

        shape = new Rectangle();
        shape.draw();
    }
}
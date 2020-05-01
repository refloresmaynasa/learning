import module2.*;

public class Main {
    static public void main(String args[]) {
        Quadrilateral square = new Square(5);
        Quadrilateral rectangle = new Rectangle(5, 7);
        Quadrilateral parallelogram = new Parallelogram(12, 8);

        System.out.println("Square are: " + square.area());
        System.out.println("Rectangle are: " + rectangle.area());
        System.out.println("Parallelogram are: " + parallelogram.area());
    }
}
package Day2Ass21docx;

public class TestShape {
    public static void main(String[] args) {
        Shape[] s = new Shape[3];

        s[0] = (Shape) new Rectangle(10, 5);
        s[1] = (Shape) new Square(5);
        s[2] = new Triangle(3, 4);

        for (Shape ss : s) {
            System.out.println("Area: " + ss.calculateArea());
        }
    }
}

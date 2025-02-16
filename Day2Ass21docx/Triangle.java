package Day2Ass21docx;

public class Triangle extends Shape {
    int height;

    public Triangle(int length, int height) {
        super(length);
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * length * height;
    }
}

package Day2Ass21docx;

public class Rectangle extends Shape {
    int height;

    public Rectangle(int length, int height) {
        super(length);
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return length * height;
    }
}

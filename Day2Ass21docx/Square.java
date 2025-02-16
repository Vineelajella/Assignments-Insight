package Day2Ass21docx;

public class Square extends Shape {

    public Square(int length) {
        super(length);
    }

    @Override
    public double calculateArea() {
        return length * length;
    }
}

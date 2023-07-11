public class Rectangle {

    int length;
    int width;
    int area;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
        this.area = length * width;
    }

    int calculateArea() {
        return length * width;
    }

    boolean isSquare() {
        return length == width;
    }
}
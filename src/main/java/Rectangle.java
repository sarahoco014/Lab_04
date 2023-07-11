public class Rectangle {

    private int length;
    private int width;
//    private int area;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
//        this.area = length * width;
    }

    public int calculateArea() {
        return length * width;
    }

    public boolean isSquare() {
        return length == width;
    }
}
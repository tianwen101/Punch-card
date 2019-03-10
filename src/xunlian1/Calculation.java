package xunlian1;

public class Calculation {
    public static void main(String[] args) {
        Shape shape = new Round();
        shape.radius = 4;
        shape.area();
        shape = new Rectangle();
        shape.high = 9;
        shape.width = 8;
        shape.area();
    }
}

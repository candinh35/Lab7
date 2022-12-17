package baiTap5;

public class Main {
    public static void main(String[] args) {
        Squares squares = new Squares();

        squares.setSide(3);
        squares.setWidth();
        squares.setLength();
        System.out.println("dien tich la:");
        System.out.println(squares.getArea());
    }
}

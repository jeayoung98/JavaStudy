package oop1.ex;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 5;
        rectangle.length = 10;
        int area = rectangle.area;
        System.out.println("넓이 : "+ area);
        int perimeter = rectangle.perimeter;
        System.out.println("둘레 : "+ perimeter);
        boolean isSquare = rectangle.isSquare;
        System.out.println("정사각형 여부 : " + isSquare);
    }
}

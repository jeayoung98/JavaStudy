package oop1.ex;

import java.awt.geom.Area;

public class RectangleProceduralMain {

    static int area(int width,int length) {
        return  width * length;
    }

    static int perimeter(int width,int length) {
       return (width + length) * 2;
    }

    static boolean isSquare(int width,int length) {
        return width == length;
    }

    public static void main(String[] args) {
        int width = 5;
        int length = 10;
        int area = area(width, length);
        System.out.println("넓이 : " + area);
        int perimeter = perimeter(width, length);
        System.out.println("둘레 = " + perimeter);
        boolean isSquare = isSquare(width, length);
        System.out.println("정사각형 여부 : " + isSquare);
    }
}

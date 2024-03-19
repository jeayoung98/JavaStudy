package array.ex;

import java.util.Scanner;

public class ArraryEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        int total = 0;
        double average;
        System.out.println("5개의 정수를 입력하세요");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            total += arr[i];
        }
        average = (double) total/arr.length;
        System.out.println("입력한 정수의 합계 : " + total);
        System.out.println("입력한 정수의 평균 : " + average);

    }
}

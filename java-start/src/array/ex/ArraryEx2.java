package array.ex;

import java.util.Scanner;

public class ArraryEx2 {
    public static void main(String[] args) {

        int[] arr = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("정수를 입력하세요 : ");
        for (int i = 0; i < arr.length; i++) {

            arr[i] = input.nextInt();
        }
        System.out.println("출력");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length -1) {
                System.out.print(", ");
            }
            }
        }





    }


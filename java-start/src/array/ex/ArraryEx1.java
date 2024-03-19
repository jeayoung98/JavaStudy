package array.ex;

public class ArraryEx1 {
    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50};
        int sum = 0;

        for (int i = 0; i < students.length; i++) {

            sum += students[i];
        }
        System.out.println("점수 총합: " + sum);
        System.out.println("점수 평균: " + sum / students.length);
    }
}
package class1;

import java.util.Arrays;

public class ClassStart1 {
    public static void main(String[] args) {
        int[] studentScore = {90, 80};
        String[] studentName ={"학생1","학생2"};
        int[] studentAge = {15, 16};


        for (int i = 0; i < studentName.length; i++) {
            System.out.printf("이름 : %s 나이 : %d 성적 : %d", studentName[i], studentAge[i], studentScore[i]);
            System.out.println();

        }



    }
}

package loop;

public class While2_2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 10;
        while (i < 13) {
            i++;
            sum = sum + i;
            System.out.println("i = " + i + " sum = " + sum);
        }
    }
}

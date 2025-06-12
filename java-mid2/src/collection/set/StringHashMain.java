package collection.set;

import java.util.Arrays;

public class StringHashMain {

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        // char
        char charA = 'A';
        char charB = 'B';
        System.out.println("charA = " + (int)charA);
        System.out.println("charB = " + (int)charB);

        int hashCode = hashCode("Abbb");
        System.out.println(hashCode);
    }

    static int hashCode(String str) {
        char[] charArray = str.toCharArray();
        int result = 0;
        for (char c : charArray) {
            result += (int) c;
        }
        return result;
    }
}

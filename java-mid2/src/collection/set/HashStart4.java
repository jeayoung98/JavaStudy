package collection.set;

import java.util.Arrays;

public class HashStart4 {
    static final int CAPACITY = 10;

    public static void main(String[] args) {
        // {1, 2, 5, 8, 14, 99}
        System.out.println("hashIndex(1) = " + hashIndex(1));
        System.out.println("hashIndex(2) = " + hashIndex(2));
        System.out.println("hashIndex(5) = " + hashIndex(5));
        System.out.println("hashIndex(8) = " + hashIndex(8));
        System.out.println("hashIndex(14) = " + hashIndex(14));
        System.out.println("hashIndex(99) = " + hashIndex(99));

        Integer[] inputArray = new Integer[CAPACITY];
        add(inputArray,hashIndex(1));
        add(inputArray,hashIndex(2));
        add(inputArray,hashIndex(5));
        add(inputArray,hashIndex(8));
        add(inputArray,hashIndex(14));
        add(inputArray,hashIndex(99));
        System.out.println("inputArray = " + Arrays.toString(inputArray));
    }

    private static void add(Integer[] inputArray,int hashIndex) {
        inputArray[hashIndex] = hashIndex;
    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}

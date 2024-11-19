package collection.set.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetOperationsTest {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));
        Set<Integer> union = new HashSet<>(set1);
        Set<Integer> intersection = new HashSet<>(set1);
        Set<Integer> difference1 = new HashSet<>(set1);
        Set<Integer> difference2 = new HashSet<>(set2);

        System.out.println("합집합");
        union.addAll(set2);
        union.forEach(System.out::println);

        System.out.println("교집합");
        intersection.retainAll(set2);
        intersection.forEach(System.out::println);

        System.out.println("차집합 set1 - set2");
        difference1.removeAll(intersection);
        difference1.forEach(System.out::println);

        System.out.println("차집합 set2 - set1");
        difference2.removeAll(intersection);
        difference2.forEach(System.out::println);



    }
}

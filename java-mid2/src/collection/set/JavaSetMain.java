package collection.set;

import java.util.*;

public class JavaSetMain {
    public static void main(String[] args) {

        run(new HashSet<>());
        run(new LinkedHashSet<>());
        run(new TreeSet<>());
    }

    private static void run(Set<String> set) {
        System.out.println("set.getClass() = " + set.getClass());
        set.add("C");
        set.add("A");
        set.add("D");
        set.add("B");
        set.add("2");
        set.add("1");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
    }
}

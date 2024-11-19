package collection.iterable;

import java.util.*;

public class JavaIterableMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Iterator<Integer> listIterator = list.iterator();
        printAll(listIterator);
        forEach(list);


        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        Iterator<Integer> setIterator = set.iterator();
        printAll(setIterator);
        forEach(set);
    }

    private static void printAll(Iterator<Integer> iterator) {
        System.out.println("iterator = " + iterator.getClass());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void forEach(Iterable<Integer> iterable) {
        System.out.println("iterator = " + iterable.getClass());
        for (Integer integer : iterable) {
            System.out.println(integer);
        }
    }

}

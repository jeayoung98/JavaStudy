package generic.test.ex3;

import java.util.ArrayList;
import java.util.List;

public class Shuttle<T extends BioUnit> {

    private List<T> list = new ArrayList<>();

    public void in(T unit) {
        list.add(unit);
    }

    public void showInfo() {
        list.forEach(System.out::println);
    }
}

package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍", 100);
        Cat cat = new Cat("냥냥", 20);

        AnimalMethod.checkup(dog);
        AnimalMethod.checkup(cat);

        Dog bigger = AnimalMethod.bigger(dog, new Dog("멍멍2", 200));
        System.out.println(bigger);
    }
}

package generic.ex5;

import generic.animal.Cat;
import generic.animal.Dog;

public class WildCardMain1 {
    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.setValue(new Dog("멍멍", 100));

        WildCardEx.printGenericV1(dogBox);

        WildCardEx.printGenericV2(dogBox);

        WildCardEx.printAndReturnGeneric(dogBox);

        catBox.setValue(new Cat("냥냥", 500));

        WildCardEx.printWildCardV1(catBox);

        WildCardEx.printWildCardV2(catBox);

        WildCardEx.printAndReturnWildCard(catBox);
    }
}

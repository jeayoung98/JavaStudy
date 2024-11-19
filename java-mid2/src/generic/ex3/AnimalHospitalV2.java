package generic.ex3;

import generic.animal.Animal;

public class AnimalHospitalV2<T> {

    private T animal;

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        animal.toString();
        animal.equals(null);
        // T의 타입을 메서드를 정의하는 시점에는 알 수 없다. Object 의 기능만 사용
//        System.out.println("동물 이름 : " + animal.getName());
//        System.out.println("동물 크기 : " + animal.getSize());
//        animal.sound();
    }

    public T bigger(Animal target) {
//        return animal.getSize() > target.getSize() ? animal : target;
        return null;
    }
}


package generic.ex3;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV3 {
    public static void main(String[] args) {
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();

        Dog dog = new Dog("멍멍1", 100);
        Cat cat = new Cat("냥냥1", 500);

        // 개 병원
        dogHospital.setAnimal(dog);
        dogHospital.checkup();

        // 고양이 병원
        catHospital.setAnimal(cat);
        catHospital.checkup();

        // 문제 1 : 개 병원에 고양이 전달
//        dogHospital.setAnimal(cat); // 다른 타입 입력 : 컴파일 오류

        // 문제 2 : 개 타입 반환
        dogHospital.setAnimal(dog);
        Animal biggerDog = dogHospital.bigger(new Dog("멍멍2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}

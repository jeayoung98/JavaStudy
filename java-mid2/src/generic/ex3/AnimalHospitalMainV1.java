package generic.ex3;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV1 {
    public static void main(String[] args) {
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog = new Dog("멍멍1", 100);
        Cat cat = new Cat("냥냥1", 500);

        // 개 병원
        dogHospital.setAnimal(dog);
        dogHospital.checkup();

        // 고양이 병원
        catHospital.setAnimal(cat);
        catHospital.checkup();

        // 문제 1 : 개 병원에 고양이 전달
        dogHospital.setAnimal(cat); // 매개변수 체크 실패 : 컴파일 오류 발생 x

        // 문제 2 : 개 타입 반환
        dogHospital.setAnimal(dog);
        Animal biggerDog = dogHospital.bigger(new Dog("멍멍2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}

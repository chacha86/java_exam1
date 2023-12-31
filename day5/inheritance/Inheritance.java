package day5.inheritance;

// 상속
public class Inheritance {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.bark();

        Cat c1 = new Cat();
        c1.meow();
        d1.move();


        // 클래스 단위에서 중복이 발생.
        // 상속
        // 고양이, 개 -> 포유류, 동물, 생물
    }
}

class Animal {

    public void breathe() {
        System.out.println("숨쉬다!!!");
    }

    public void move() {
        System.out.println("움직이다.");
    }

}

class Dog extends Animal {
    int age;
    String kind;

    public void bark() {
        System.out.println("멍멍");
    }
}

class Cat extends Animal {
    int age;
    String kind;

    public void meow() {
        System.out.println("야옹");
    }

}


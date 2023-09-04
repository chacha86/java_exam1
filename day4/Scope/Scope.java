package day4.Scope;

public class Scope {
    public static void main(String[] args) {
        System.out.println(Person.avgAge);
//        System.out.println(Person.age); // 객체를 만들지 않았기 때문

        Person p1 = new Person();
        System.out.println(p1.age);
        Person.hi(); // 안녕

        자동차.달리다();
    }

}

class 자동차 {
    public static void 달리다() {
        System.out.println("자동차가 달립니다.");
    }
}

class Person {
    static int avgAge = 100; // 클래스 변수
    int age = 30; //인스턴스 변수

    public static void hi() {
        System.out.println("안녕");
    }
}

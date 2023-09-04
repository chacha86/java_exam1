package day4;

public class Clazz {
    public static void main(String[] args) {
        // 1. 클래스가 함수를 모아놓는 느낌
        // 2. 변수를 모아놓는 느낌

        // 변수
        // 사람 표현 -> 이름, 나이, 거주지

        String name = "홍길동";
        String home = "대전";
        int age = 20;

        String name2 = "이순신";
        String home2 = "서울";
        int age2 = 40;

        System.out.printf("%d살 %s사는 %s입니다\n", age, home2, name);
        System.out.printf("%d살 %s사는 %s입니다\n", age2, home2, name2);


        // 배열 나이
        // 175, 60, 22

        int[] person1 = {175, 60, 22};
        int[] person2 = {185, 70, 32};

        System.out.printf("키 : %d, 몸무게 : %d, 나이 : %d\n", person1[0], person1[1], person1[2]);

        // 배열을 사용하면-> 같은 자료형 표현가능. 0번째, 1번째.. 각각 무엇을 가리키는지 알기가 어렵다.


        // 객체 -> 관련된 데이터를 묶는다.
        // int - 4
        // String - 8
        //        int[] arr = {20, "대전", "홍길동"};
        //        {170, 67, "이순신"};
        //        {170, "이순신", 67};

        //        int[] arr = new int[3];
        //
        //        arr[0] = 20;
        //        arr[1] = "대전";
        //        arr[2] = "홍길동";

        // 키, 몸무게,
        day4.sol1.Person arr = new day4.sol1.Person();

        arr.age = 20;
        arr.home = "대전";
        arr.name = "홍길동";

        day4.sol1.Person arr2 = new day4.sol1.Person();

        arr2.age = 30;
        arr2.home = "서울";
        arr2.name = "이순신";

        // 중복
//        System.out.printf("안녕하세요 %d살 %s사는 %s입니다.\n", arr.age, arr.home, arr.name);
//        System.out.printf("안녕하세요 %d살 %s사는 %s입니다.\n", arr2.age, arr2.home, arr2.name);

        arr.introduce();
        arr2.introduce();



    }

    // 함수 -> 같은 클래슨 내의 함수끼리는 서로 호출(사용) 가능
//    public static void introduce(Person arr) {
//        System.out.printf("안녕하세요!!! %d살 %s사는 %s입니다.\n", arr.age, arr.home, arr.name);
//    }
}

// 컴퓨터한테 내가 생각한 어떤 개념 -> 컴퓨터한테 알려줘야 함


// 클래스는 기본적으로 클래스 밖에 만든다.
// 클래스의 본질 -> 관련된 데이터의 묶음 + 해당 데이터를 사용하는 함수
// 인스턴스(복사본, 객체)를 사용하려면 static이 있어서는 안된다.
// 클래스는 현실세계의 개념및 사물과 1:1 맵핑
class Person {
    int age;
    String name;
    String home;

    public void introduce() {
        System.out.printf("안녕하세요!!! %d살 %s사는 %s입니다.\n", age, home, name);
    }
}

class Cat {
    int age;
    String kind;
    String name;
    String color;

    public void meow() {
        System.out.printf("%s 고양이가 야옹 하고 웁니다.", color);
    }
}

class Computer {
    double cpu;
    int ram;
    int ssd;

    public void poweron() {
        System.out.println("컴퓨터 전원이 켜집니다.");
    }
    public void poweroff() {
        System.out.println("컴퓨터 전원이 꺼집니다.");
    }

    public void boosting() {
        cpu++;
    }

}
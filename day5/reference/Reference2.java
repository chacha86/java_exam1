package day5.reference;

public class Reference2 {
    public static void main(String[] args) {
        Person p1; // 무슨 의미? 사람이 한명 있다.(X)
        // p1은 null이다.


        p1 = new Person(); // 사람 한명 생성해서 사람 리모컨을 p1에 저장
        Person p2 = new Person(); // 사람 한명 생성해서 사람 리모컨을 p2에 저장

        p1.age = 20;
        p1.name = "홍길동";

        p2.age = 30;
        p2.name = "이순신";

        p1.introduce();
        p2.introduce();

        // num1, num2는 원본이고, p1, p2는 참조(reference)다

        int num1 = 10;
        int num2 = num1;

        num2 = 20; // num2에 20 대입, 그렇다고 num1이 20으로 바뀌진 않는다.

        p1 = p2; // p1이 p2를 가리킨다.
        p1.name = "임꺽정";

        System.out.println(p1.name);
        System.out.println(p2.name);








    }
}

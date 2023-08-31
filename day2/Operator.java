package day2;

public class Operator {
    public static void main(String[] args) {

        // 산술연산자
        System.out.println(10 + 20);
        System.out.println(10 - 20);
        System.out.println(10 * 20);

        // 나누기 할 때 -> 정수 / 정수 = 정수
        // 컴퓨터는 정수끼리, 실수끼리 계산 가능(1, 1.0은 완전 다른 수)
        // 정수 - int, 실수 - double
        System.out.println(10 / 20);
        System.out.println(1.0 / 2.0);

        int a = 10;
        double b = 10.0;
        String c = "홍길동";

        // 나머지 구하기
        // 배수, 짝수 구할 때 사용, 주기 표현
        System.out.println(10 % 3);


        // 비교 연산자
        System.out.println(10 > 5); // 네
        System.out.println(10 < 5); // 아니오
        System.out.println(10 >= 5); // 네+
        System.out.println(10 <= 5); // 아니오
        System.out.println(10 == 5); // 아니오
        System.out.println(10 != 5); // 네

        // 비교연산자의 결과는 논리값(맞다/틀리다)
        // 논리값 -> boolean

        System.out.println(10);
        System.out.println("10");

        System.out.println("true");
        System.out.println(true);

        boolean d = true;
        boolean e = false;

    }
}

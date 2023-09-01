package day3;

public class Function {

    // 함수 정의
    // void - 리턴타입
    // test - 함수명
    // () - 매개변수
    public static void test() {
        System.out.println("코드1");
        System.out.println("코드2");
        System.out.println("코드3");
        System.out.println("코드4");

        return;
        // 함수가 끝나면 호출한 부분으로 리턴한다.
    }

    public static void plus(int num1, int num2, int num3) { // 매개변수

        int result = num1 + num2 + num3;

        System.out.println(result);
    }

    // main 함수 - 프로그램의 시작이자 끝
    public static void main(String[] args) {  // 시작

        System.out.println("main 함수 시작");
        // 함수


        // 함수
        // 1. 함수는 코드 저장소
        // 2. 함수는 '입력 - 처리 - 출력' 으로 이루어진다.
        // 3. 함수 규칙
        //    - 규칙1. 함수는 클래스 안에서 정의해야 한다.(함수 안에 함수 정의 X)
        //    - 규칙2. 리턴타입, 함수명, 매개변수를 지정해야한다.
        //    - 규칙3. 같은 이름의 함수를 2개 이상 만들지 않는다.
        //    - 규칙4. 함수는 호출(사용) 해야만 실행된다.
        //    - 규칙5. 함수의 개수는 제한이 없음

        // 3. 함수의 가장 큰 사용 목적 -> 코드의 재사용
//        test();  // 함수 호출(사용)
//        System.out.println("another code1");
//        test();
//        System.out.println("another code2");
//        test();
//        System.out.println("another code3");

        // 함수의 확장 -> 매개변수와 인자
        // 함수가 호출 될 때마다 원하는 값을 함수에 전달할 수 있다(인자)
        // 같은 함수를 여러 방식으로 사용할 수 있음
        plus(10, 20, 30); // 30

        plus(100, 200, 300); // 300


        System.out.println("main 함수 끝");
    } // 끝
}

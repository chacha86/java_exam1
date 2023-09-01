package day3;

public class LoopSolve {
    public static void main(String[] args) {


        // 같은 거에서 다른 점을 찾는다.
        // 달라지는 곳에 규칙이 있는지 확인
        // step 1
        for (int i = 1; i < 10; i++) {
            System.out.println("2 X " + i + " = " + 2 * i);
        }

        // step 2
        // 2단 ~ 9단
        for (int j = 2; j < 10; j++) {
            for (int i = 1; i < 10; i++) {
                System.out.println(j + " X " + i + " = " + j * i);
            }
        }

        // step 3
        // 짝수단, 홀수단, 짝수곱, 홀수곱 등을 표현할 수 있다.
        // 짝수곱만 출력
        // 홀수단만 출력
        for (int j = 2; j < 10; j++) { // 단
            if(j % 2 != 0) {
                for (int i = 1; i < 10; i++) { // 곱
                    if (i % 2 == 0) {
                        System.out.println(j + " X " + i + " = " + j * i);
                    }
                }
            }
        }


        /*  입출력 예시
        n은 4, m은 20, limit는 10

        5 * 2 = 10
        5 * 4 = 20
        5 * 6 = 30
        5 * 8 = 40
        5 * 10 = 50

        7 * 2 = 14
        7 * 4 = 28
        7 * 6 = 42
        7 * 8 = 56
        7 * 10 = 70
        ...
        ...
        19 * 2 = 38
        19 * 4 = 76
        19 * 6 = 114
        19 * 8 = 152
        19 * 10 = 190


        */

        int n = 10;
        int m = 30;
        int limit = 5;

        for (int j = n; j <= m; j++) { // 단
            if(j % 2 != 0) {
                for (int i = 1; i <= limit; i++) { // 곱
                    if (i % 2 == 0) {
                        System.out.println(j + " X " + i + " = " + j * i);
                    }
                }
            }
        }
    }
}

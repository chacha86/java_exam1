package day2;

public class Loop {
    public static void main(String[] args) {

        // 반복문 -> 첫번째 벽

        // while, for

        // while

        int i = 0;

        while(i < 3) { // i가 3보다 작으면 계속 반복
            System.out.println("안녕");
            i++;
        }

        // for -> while의 가로 버전
        for(int j = 0; j < 3; j++) {
            System.out.println("안녕");
        }
    }
}

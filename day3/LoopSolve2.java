package day3;

public class LoopSolve2 {
    public static void main(String[] args) {

        int y = 7;
        int lineNum = 1;

        for(int j = 1; j < y*2; j += 2) {

            // 공백 그리기
            for(int i = 0; i < y - lineNum; i++) {
                System.out.print(" ");
            }

            // 별 그리기
            for(int i = 0; i        < j; i++) {
                System.out.print("*");
            }
            System.out.println(); // 줄바꿈
            lineNum++;
        }

        // 공백의 개수 -> 높이 - line 번호
        // 3 - 1
        // 3 - 2
        // 3 - 3
        // 출력
        /*


           *
          ***
         *****


         */

        y = 5;

        // 5 - 1
        // 5 - 2
        // 5 - 3
        // 5 - 4
        // 5 - 5
        // 출력
        /*


             *
            ***
           *****
          *******
         *********


         */

        y = 7;
        // 출력
        /*


               *
              ***
             *****
            *******
           *********
          ***********
         *************


         */
    }
}

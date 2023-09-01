package day3;

public class Array2 {
    public static void main(String[] args) {

        // 2차원 배열 -> 배열의 배열

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8};
        int[] arr3 = {9, 10, 11, 12};

        int[][] darr = {arr1, arr2, arr3};
        int[] arr4 = darr[0];

        System.out.println(darr[0][0]); //System.out.println(arr4[0]); 과 같은 의미
        System.out.println(darr[0][1]);
        System.out.println(darr[1][3]);

        // 이차원배열은 표(행렬)로 생각하면 편하다
        // 이차원배열[세로][가로]
        // 이차원배열[행][열]

        // 2차원 배열 선언
        int[][] darr2 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        System.out.println(darr2[1][2]); // 2차원 배열의 2행 3열의 값에 접근

        System.out.println("============2차원 배열 순회 ===========");

        for (int j = 0; j < 3; j++) { // 행을 순회하는 반복문
            for (int i = 0; i < 4; i++) { // 현재 행의 열을 순회하는 반복문
                System.out.print(darr[j][i] + " ");
            }
            System.out.println();
        }

    }
}

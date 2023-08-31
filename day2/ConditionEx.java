package day2;

public class ConditionEx {
    public static void main(String[] args) {

        // 조건문 -> 택일구조

        // 양자택일(이지선다)
        // 남녀, 할인대상, 홀짝,
        boolean isMale = true;

        if (isMale) {
            System.out.println("남자");
        } else {
            System.out.println("여자");
        }


        // 삼자택일(삼지선다)
        // 초중고, 직좌우,
        int age2 = 10;
        if (age2 >= 8 && age2 <= 13) {
                System.out.println("초등학교"); // 8 ~ 13
        }
        else
        if (age2 <= 16) {
            System.out.println("중학교"); // 14 ~ 16
        }
        else
        if (age2 <= 19) {
            System.out.println("고등학교"); // 17 ~ 19
        }

        // 오자택일(사지선다)
        // 대학성적(A,B,C,D,F)
        // 점수가 90 ~ 100 -> A
        // 80 ~ 89 -> B
        // 70 ~ 79 -> C
        // 60 ~ 69 -> D
        // 60 미만 -> F



    }
}

package day2;

public class Condition {
    public static void main(String[] args) {
        // 조건문

        // 실행이 될 수도 있고 안될 수도 있는

        System.out.println("창문 닫기");


        // 비가 올 때만 창문을 닫기 ->
        boolean isRain = false;

        if (isRain) {
            System.out.println("창문 닫기2");
        }

        // 야식
        int money = 0;
        // 소지금이 20000원 이상일 때
        if (money >= 20000) {
            System.out.println("치킨");
        }

        // 소지금이 20000원 미만, 2000원 이상일 때
        // 논리 연산자 사용 X
        // if는 조건 하나당 if 하나
        if (money < 20000) {
            if (money >= 2000) {
                System.out.println("포카칩");
            }
        }



        // 할인대상 -> 19세 이하, 60세 이상 할인 대상
        int age = 11;
        if (age <= 19) {
            System.out.println("할인대상!!");
        }

        if(age >= 60) {
            System.out.println("할인대상!!");
        }


        // 논리 연산자를 사용한 버전
        if(money < 20000 && money >= 2000) {
            System.out.println("포카칩");
        }

        if(age <= 19 || age >= 60) {
            System.out.println("할인대상!!");
        }


    }
}

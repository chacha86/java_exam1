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
        int money = 15000;
        // 소지금이 20000원 이상일 때
        if (money >= 20000) {
            System.out.println("치킨");
        }

        // 소지금이 20000원 미만일 때
        if (money < 20000) {
            System.out.println("포카칩");
        }

    }
}

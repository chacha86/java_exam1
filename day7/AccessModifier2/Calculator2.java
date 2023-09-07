package day7.AccessModifier2;

public class Calculator2 {
    int num1 = 10;
    int num2 = 20;

    int plus() { // 접근제어자 default. 같은 폴더 내에서만 접근 가능하다.
        return num1 + num2;
    }
}

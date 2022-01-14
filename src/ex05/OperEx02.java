package ex05;

public class OperEx02 {
    public static void main(String[] args) {
        System.out.println(1 == 1);
        // System.out.println(1 = 1); 이건 대입 연산임 오류 !
        System.out.println(!true);
        System.out.println(!(1 == 1)); // 괄호는 우선순위를 지정할 수 있음

        System.out.println(1 != 1); // 같지 않나요?
        System.out.println(1 < 2);
        System.out.println(1 > 2);
    }
}

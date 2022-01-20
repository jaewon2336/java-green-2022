package ex06;

import java.util.Scanner;

public class Programming09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("연산기호를 입력하세요 : ");
        String operator = scan.next();

        System.out.print("연산을 진행할 두 숫자를 입력하세요 : ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        if (operator.equals("+")) {
            System.out.println(num1 + num2);
        } else if (operator == "-") {
            System.out.println(num1 - num2);
        } else if (operator == "*") {
            System.out.println(num1 * num2);
        } else if (operator == "/") {
            if (num2 == 0) {
                System.out.println("분모가 0입니다.");
            } else {
                System.out.println(num1 / num2);
            }
        } else {
            System.out.println("잘못된 기호를 입력하셨습니다.");
        }
    }
}
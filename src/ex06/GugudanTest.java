package ex06;

import java.util.Scanner;

public class GugudanTest {
    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 0;
        System.out.println("출력할 구구단의 범위를 입력하시오.");

        Scanner sc = new Scanner(System.in);

        num1 = sc.nextInt();
        num2 = sc.nextInt();

        for (int step = num1; step <= num2; step++) {
            for (int n = 1; n < 10; n++) {
                System.out.println(step + " * " + n + " = " + step * n);
            }
            System.out.println("");
        }
    }
}

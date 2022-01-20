package ex06;

import java.util.Scanner;

public class Programming03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("사용자의 키를 입력하세요 : ");
        double height = scan.nextDouble();
        double weight = 45.0;

        double standardWeight = (height - 100) * 0.9;

        if (weight > standardWeight) {
            System.out.println("과체중입니다.");
        } else if (weight == standardWeight) {
            System.out.println("표준체중입니다.");
        } else {
            System.out.println("저체중입니다.");
        }

    }
}

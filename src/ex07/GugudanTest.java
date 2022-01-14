package ex07;

import java.util.Scanner;

public class GugudanTest {

    void Gu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력하세요");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        for (int step = n1; step <= n2; step++) {
            for (int n = 1; n <= 9; n++) {
                System.out.println(step + "*" + n + "=" + (step * n));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        GugudanTest gu = new GugudanTest();
        gu.Gu();

    }// 메인 끝
}
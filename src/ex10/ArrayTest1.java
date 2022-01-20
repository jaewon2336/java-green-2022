package ex10;

import java.util.Scanner;

public class ArrayTest1 {
    public static void main(String[] args) {
        final int STUDENTS = 5; // final은 변수를 상수로 지정하는 키워드, 값을 초기화하면 변경이 불가능하다.
        int total = 0;
        Scanner scan = new Scanner(System.in);
        int[] scores = new int[STUDENTS];

        for (int i = 0; i < STUDENTS; i++) { // 크기가 STUDENT인 배열 생성
            System.out.println("성적을 입력하시오 : ");
            scores[i] = scan.nextInt(); // i번째 원소에 성적을 저장
        }

        for (int i = 0; i < STUDENTS; i++) {
            total += scores[i];
        }

        System.out.println("평균 성적은 : " + total / STUDENTS + "입니다.");

    }
}

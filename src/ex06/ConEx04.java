package ex06;

public class ConEx04 {
    public static void main(String[] args) {
        int point = 81;

        if (point >= 90) {
            System.out.println("A학점 입니다.");
        } else if (point >= 80) { // point가 80 ~ 89 사이라면?
            System.out.println("B학점 입니다.");
        } else if (point >= 70) {
            System.out.println("C학점 입니다.");
        } else if (point >= 60) {
            System.out.println("D학점 입니다.");
        } else {
            System.out.println("F학점 입니다.");
        }
    } // main 끝
}

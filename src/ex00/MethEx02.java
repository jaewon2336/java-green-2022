package ex00;

class Cal {

    // 투입구, 출구 다 있는 메서드
    static int add(int a1, int a2) {
        return a1 + a2;
    }

    static int multi(int a1, int a2) {
        return a1 * a2;
    }
}

public class MethEx02 {
    public static void main(String[] args) {

        // 메서드 호출
        int r1 = Cal.add(20, 50); // return값을 받을 변수 r1 초기화
        System.out.println(r1);
        int r2 = Cal.multi(r1, 10);
        System.out.println(r2);
    }
}
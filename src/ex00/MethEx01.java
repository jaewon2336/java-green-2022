package ex00;

// 계산기 클래스
// 상태와 행위는 꼭 필요한 것은 아니다.
class Calculator {

    // add 뒤에 있는 ()는 입구, 입구는 무조건 있어야함
    // void는 출구가 없다.
    void add(int n1, int n2) { // 입구만 있는 메서드, 돈 먹은 자판기
        System.out.println("더하기 메서드입니다.");
        System.out.println(n1 + n2);
    }

    // minus
    // add와 minus 메서드의 stack 공간이 다르기 때문에
    // add와 minus의 n1, n2는 다른공간
    void minus(int n1, int n2) {
        System.out.println("빼기 메서드입니다.");
        System.out.println(n1 - n2);
    }

    // multi (곱하기)
    void multi(int n1, int n2) {
        System.out.println("곱하기 메서드입니다.");
        System.out.println(n1 * n2);
    }

    // divide (나누기)
    void divide(int n1, int n2) {
        System.out.println("나누기 메서드입니다.");
        System.out.println(n1 / n2);
    }
}

public class MethEx01 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.add(3, 5);
        c1.minus(3, 5);
        c1.multi(3, 5);
        c1.divide(3, 5);
    }
}

package ex05;

public class VarEx04 {
    public static void main(String[] args) {
        // 1. 4가지 자료형 int, double, long, boolean (미리 메모리에 사이즈 확보 가능)
        // 2. 문자열 : 사이즈를 알 수 없다. 자료형이 아님 (미리 메모리에 사이즈 확보 불가능)
        String s1 = "안녕하세요";
        System.out.println(s1);
        String s2 = s1; // 주소가 저장된다.
        s2 = "바보";
        System.out.println(s1);
        System.out.println(s2);
    }
}

package ex20;

public class LibEx01 {
    public static void main(String[] args) {
        double num = 10.5;
        double result = Math.abs(-10.0);
        double result2 = Math.ceil(num);
        System.out.println(result);
        System.out.println(result2);

        System.out.println("------------");
        // round 반올림, return 타입 long(8Byte 정수)
        double a = 1234.56789;
        System.out.println(Math.round(a));
    }
}

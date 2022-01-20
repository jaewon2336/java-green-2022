package ex20;

public class MathTest {
    public static void main(String[] args) {
        double x = Math.PI;
        double y = Math.E;

        System.out.println(Math.abs(x)); // 절대값
        System.out.println(Math.acos(x)); // arc 코사인
        System.out.println(Math.asin(x)); // arc 사인
        System.out.println(Math.atan(x)); // arc 탄젠트
        System.out.println(Math.atan2(x, y)); // 직표 좌표계(x, y)를 극좌표계(r, theta)로 변환할 때 theta를 반환
        System.out.println(Math.cos(x)); // cosine
        System.out.println(Math.cosh(x)); // hyperbolic cosine
        System.out.println(Math.exp(x)); // e^x
        System.out.println(Math.hypot(x, y)); // sqrt(x^2 + y^2)
        System.out.println(Math.log(x)); // natural logarithm (base e)
        System.out.println(Math.log10(x)); // base 10 logarithm
        System.out.println(Math.max(x, y)); // 큰 수
        System.out.println(Math.min(x, y)); // 작은 수
        System.out.println(Math.pow(x, y)); // x^y
        System.out.println(Math.random()); // 0.0과 1.0사이 난수를 반환
        System.out.println(Math.sin(x)); // sine
        System.out.println(Math.sinh(x)); // hyperbolic sine
        System.out.println(Math.sqrt(x)); // 제곱근
        System.out.println(Math.tan(x)); // tangent
        System.out.println(Math.tanh(x)); // hyperbolic tangent
        System.out.println(Math.toDegrees(x)); // 라디안을 디그리로 변환
        System.out.println(Math.toRadians(x)); // 디그리를 라디안으로 변환
    }
}

package ex06;

public class GugudanEx03 {
    public static void main(String[] args) {
        int step;

        // 2단 출력하는 프로그램을 만들어주세요.
        for (step = 2; step <= 9; step++) {
            for (int i = 1; i <= 9; i++) {
                System.out.println(step + " * " + i + " = " + (step * i));
            }
            System.out.println("---------------------------");
        }
    }
}

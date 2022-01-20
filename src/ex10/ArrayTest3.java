package ex10;

public class ArrayTest3 {
    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30 };
        for (int value : numbers) { // value에는 첫번째 원소부터 마지막 배열 원소까지 차례대로 대입된다.
            System.out.println(value);
        }
    }
}

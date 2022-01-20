package ex10;

public class ArrayTest2 {
    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30 }; // new를 사용하지 않아도 초기값 개수만큼의 배열이 자동적으로 생성된다.
        for (int i = 0; i < numbers.length; i++) { // 각 배열은 length라는 필드를 가지고 있다. 배열의 크기를 나타낸다.
            System.out.println(numbers[i]);
        }
    }
}

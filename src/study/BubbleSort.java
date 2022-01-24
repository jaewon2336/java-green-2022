package study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSort {
    public static void main(String[] args) {
        // 1. 리스트 만들기
        // 2. 리스트 원소 비교하기
        // 3. 밀접한 원소들을 비교해서 자리바꾸기(1회전)
        // 4. 오름차순으로 정렬될까지 회전
        // 5. 패턴 찾아서 for문 만들기

        // 6. 1회전 수행할 때마다 정렬에서 제외되는 데이터가 하나씩 늘어난다. 어떻게 하징..

        List<Integer> array = Arrays.asList(7, 4, 5, 1, 3);
        // System.out.println(array.get(0));
        // System.out.println(array.get(1));
        // System.out.println(array.get(2));
        // System.out.println(array.get(3));
        // System.out.println(array.get(4));

        int temp;

        // // 1회전(교환 4번)

        // if (array.get(0) > array.get(1)) {
        // temp = array.get(0);
        // array.set(0, array.get(1));
        // array.set(1, temp);
        // }

        // if (array.get(1) > array.get(2)) {
        // temp = array.get(1);
        // array.set(1, array.get(2));
        // array.set(2, temp);
        // }

        // if (array.get(2) > array.get(3)) {
        // temp = array.get(2);
        // array.set(2, array.get(3));
        // array.set(3, temp);
        // }

        // if (array.get(3) > array.get(4)) {
        // temp = array.get(3);
        // array.set(3, array.get(4));
        // array.set(4, temp);
        // }

        // // 2회전(교환 2번)

        // if (array.get(0) > array.get(1)) {
        // temp = array.get(0);
        // array.set(0, array.get(1));
        // array.set(1, temp);
        // }

        // if (array.get(1) > array.get(2)) {
        // temp = array.get(1);
        // array.set(1, array.get(2));
        // array.set(2, temp);
        // }

        // if (array.get(2) > array.get(3)) {
        // temp = array.get(2);
        // array.set(2, array.get(3));
        // array.set(3, temp);
        // }

        // // 3회전(교환2번)

        // if (array.get(0) > array.get(1)) {
        // temp = array.get(0);
        // array.set(0, array.get(1));
        // array.set(1, temp);
        // }

        // if (array.get(1) > array.get(2)) {
        // temp = array.get(1);
        // array.set(1, array.get(2));
        // array.set(2, temp);
        // }

        // // 4회전(교환X)
        // if (array.get(0) > array.get(1)) {
        // temp = array.get(0);
        // array.set(0, array.get(1));
        // array.set(1, temp);
        // }

        for (int i = 0; i < array.size(); i++) { // 총 회전수 구하기

            int countChild = 0; // 원소 비교횟수

            for (int j = 0; j < array.size() - 1; j++) { // 1회전 하는동안 비교하는 반복문

                if (array.get(j) > array.get(j + 1)) { // 원소 비교하기 조건문 (1바퀴)

                    temp = array.get(j);
                    array.set(j, array.get(j + 1));
                    array.set(j + 1, temp);

                    countChild++; // 4번 -> 2번 -> 2번 -> 0번
                }
            }
            System.out.println((i + 1) + "번째 회전에 교환 " + countChild + "번");
        }
        // }

        System.out.println();

        System.out.println(array.get(0));
        System.out.println(array.get(1));
        System.out.println(array.get(2));
        System.out.println(array.get(3));
        System.out.println(array.get(4));
    }
}

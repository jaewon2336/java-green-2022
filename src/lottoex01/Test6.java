package lottoex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test6 {
    public static void main(String[] args) {
        // 6. ArrayList 로또 2개 만들어서 비교해보기
        // Mock
        List<Integer> lotto1 = Arrays.asList(1,3,5,7,9,10);
        List<Integer> lotto2 = new ArrayList<>();;

        lotto2.add(1);
        lotto2.add(3);
        lotto2.add(5);
        lotto2.add(7);
        lotto2.add(9);
        lotto2.add(10);

        // if(lotto1.get(0) == lotto2.get(0)) {
        //     System.out.println("일치");
        // }else {
        //     failCheck++ ;
        // }

        // final이 붙은 상수는 대문자로 정의한다.
        final int LOTTOCYCLE = lotto1.size(); 
        int failCheck = 0;

        // lotto1.size()로 크기를 정하면
        // for문이 돌때마다 메서드가 호출되니까 stack이 증가되는거임
        for(int i = 0; i < LOTTOCYCLE; i++) {
            if(lotto1.get(i) == lotto2.get(i)) {
                System.out.println((i + 1) + "번째 숫자 일치");
            } else {
                failCheck++;
            }
        }

        if(lotto1.equals(lotto2)) {
            System.out.println("로또당첨");
        } else {
            System.out.println("탈락");
        }
        System.out.println("틀린 갯수 : " + failCheck);

        // 검증
        if(failCheck == 0) {
            System.out.println("테스트 성공");
        } else {
            System.out.println("테스트 실패");
        }
    }
}

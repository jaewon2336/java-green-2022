package ex22;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class CollectionEx03 {
    public static void main(String[] args) {
        // 문제
        
        /* Random r = new Random();
        // 1부터 45까지 중에 랜덤숫자(끝숫자 포함x)
        // 로또번호 1~45 6개 뽑기
        // HashSet에 n값을 add해서 저장
        // HashSet 데이터 크기가 6이되면 break
        // 중복되는 값이 있으면 저장을 안하기 때문에 끝이없음 -> while
        while(true) {
            int n = r.nextInt(45) + 1;   // 매개변수에 범위 넣기
            System.out.println(n);
        }   // 이건 중복되는 값이 나옴
*/

        // HashSet으로 로또번호 중복없이
        /* Random rand = new Random();
        Set<Integer> lotto = new HashSet<>();

        while(true) {
            lotto.add(rand.nextInt(45) + 1);
            if(lotto.size() == 6) {
                break;
            }
        }
        System.out.println(lotto); */

        // ArrayList로 로또번호 중복없이
        List<Integer> lotto = new ArrayList<Integer>();
        Random random = new Random();
        


    }
}

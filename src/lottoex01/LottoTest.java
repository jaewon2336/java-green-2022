package lottoex01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class LottoTest {
    public static void main(String[] args) {

        // 1. ArrayList에 숫자 6개 담기(Mock 모조품, 테스트용)
        // 로또 정답 번호
        ArrayList<Integer> lottoCorrect = new ArrayList<>();
        lottoCorrect.add(10);
        lottoCorrect.add(15);
        lottoCorrect.add(20);
        lottoCorrect.add(25);
        lottoCorrect.add(30);
        lottoCorrect.add(35);

        // 2. Scanner로 금액 입력받아서 횟수 정하기 ex) 5000 -> 5회)
        Scanner scan = new Scanner(System.in);
        // 돈을 넣는 변수는 long을 사용하자
        long money = scan.nextLong();
        // 명시적 형변환 = 다운 캐스팅
        int count = (int) money / 1000;

        System.out.println(money + "원 입력하셨습니다.");
        System.out.println(count + "회 로또 번호 출력합니다.");
        System.out.println();

        // 5. 로또 세트(HashSet) count개를 ArrayList에 담기

        ArrayList<List<Integer>> lottoList = new ArrayList<>();

        for (int i = 0; i < count; i++) {

            // 3. HashSet으로 랜덤한 로또 번호 받기
            Set<Integer> lotto = new HashSet<>();

            // HashSet은 중복이 발생하면 한바퀴 더 돌기때문에 while 이용
            // Set 자료구조는 중복되는 데이터가 들어가면 허용하지 않음

            while (true) {
                Random rand = new Random();
                int n = rand.nextInt(45) + 1; // (0~44 + 1) 1~45까지 랜덤한 숫자

                lotto.add(n);
                // 한줄 코드는 중괄호 생략 가능 if 에서만
                if (lotto.size() == 6) {
                    break;
                }
            }

            // 4. HashSet은 순서를 보장하지 않고 데이터를 가지기 때문에 순차 정렬이 필요 (구글링)
            // Mock

            // Test
            List<Integer> lottoSort = new ArrayList<>(lotto);
            Collections.sort(lottoSort);

            lottoList.add(lottoSort);

            final int LOTTOCYCLE = 6;

            for (int j = 0; j < LOTTOCYCLE; j++) {
                if (lottoCorrect.get(j) == lottoSort.get(0)) {
                    System.out.println((j + 1) + "번째 숫자 일치");
                } else {
                    break;
                }
            }

            if (lottoCorrect.equals(lottoSort)) {
                System.out.println("당첨 번호");

                for (int a = 0; a < LOTTOCYCLE; a++) {
                    System.out.print(lottoCorrect.get(a) + " ");
                }

                System.out.println();

                for (int a = 0; a < LOTTOCYCLE; a++) {
                    System.out.print(lottoSort.get(a) + " ");
                }

                System.out.println();
                System.out.println("로또 당첨!!");
                System.out.println();
            } else {
                System.out.println("당첨 번호");

                for (int a = 0; a < LOTTOCYCLE; a++) {
                    System.out.print(lottoCorrect.get(a) + " ");
                }

                System.out.println();

                for (int a = 0; a < LOTTOCYCLE; a++) {
                    System.out.print(lottoSort.get(a) + " ");
                }

                System.out.println();
                System.out.println("꽝!!!!!!!!!");
                System.out.println();
            }
        }

    }
}

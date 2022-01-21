package lotto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
// import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

// class Challenge {
//     Set<Integer> set;

//     Challenge(Set<Integer> set) {
//         this.set = set;
//     }
// }

public class LottoList {
    public static void main(String[] args) {

        // Scanner scan = new Scanner(System.in); // 사용자에게 금액 입력받기

        Random random = new Random(); // 랜덤숫자 뽑기

        List<Integer> correctNumber = new ArrayList<>(); // 로또 정답 설정
        correctNumber.add(3);
        correctNumber.add(5);
        correctNumber.add(30);
        correctNumber.add(40);
        correctNumber.add(41);
        correctNumber.add(42);

        // int money = scan.nextInt(); // 로또 살 돈 입력받기
        // int times = money / 1000; // 로또 할 횟수
        int times = 5;

        // Set<Integer> lottoNum = new HashSet<>(); // 로또 자동 숫자 6개 저장할 HashSet
        // Set<Integer> lottoNumSort = new TreeSet<>(lottoNum);
        // List<Set<Integer>> lottoList = new ArrayList<>();

        for (int i = 0; i < times; i++) { // times만큼 HashSet 생성

            Set<Integer> lottoNum = new HashSet<>(); // 로또 자동 숫자 6개 저장할 HashSet
            // HashSet 1개(숫자 6개) 저장
            while (true) {

                lottoNum.add(random.nextInt(45) + 1);

                if (lottoNum.size() == 6) {
                    break;
                }
            }
        }
        // HashSet 오름차순 정렬
        // Set<Integer> lottoNumSort = new TreeSet<>(lottoNum);

        // ArrayList에 numberSet 1개씩 저장
        List<Set<Integer>> lottoList = new ArrayList<>();
        //lottoList.add(lottoNumSort);

        // System.out.println(lottoList);
        System.out.println("--------------------------");
        System.out.println(lottoList);
    }
}

package stringex;

import java.util.Scanner;

public class StringEx03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  // 1. scaaner로 문자열 받기

        String inform = scan.nextLine();

        String[] tokens = inform.split("-");    // 2. -로 split

        for (int i = 0; i < tokens.length; i++) {
            System.out.println(tokens[i]);
        }
        
        if(tokens[0].equals("A01")) {  // 3. 첫데이터가 A01이면 파싱 시작
            // 4. 1번지 부터 파싱 시작
            String[] name = tokens[1].split(":");
            System.out.println(name[0]);
            System.out.println(name[1]);
            String[] tel = tokens[2].split(":");
            String[] gender = tokens[3].split(":");
            String[] age = tokens[4].split(":");
            // System.out.println("성공");
        }

        // String m_name = name[1];
        // String m_tel = tel[1];
        // char m_gender = gender[1];
        // int m_age = Integer.parseInt(age[1]);
        // System.out.println(name[0]);

        
        
        
    }
}

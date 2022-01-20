package stringex;

import java.util.Scanner;

class 개인정보 {
    private String name; // 이름
    private String tel; // 전화번호
    private char gender; // 성별
    private int age; // 나이

    public 개인정보(String name, String tel, char gender, int age) {
        this.name = name;
        this.tel = tel;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class StringEx05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // 1. scaaner로 문자열 받기

        String data = scan.nextLine();

        String[] tokens = data.split("-"); // 2. -로 split

        for (int i = 0; i < tokens.length; i++) {
            System.out.println(tokens[i]);
        }

        if (tokens[0].equals("A01")) { // 3. 첫데이터가 A01이면 파싱 시작
            // 4. 1번지 부터 파싱 시작
            String splitName[] = tokens[1].split(":");
            String splitTel[] = tokens[2].split(":");
            String splitGender[] = tokens[3].split(":");
            String splitAge[] = tokens[4].split(":");

            // for(int i = 1; i < tokens.length; i++) {

            // }

            String name = splitName[1];
            String tel = splitTel[1];
            char gender = splitGender[1].charAt(0);
            int age = Integer.parseInt(splitAge[1].trim());

            개인정보 me = new 개인정보(name, tel, gender, age);
            System.out.println("이름 : " + me.getName());
            System.out.println("전화번호 : " + me.getTel());
            System.out.println("성별 : " + me.getGender());
            System.out.println("나이 : " + me.getAge());
        } else {
            System.out.println("프로그램이 종료되었습니다.");
        }
    }
}

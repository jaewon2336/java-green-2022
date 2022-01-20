package stringex;

import java.util.Scanner;

class User {
    private String name;
    private String tel;
    private char gender;
    private int age;

    public User(String name, String tel, char gender, int age) {
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

public class StringEx04 {
    public static void main(String[] args) {
        // System.in = 키보드 연결, System.out = 모니터 연결
        Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt(); // "안녕" -> 런타임오류 numberformat exception
        
        // A01-이름:홍길동-전화번호:0102222-성별:남-나이: 20
        // String data = sc.nextLine();
        String data = "A01-이름:홍길동-전화번호:0102222-성별:남-나이: 20";

        String[] tokens = data.split("-");

        if(tokens[0].equals("A01")) {
            // 1. 이름:홍길동을 ":"으로 구분해서 홍길동을 찾자
            String name = tokens[1].split(":")[1];

            // 2. 전화번호:0102222를 ":"으로 구분해서 0102222를 찾자
            // 전화번호는 0으로 시작하니까 문자열로 받기
            // int로 받으면 102222로 바뀌게됨
            String tel = tokens[2].split(":")[1];

            // 3. 성별:남을 ":"으로 구분해서 남을 찾자
            String genderTemp = tokens[3].split(":")[1];

            // 4. 나이:20을 ":"으로 구분해서 20을 찾자
            String ageTemp = tokens[4].split(":")[1];

            // 5. char로 담고, int로 담고 하는 형변환하기
            // char gender = (char)genderTemp;
            // 명시적 형변환은 기본 자료형일때만 가능
            // String은 기본 자료형이 아니기때문에 오류발생
            // index는 항상 0부터 시작
            char gender = genderTemp.charAt(0);
            int age = Integer.parseInt(ageTemp.trim());

            // 6. 클래스로 옮겨담기
            User user = new User(name, tel, gender, age); // 순서중요, 타입이 다르니까
            // 클래스의 이름을 모두 소문자(파스칼 지키기)로 바꿔 변수이름을 지정하는것이 규칙
            System.out.println("----");
        }else {
            System.out.println("프로그램 종료");
        }
    }
}

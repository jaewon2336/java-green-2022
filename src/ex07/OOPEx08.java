package ex07;

class Person2 {
    String name;
    int height;
    int weight;

    // 생성자가 메서드와 구조는 같지만 메서드는 아님
    // 메서드와 달리 return 타입이 없음
    // 하지만 메서드와 같이 호출받으면 stack과 Queue가 생김
    // 내부적으로 돌아가는 원리는 메서드와 같음
    // 생성자 Constructor
    // 클래스 이름과 동일해야함, 첫글자 대문자, 반환타입 없음
    // 생성자는 내가 만들지 않으면 자동으로 디폴트 생성자가 생긴다
    Person2(String d1, int d2, int d3) {
        // 생성자가 종료되면 stack 메모리에서 날아가니까 heap으로 옮겨줌
        name = d1;
        height = d2;
        weight = d3;
    }
}

public class OOPEx08 {
    public static void main(String[] args) {
        // 객체 만드는 시점에 초기화 가능
        Person2 s1 = new Person2("홍길동", 170, 70);
        Person2 s2 = new Person2("임꺽정", 150, 200);
        // 생성자 호출문∧

        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}

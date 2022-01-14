package ex07;

class Person {
    // 선언만하세요. 절대 초기화 하지 말기 ! 세상에 사람들은 다 다르니까 !
    String name;
    int height;
    int weight;

    // 클래스 설계도에 생성자를 내가 직접 만들지 않으면 항상 디폴트 생성자가 만들어진다.
    // 생성자 형식 : 클래스명() {}
    // 안만들어도 있는 디폴트 생성자 = 객체의 초기화를 위해 필요
    // 생성자를 통해 초기화 하세요(New될때)
    // 객체를 만들때 초기 세팅을 하기위해 필요
    Person() {
        System.out.println("사람이 생성되었습니다");
        name = "홍길동";
        height = 170;
        weight = 70;
    }
}

public class OOPEx07 {
    public static void main(String[] args) {
        Person s1 = new Person();
        System.out.println(s1.name);
    }
}
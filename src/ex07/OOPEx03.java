package ex07;

// 설계도 생성
class 마법사 {
    // 상태
    int hp = 30;
    int mp = 100;

    // 행위 = 메서드
    // 문법 1. 행위안에 행위를 추가할 수 없다.
    // 2. 행위는 메서드 이름 + () + {} 로 만들어진다.
    void drink() {
        System.out.println("에너지 마시기");
        hp = 100;
    }
}

public class OOPEx03 {
    public static void main(String[] args) {
        마법사 p1 = new 마법사();
        System.out.println("첫번째 마법사가 생성되었습니다.");
        System.out.println("체력 : " + p1.hp);
        System.out.println("마나 : " + p1.mp);

        p1.drink(); // 메서드 호출(call)
        System.out.println("체력 변경 : " + p1.hp);

        // 마법 금지 = 상태는 행위를 통해 변경한다. 행위는 클래스가 가지고있음.
        // p1.hp = 50;
        // System.out.println("체력 변경 : " + p1.hp);

        마법사 p2 = new 마법사();
        System.out.println("두번째 마법사가 생성되었습니다.");
        System.out.println("체력 : " + p2.hp);
        System.out.println("마나 : " + p2.mp);
    } // 메인 종료
}

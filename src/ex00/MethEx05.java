package ex00;

// 오버로딩 = over-loading = 과적재

/**
 * 1. 메서드는 동일한 이름으로 만들 수 없다.(기본 문법)
 * 2. 단, 매개변수의 타입이 다르거나, 위치가 다르거나, 개수가 다르면 다른 메서드로 인식
 * 3. 개발자 입장에서 함수이름을 하나만 기억하면 된다.(엄청난 장점!!)
 * 4. 경우의 수가 너무 많아지면 퇴사하고 싶어진다.(오버로딩의 한계..) = 너무 많은 메서드가 필요하다.
 * 5. 어떨 때 사용하면 되냐? 개수가 적을 때! 10~20개안
 * System.out.println() 메서드도 오버로딩 타입이다. 자바의 자료형은 8개니까.
 */

class 사자1 {
    String name = "사자";
    int hp = 100;
    int attack = 10;
}

class 호랑이1 {
    String name = "호랑이";
    int hp = 100;
    int attack = 15;
}

class 곰1 {
    String name = "곰";
    int hp = 100;
    int attack = 50;
}

public class MethEx05 {

    // 사자 -> 호랑이 공격
    static void attack(사자1 unit1, 호랑이1 unit2) {
        System.out.println(unit2.name + "가(이) 공격당하고 있습니다.");
        unit2.hp = unit2.hp - unit1.attack;
        System.out.println(unit2.name + "의 hp : " + unit2.hp);
    }

    // 사자 -> 곰 공격
    static void attack(사자1 unit1, 곰1 unit2) {
        System.out.println(unit2.name + "가(이) 공격당하고 있습니다.");
        unit2.hp = unit2.hp - unit1.attack;
        System.out.println(unit2.name + "의 hp : " + unit2.hp);
    }

    // 호랑이 -> 사자 공격
    static void attack(호랑이1 unit1, 사자1 unit2) {
        System.out.println(unit2.name + "가(이) 공격당하고 있습니다.");
        unit2.hp = unit2.hp - unit1.attack;
        System.out.println(unit2.name + "의 hp : " + unit2.hp);
    }

    // 호랑이 -> 곰 공격
    static void attack(호랑이1 unit1, 곰1 unit2) {
        System.out.println(unit2.name + "가(이) 공격당하고 있습니다.");
        unit2.hp = unit2.hp - unit1.attack;
        System.out.println(unit2.name + "의 hp : " + unit2.hp);
    }

    // 곰 -> 사자 공격
    static void attack(곰1 unit1, 사자1 unit2) {
        System.out.println(unit2.name + "가(이) 공격당하고 있습니다.");
        unit2.hp = unit2.hp - unit1.attack;
        System.out.println(unit2.name + "의 hp : " + unit2.hp);
    }

    // 곰 -> 호랑이 공격
    static void attack(곰1 unit1, 호랑이1 unit2) {
        System.out.println(unit2.name + "가(이) 공격당하고 있습니다.");
        unit2.hp = unit2.hp - unit1.attack;
        System.out.println(unit2.name + "의 hp : " + unit2.hp);
    }

    public static void main(String[] args) {
        사자1 lion1 = new 사자1();
        호랑이1 tiger1 = new 호랑이1();
        곰1 bear1 = new 곰1();

        attack(lion1, tiger1);
        attack(lion1, bear1);
        attack(tiger1, lion1);
        attack(tiger1, bear1);
        attack(bear1, lion1);
        attack(bear1, tiger1);

        System.out.println(1);
        System.out.println(1.0);
        System.out.println(true);
    }

}

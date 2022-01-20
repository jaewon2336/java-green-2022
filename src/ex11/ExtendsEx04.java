package ex11;

/**
 * 신입이 실수하지 않는 설계를 해보자!!
 * 신입이 실수하면 내 책임이니까!!
 */

// abstract class 추상 클래스
// 1. new 할 수 없다.
// 2. 추상 메서드를 만들 수 있다.(객체의 행위를 공통적으로 정의할 수 없을 때)
// 3. 추상 클래스는 일반 메서드도 만들 수 있다.(모든 구체적인 자식들의 공통적인 것)
abstract class ProtossUnit { // 종족 이름
    abstract int getHp();

    abstract int getAttack();

    abstract void setHp(int hp);
}

// 1. 일반 클래스는 추상 메서드를 가질 수 없다.
class Zealot extends ProtossUnit { // 근거리 공격
    // 상태 변수(heap에 저장)
    String name = "질럿"; // 원래는 값을 초기화하지 말고 생성자를 써야함
    int hp = 100;
    int attack = 10;

    @Override
    int getHp() {
        return hp;
    }

    @Override
    int getAttack() {
        return attack;
    }

    @Override
    void setHp(int hp) {
        this.hp = hp;
    }
}

class Dragoon extends ProtossUnit { // 원거리 공격
    String name = "드라군";
    int hp = 100;
    int attack = 20;

    @Override
    int getHp() {
        return hp;
    }

    @Override
    int getAttack() {
        return attack;
    }

    @Override
    void setHp(int hp) {
        this.hp = hp;
    }
}

class DarkTempler extends ProtossUnit {
    String name = "다크템플러";
    int hp = 100;
    int attack = 50;

    @Override
    int getHp() {
        return hp;
    }

    @Override
    int getAttack() {
        return attack;
    }

    @Override
    void setHp(int hp) {
        this.hp = hp;
    }
}

public class ExtendsEx04 {

    static void attack(ProtossUnit u1, ProtossUnit u2) {
        // 1. u1이 u2를 공격 => u2.hp = u2.hp - u1.attack => 자식 변수에 접근 안되는군 => 오버라이드 하자
        u2.setHp(u2.getHp() - u1.getAttack());
        // 2. u2의 hp를 출력 => sysout(u2.hp)
        System.out.println(u2.getHp());
    }

    public static void main(String[] args) {
        ProtossUnit 질럿 = new Zealot();
        ProtossUnit 드라군 = new Dragoon();
        ProtossUnit 다크템플러 = new DarkTempler();

        attack(질럿, 드라군);
        attack(다크템플러, 질럿);
    }
}

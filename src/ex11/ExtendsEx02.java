package ex11;

class 동물 {
    String animalName() {
        return "";
    }

    int animalHp() {
        return 0;
    }

    int animalAttack() {
        return 0;
    }
}

class 사자 extends 동물 {
    String name = "사자";
    int hp = 100;
    int attack = 10;

    String animalName() {
        return name;
    }

    int animalHp() {
        return hp;
    }

    int animalAttack() {
        return attack;
    }
}

class 호랑이 extends 동물 {
    String name = "호랑이";
    int hp = 100;
    int attack = 15;

    String animalName() {
        return name;
    }

    int animalHp() {
        return hp;
    }

    int animalAttack() {
        return attack;
    }
}

class 곰 extends 동물 {
    String name = "곰";
    int hp = 100;
    int attack = 50;

    String animalName() {
        return name;
    }

    int animalHp() {
        return hp;
    }

    int animalAttack() {
        return attack;
    }
}

public class ExtendsEx02 {

    // 오버라이딩 = 무효화 하다 -> 아래로 타고 내려가는 기법
    // 사자 -> 호랑이 공격
    static void attack(동물 u1, 동물 u2) {

        int attackedHp;

        System.out.println(u2.animalName() + "(이)가 공격당하고 있습니다.");
        attackedHp = u2.animalHp() - u1.animalAttack();
        System.out.println(u2.animalName() + "의 hp : " + attackedHp);
    }

    public static void main(String[] args) {
        동물 lion = new 사자();
        동물 tiger = new 호랑이();
        동물 bear = new 곰();

        attack(lion, tiger);
        attack(lion, bear);
        attack(tiger, lion);
        attack(tiger, bear);
        attack(bear, lion);
        attack(bear, tiger);
    }
}

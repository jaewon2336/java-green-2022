package ex11;

class 동물 {
    String name = "동물";
    int hp = 0;
    int attack = 0;
    int attackedHp = 0;

    String animalName() {
        return name;
    }

    int animalHp() {
        return hp;
    }

    int animalAttack() {
        return attack;
    }

    int attackedHp2(int attack) {
        return hp;
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

    int attackedHp2(int attack) {

        hp = hp - this.attack;
        return hp;
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

    int attackedHp2(int attack) {

        hp = hp - this.attack;
        return hp;
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

    int attackedHp2(int attack) {

        hp = hp - this.attack;
        return hp;
    }
}

public class ExtendsEx02 {

    // 오버라이딩 = 무효화 하다 -> 아래로 타고 내려가는 기법
    static void attack(동물 u1, 동물 u2) {

        System.out.println(u2.animalName() + "(이)가 공격당하고 있습니다.");
        System.out.println(u2.animalName() + "의 hp : " + u2.attackedHp2(u1.attack));
    }

    public static void main(String[] args) {
        동물 lion = new 사자();
        동물 tiger = new 호랑이();
        동물 bear = new 곰();

        attack(lion, tiger);
        attack(lion, tiger);
        attack(lion, tiger);
        // attack(lion, bear);
        // attack(tiger, lion);
        // attack(tiger, bear);
        // attack(bear, lion);
        // attack(bear, tiger);
    }
}

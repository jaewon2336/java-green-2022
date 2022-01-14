package ex07;

class Car {
    int speed = 90;
}

public class OOPEx01 {

    public static void main(String[] args) {
        // new는 heap에 할당하라는 키워드
        // Car 클래스가 가지고 있는 static이 아닌 모든 것들이 heap에 뜬다.
        // static은 이미 떠있음.(처음부터 끝까지)
        // heap과 나누는 이유는 내가 원할때 원하는만큼 띄우기 위해
        Car s1 = new Car();
        System.out.println(s1.speed);

        Car s2 = new Car();
        System.out.println(s2.speed);
        // heap에 새로 할당
        // static은 안됨. 하나밖에 못올림
        // class를 붕어빵 틀처럼 변수를 계속 만들수있음
        // s1과 s2는 다른 자동차
    }
}

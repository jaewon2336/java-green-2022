package ex00;

/**
 * 메서드 규칙
 * 1. 투입구와 출구가 있다. 단, 출구는 항상 필요하지는 않다.
 * 2. 메서드는 하나의 모듈(특정한 역할(목적)을 수행하는)이 될 수 있다.
 * 3. 출구가 없을 때 void 사용, 출구가 있을 때는 return값의 타입과 동일하게 해준다.
 * 4. 메서드 내부(Queue)를 몰라도 사용할 수 있다. (캡슐화)
 * 5. 메서드는 1급 객체인가? -> 아니다. 자바에서는 1급 객체가 class밖에 없다.
 * 6. 메서드는 왜만들어 ? 특정한 역할(목적)을 수행하는 코드 꾸러미를 만들어 두려고
 * -> 캡슐화, 재사용, 코드관리도 편함, 메모리 관리에도 더욱 효과적(호출할 때만 뜰거니까)
 * 7. static메서드 내부에서는 heap에 있는 데이터(상태 데이터)를 찾을 수 없다.
 */

public class MethEx03 {

    int sum = 0;

    void start() { // 출구 없음, 투입구만 있음, 인자는 없음
        int n1 = 10;
        int n2 = 20;
        int result = n1 + n2;
        sum = result;
    }

    public static void main(String[] args) {
        MethEx03 m = new MethEx03(); // call by reference
        m.start(); // 같은 클래스에 있기 때문에, 클래스명 생략 가능
                   // start의 내부 실행됨(큐 호출)
        System.out.println(m.sum);// 메서드의 실행결과를 힙에 보관
    }
}
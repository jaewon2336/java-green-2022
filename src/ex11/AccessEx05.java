package ex11;

// 하나의 자바 파일에는 클래스를 하나만 만드는것이 좋음
// 하나의 자바 파일에는 두개의 public이 있을 수 없음 -> import때문!
// 클래스 내부의 클래스는 가능
class 엘리스 {
    // 상태는 접근할 수 없게 무조건 private
    private int 목마름; // 0 ~ 100

    // 생성자
    // 생성자도 내부구조는 메서드와 같기 때문에 오버로딩이 가능함
    엘리스(int 목마름) {
        this.목마름 = 목마름;
    }

    // private에 접근할 수 있는 통로, 행위에는 public
    public void 물마시기() {
        목마름 = 목마름 - 20;
    }

    // private에 접근할 수 있는 통로, 행위에는 public
    public int 갈증확인하기() {
        return 목마름;
    }
}

public class AccessEx05 {
    public static void main(String[] args) {
        // 자바는 기본자료형과 문자열을 더하면 결합이 되고 문자열 타입으로 변환된다.
        엘리스 e1 = new 엘리스(100);
        System.out.println("엘리스의 갈증지수 : " + e1.갈증확인하기());
        e1.물마시기();
        System.out.println("엘리스의 갈증지수 : " + e1.갈증확인하기());

        e1.물마시기();
        e1.물마시기();
        System.out.println("엘리스의 갈증지수 : " + e1.갈증확인하기());
    }
}

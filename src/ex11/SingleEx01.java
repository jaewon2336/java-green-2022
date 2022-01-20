package ex11;

// 패턴 -> 디자인 패턴 -> 설계도를 패턴으로 만들까?
// 설계도를 만들어 놓으면 누구나 동일하게 만들 수 있음
// 싱글톤 패턴
class 튜브 {
    // main 실행전에 static으로 미리 띄울수 있음
    private static 튜브 instance = new 튜브();
    // 튜브 2개로 pooling기법 사용
    // private static 튜브 instance2 = new 튜브();

    private 튜브() { // 생성자 접근불가, new 불가능

    }

    public static 튜브 getInstance() {
        System.out.println("만들어진 튜브를 가져옵니다.");
        return instance;
    }
}

public class SingleEx01 {
    public static void main(String[] args) {
        튜브 t1 = 튜브.getInstance();
        튜브 t2 = 튜브.getInstance();

        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());
    }
}

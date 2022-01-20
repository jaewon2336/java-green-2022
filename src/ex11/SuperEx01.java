package ex11;

class 가구 {
    String name = "가구";

    가구() {

    }

    가구(int num) {
        System.out.println("나 실행되니 ?");
    }
}

class 침대 extends 가구 {
    String name = "침대";

    침대() {
        super(1);   // super() 이 문장이 항상 생략되어 있음. 
                    //내가 적으면 사라짐.
        System.out.println(super.name);
    }
}

public class SuperEx01 {
    public static void main(String[] args) {
        침대 s = new 침대();
    }
}

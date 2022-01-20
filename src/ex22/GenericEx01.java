package ex22;

class 사과 {
    String name = "사과";
}

class 딸기 {
    String name = "딸기";
}

class 오렌지 {
    String name = "오렌지";
}

class ResponseBox<T> {  // 꺽새안에 어떤 알파벳이 들어가도 상관없음 
                        // 변수자리임 대신 대문자임
    T data; // new 사과()의 주소가 들어감

    public ResponseBox(T data) {
        this.data = data;
    }
}

public class GenericEx01 {
    public static void main(String[] args) {
        ResponseBox<사과> rb1 = new ResponseBox<사과>(new 사과());
        System.out.println(rb1.data.name);
        ResponseBox<딸기> rb2 = new ResponseBox<딸기>(new 딸기());
        System.out.println(rb2.data.name);
        ResponseBox<오렌지> rb3 = new ResponseBox<오렌지>(new 오렌지());
        System.out.println(rb3.data.name);
    }
}

package srp;

public class 요리사 {

    // 요리사는 누구에게도 의존적이지 않으니까 받아올 매개변수가 없다.
    public 음식 음식생성() {
        음식 jjajang = new 음식("짜장면");      
        return jjajang;
    }
}

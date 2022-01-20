package srp;

public class 요리프로그램 {
    public static void main(String[] args) {
        손님 customer = new 손님();
        종업원 manager = new 종업원();
        요리사 chef = new 요리사();

        // 이 요리 프로그램의 딱한가지 문제점
        // 손님이 관계없는 요리사의 저걸 갖고가는거
        // 종업원이 요리사의 주소를 알 수 없기때문에 ㅜ
        customer.주문하기(manager, chef);
    }   
}

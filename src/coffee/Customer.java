/**
 * package coffee;
 * 
 * abstract public class Customer {
 * // 커피를 주문하라(메뉴 이름)
 * abstract public void order(String menuName, Barista barista, Menu menu);
 * }
 * 
 * class 홍길동 extends Customer {
 * private String name = "홍길동";
 * 
 * @Override
 *           public void order(String menuName, Barista barista, Menu menu) {
 *           // 메뉴 항목을 찾아라(메뉴 이름, 리턴 메뉴 항목)
 *           // 가격
 *           MenuItem menuItem = menu.choose("아메리카노");
 * 
 *           // 바리스타 호출(메뉴 항목)
 *           Coffee getCoffee = barista.makeCoffee("아메리카노");
 *           System.out.println(name + "이 " + getCoffee + "를 받았습니다.");
 * 
 *           }
 * 
 *           }
 */
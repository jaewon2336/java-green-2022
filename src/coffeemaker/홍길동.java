package coffeemaker;

abstract class Customer {
	// 1번
	abstract void order(String coffeeName, Barista barista, Menu menu);
}

public class 홍길동 extends Customer {

	@Override
	public void order(String coffeeName, Barista barista, Menu menu) {
		MenuItem menuItem = menu.choose(coffeeName);
		if (menuItem == null) {
			System.out.println("주문하신 커피는 메뉴에 없습니다.");
		}
		// 커피 제조(바리스타 호출)
		Coffee coffee = barista.makeCoffee(menuItem);

		// System.out.println(홍길동이 1500원 아메리카노를 받았습니다.);
		System.out.println("홍길동이 " + coffee.getPrice() + "원 " + coffee.getName() + "를 받았습니다.");
	}

}

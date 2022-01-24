package coffeemaker;

public class Customer {
	// 1번
	public void order(String coffeeName, Barista barista, Menu menu) {
		// 메뉴 항목 찾고(메뉴 호출)
		menu.choose("아메리카노");
		// 커피 제조(바리스타 호출)
	}
}

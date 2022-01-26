package coffeemaker;

import java.util.List;

public class Menu {

	private List<MenuItem> items;

	public Menu(List<MenuItem> items) {
		this.items = items;
	}

	// 2번
	public int choose(String coffeeName) {
		// 메뉴 항목을 줘야해
		for (int i = 0; i < items.size(); i++) {
			if (coffeeName.equals(items.get(i).getName())) {
				return items.get(i).getPrice();
			} else {
				System.out.println("선택된 메뉴는 보기에 없습니다.");
			}
		}
		return 0;
	}

}

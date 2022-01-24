package coffeemaker;

import java.util.List;

public class Menu {

	private List<MenuItem> items;

	public Menu(List<MenuItem> items) {
		this.items = items;
	}

	// 2번
	public List<MenuItem> choose(String menuName) {
		// 메뉴 항목을 줘야해
		for (int i = 0; i < items.size(); i++) {
			if (menuName.equals(items.get(i).getName())) {
				return items.get(i);
			} else {
				System.out.println("선택된 메뉴는 보기에 없습니다.");
				return null;
			}
		}
	}
}

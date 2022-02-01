package coffeemaker;

import java.util.List;

public class Menu {

	private List<MenuItem> items;

	public Menu(List<MenuItem> items) {
		this.items = items;
	}

	// 2번
	public MenuItem choose(String coffeeName) {
		// 메뉴 항목을 줘야해
		for (int i = 0; i < items.size(); i++) {
			if (coffeeName.equals(items.get(i).getName())) {
				return items.get(i);
			}
		}
		return null;
	}

}

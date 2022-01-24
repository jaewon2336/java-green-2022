package coffeeshop;

public class Customer {
	public void order(String menuName, Menu menu, Barista barista) {

		// 2. �޴��׸��� ã�ƶ�!!
		MenuItem menuItem = menu.choose(menuName);
		if (menuItem == null) {
			System.out.println("ã�� �޴��� �����ϴ�.");
		}
		// 3. Ŀ�Ǹ� ������!!
		Coffee coffee = barista.makeCoffee(menuItem);

		System.out.println("Ŀ�Ǹ� �޾ҽ��ϴ�.");
		System.out.println("Ŀ���̸� : " + coffee.getName());
		System.out.println("Ŀ�ǰ��� : " + coffee.getPrice());
	}
}

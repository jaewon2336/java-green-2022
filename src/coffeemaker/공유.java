package coffeemaker;

abstract class Barista {

	abstract Coffee makeCoffee(MenuItem menuItem);
}

public class 공유 extends Barista {

	// 3번
	@Override
	Coffee makeCoffee(MenuItem menuItem) {
		Coffee coffee = new Coffee(menuItem);
		return coffee;
	}

}

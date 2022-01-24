package baemin;

import java.util.Arrays;
import java.util.List;

// 손님 클래스

class Customer {
    public void order(String menuName, Menu menu, Barista barista) {
        MenuItem menuItem = menu.choose(menuName);
        Coffee coffee = barista.makeCoffee(menuItem);
    }
}

// 바리스타 클래스

class Barista {
    public Coffee makeCoffee(MenuItem menuItem) {
        Coffee coffee = new Coffee(menuItem);
        return coffee;
    }
}

// 메뉴판 클래스

class Menu {
    private List<MenuItem> items;

    public Menu(List<MenuItem> items) {
        this.items = items;
    }

    public MenuItem choose(String name) {
        for (MenuItem each : items) {
            if (each.getName().equals(name)) {
                return each;
            }
        }
        return null;
    }
}

// 메뉴 아이템 클래스

class MenuItem {
    private String name;
    private int price;

    public MenuItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int cost() {
        return price;
    }

    public String getName() {
        return this.name;
    }
}

// 커피 클래스

class Coffee {
    private String name;
    private int price;

    public Coffee(MenuItem menuItem) {
        this.name = menuItem.getName();
        this.price = menuItem.cost();
    }
}

// main

public class CoffeeShop {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Barista barista = new Barista();
        // Menu menu = new Menu("아메리카노");

        // customer.order("아메리카노", menu, barista);

    }
}

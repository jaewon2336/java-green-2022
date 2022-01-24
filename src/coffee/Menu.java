/**
 * package coffee;
 * 
 * import java.util.ArrayList;
 * import java.util.List;
 * 
 * public class Menu {
 * private List<MenuItem> coffeeList = new ArrayList<>();
 * 
 * // 메뉴 항목을 찾아라(메뉴 이름)
 * // return 메뉴 항목
 * public MenuItem choose(String menuName) {
 * // 메뉴판에서 이름, 비용 리턴해야함
 * MenuItem menuItem1 = new MenuItem("아메리카노", 1500);
 * MenuItem menuItem2 = new MenuItem("아이스티", 2000);
 * MenuItem menuItem3 = new MenuItem("돌체라떼", 3500);
 * 
 * coffeeList.add(menuItem1);
 * coffeeList.add(menuItem2);
 * coffeeList.add(menuItem3);
 * 
 * if (menuName.equals(menuItem1.getName())) {
 * return menuItem1;
 * }
 * 
 * if (coffeeList.contains(menuName)) {
 * return null;
 * }
 * 
 * return menuItem1;
 * }
 * }
 */
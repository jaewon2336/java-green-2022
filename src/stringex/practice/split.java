package stringex.practice;

public class split {
    public static void main(String[] args) {
        String str = "A:B:C:D:abcd";
        String[] split = str.split(":");
        System.out.println("split : " + split[1]);
    }
}

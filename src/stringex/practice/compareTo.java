package stringex.practice;

public class compareTo {
    public static void main(String[] args) {
        String str1 = "A";
        String str2 = "B";

        int compareTo = str1.compareTo(str2);

        if(compareTo > 0) {
            System.out.println(str1 + " > " + str2);
        } else if (compareTo == 0) {
            System.out.println(str1 + " = " + str2);
        } else {
            System.out.println(str1 + " < " + str2);
        }
    }
}

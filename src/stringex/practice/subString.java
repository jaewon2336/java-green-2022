package stringex.practice;

public class subString {
    public static void main(String[] args) {
        String str = "ABCDEF";
        // 문자열에 지정한 범위에 속하는 문자열 반환
        // 시작범위에 값은 포함, 끝나는 범위에 값은 포함하지 않음)
        String subString = str.substring(0, 2);
        System.out.println("subString : " + subString);
    }
}

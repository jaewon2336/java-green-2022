package ex20;

import java.util.StringTokenizer;

public class StringTest {
    public static void main(String[] args) {
        // 문자열을 분석하여서 토큰으로 분리시켜 주는 기능을 제공
        StringTokenizer st = new StringTokenizer("Will Java change my life?");

        while (st.hasMoreTokens()) { // 문자열을 토큰으로 분리하여 출력한다.
            System.out.println(st.nextToken());
        }
    }
}

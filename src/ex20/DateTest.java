package ex20;

import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        Date d = new Date(); // 현재 날짜로 Date 객체가 생성된다.
        System.out.println(d);
        System.out.println(1900 + d.getYear());
        System.out.println(d.getMonth() + 1);
        System.out.println(d.getDate());

        d.setHours(12);
        d.setMinutes(34);
        d.setSeconds(0);
        System.out.println(d);
    }
}

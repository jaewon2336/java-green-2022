package data01;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor // 풀생성자
@Setter
@Getter
class 사자 {
    private String name;
    private String color;
}

public class TestLombok {
    public static void main(String[] args) {
        사자 s = new 사자("사자", "노랑");
        // s.setName("사자"); 생성자 초기화했으니까 세터 필요 X
        System.out.println(s.getName());
        System.out.println(s.getColor());
    }
}

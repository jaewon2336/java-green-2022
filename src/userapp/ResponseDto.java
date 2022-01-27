package userapp;

import java.util.List; // import = 같은 패키지에 있는것처럼 만들어줌.

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ResponseDto {
    private int code; // 1 = success, -1 = fail, 0 = null.
    private String msg; // fail의 원인
    private List<User> data;
}
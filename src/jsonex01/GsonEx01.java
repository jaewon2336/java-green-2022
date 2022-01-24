package jsonex01;

import com.google.gson.Gson;

// Dto => Data Transper Object
// 통신을 위한 클래스
// 클래스 자체를 전송하는게 아닌 JSON으로 바꿔서 전송한다.
// 반대로 JSON 데이터를 받았을 때는 이 클래스로 받기
// JSON은 타입이 아닌 그냥 문자열 String, 그냥 표기법
class UserDto {
    private String username;
    private String password;

    public UserDto(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}

public class GsonEx01 {
    public static void main(String[] args) {
        // JavaObject -> JSON으로 변경(데이터 전송 목적)
        UserDto userDto = new UserDto("ssar", "1234");
        Gson gson = new Gson(); // static 제공 아님
        // gson의 2가지 메서드만 기억! toJson(), fromJson()
        String jsonUserDto = gson.toJson(userDto);
        System.out.println(jsonUserDto);

        // Json -> JavaObject로 변경(데이터 다운로드 목적)
        UserDto javaUserDto = gson.fromJson(jsonUserDto, UserDto.class);
        System.out.println(javaUserDto.getPassword());
        System.out.println(javaUserDto.getUsername());

    }
}

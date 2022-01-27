package userapp;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor // User(int id, String username, ... full 생성자 자동생성)
@Data // Getter, Setter, toString 자동생성
public class User {
    private int id;
    private String username;
    private String password;
    private String email;
    private String created;
    private String updated;
}
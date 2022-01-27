package postapp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

public class MainApp {
    public static void main(String[] args) {
        try {
            String str = "http://lalacoding.site/init/post";
            URL url = new URL(str);

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));

            String responseJson = br.readLine();
            Gson gson = new Gson();
            ResponseDto dto = gson.fromJson(responseJson, ResponseDto.class);

            if (dto.getCode() != 1) {
                System.out.println("통신 실패 : " + dto.getMsg());
                return;
            }

            System.out.println(dto.getData().size());
            for (int i = 0; i < dto.getData().size(); i++) {
                System.out.println("게시글제목 : " + dto.getData().get(i).getTitle());
                System.out.println("게시글내용 : " + dto.getData().get(i).getContent());
                System.out.println("게시글올린날짜 : " + dto.getData().get(i).getCreated());
                System.out.println("--------------------------------");
                System.out.println("회원아이디 : " + dto.getData().get(i).getUser().getId());
                System.out.println("회원이름 : " + dto.getData().get(i).getUser().getUsername());
                System.out.println("회원이메일 : " + dto.getData().get(i).getUser().getEmail());
                System.out.println("회원가입날짜 : " + dto.getData().get(i).getUser().getCreated());
                System.out.println("================================");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

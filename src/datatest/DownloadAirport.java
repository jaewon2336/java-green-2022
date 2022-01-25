package datatest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

import datatest.AirportDto.Response.Body.Items.Item;

public class DownloadAirport {
    // 공항목록을 조회하여 Map에 담아서 return하는 메서드
    public static Map<String, String> getAirportList() {

        Map<String, String> airportMap = new HashMap<>();

        try {
            URL url = new URL(
                    "http://openapi.tago.go.kr/openapi/service/DmstcFlightNvgInfoService/getArprtList?serviceKey=wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g%3D%3D&_type=json");

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));

            String responseJson = br.readLine();

            Gson gson = new Gson();
            AirportDto airportDto = gson.fromJson(responseJson, AirportDto.class);

            List<Item> result = airportDto.getResponse().getBody().getItems().getItem();

            for (int i = 0; i < result.size(); i++) {
                airportMap.put(result.get(i).getAirportNm(), result.get(i).getAirportId());
            }
        } catch (Exception e) {
            System.out.println("주소를 잘못입력하였습니다.");
        }

        return airportMap;
    }
}

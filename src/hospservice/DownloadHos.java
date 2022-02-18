package hospservice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import hospservice.ResponseDto.Response.Body.Items.Item;

public class DownloadHos {

    public static List<Hospital> getHospitalList() {

        List<Hospital> hospitalList = new ArrayList<>();

        try {
            URL url = new URL(
                    "http://apis.data.go.kr/B551182/rprtHospService/getRprtHospService?serviceKey=wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g%3D%3D&pageNo=1&numOfRows=10&_type=json");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));

            String responseJson = br.readLine();
            Gson gson = new Gson();
            ResponseDto responseDto = gson.fromJson(responseJson, ResponseDto.class);

            List<Item> item = responseDto.getResponse().getBody().getItems().getItem();

            int totalCount = responseDto.getResponse().getBody().getTotalCount();

            url = new URL(
                    "http://apis.data.go.kr/B551182/rprtHospService/getRprtHospService?serviceKey=wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g%3D%3D&pageNo=1&numOfRows="
                            + totalCount + "&_type=json");
            conn = (HttpURLConnection) url.openConnection();

            br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));

            responseJson = br.readLine();
            gson = new Gson();
            responseDto = gson.fromJson(responseJson, ResponseDto.class);

            item = responseDto.getResponse().getBody().getItems().getItem();
            System.out.println(item.size());
            System.out.println();
            // Dto의 item 정보들을 자바 오브젝트(Hospital.class)에 옮겨담기 -> 컬렉션 사용

            for (int i = 0; i < item.size(); i++) {
                Hospital hospital = new Hospital(
                        item.get(i).getAddr(),
                        item.get(i).getMgtStaDd(),
                        item.get(i).getPcrPsblYn(),
                        item.get(i).getRatPsblYn(),
                        item.get(i).getRecuClCd(),
                        item.get(i).getRprtWorpClicFndtTgtYn(),
                        item.get(i).getSgguCdNm(),
                        item.get(i).getSidoCdNm(),
                        item.get(i).getTelno(),
                        item.get(i).getXPosWgs84(),
                        item.get(i).getYPosWgs84(),
                        item.get(i).getYadmNm(),
                        item.get(i).getYkihoEnc());

                hospitalList.add(hospital);
            }

            return hospitalList;

        } catch (Exception e) {
            System.out.println("주소 입력이 잘못되었습니다.");
            e.getMessage();
            e.printStackTrace();
        }
        return null;
    }
}

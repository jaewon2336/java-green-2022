package covid;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import com.google.gson.Gson;

import covid.ResponseDto.Response.Body.Items.Item;

public class DownloadCovid {
    public static List<Item> getCovidList(String startCreateDt, String endCreateDt) {
        try {
            URL url = new URL(
                    "http://openapi.data.go.kr/openapi/service/rest/Covid19/getCovid19InfStateJson?serviceKey=wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g%3D%3D&pageNo=1&numOfRows=10&startCreateDt="
                            + startCreateDt + "&endCreateDt=" + endCreateDt + "&_type=json");

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));

            String responseJson = br.readLine();
            Gson gson = new Gson();
            ResponseDto responseDto = gson.fromJson(responseJson, ResponseDto.class);

            List<Item> result = responseDto.getResponse().getBody().getItems().getItem();

            return result;

        } catch (Exception e) {
            e.getMessage();
            e.printStackTrace();
        }
        return null;
    }
}

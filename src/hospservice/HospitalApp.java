package hospservice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

public class HospitalApp {
    public static void main(String[] args) {
        List<Hospital> hospitalList = DownloadHos.getHospitalList();
        PreparedStatement pstmt;

        try {
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SCOTT", "TIGER");
            System.out.println("DB 연결완료");

            String sql = "INSERT INTO hospital(addr, mgtStaDd, pcrPsblYn, ratPsblYn, recuClCd, rprtWorpClicFndtTgtYn, sgguCdNm, sidoCdNm, telno, XPosWgs84, YPosWgs84, yadmNm, ykihoEnc) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            pstmt = conn.prepareStatement(sql);

            for (int i = 0; i < hospitalList.size(); i++) {

                pstmt.setString(1, hospitalList.get(i).getAddr());
                pstmt.setString(2, hospitalList.get(i).getMgtStaDd());
                pstmt.setString(3, hospitalList.get(i).getPcrPsblYn());
                pstmt.setString(4, hospitalList.get(i).getRatPsblYn());
                pstmt.setString(5, hospitalList.get(i).getRecuClCd());
                pstmt.setString(6, hospitalList.get(i).getRprtWorpClicFndtTgtYn());
                pstmt.setString(7, hospitalList.get(i).getSgguCdNm());
                pstmt.setString(8, hospitalList.get(i).getSidoCdNm());
                pstmt.setString(9, hospitalList.get(i).getTelno());
                pstmt.setString(10, hospitalList.get(i).getXPosWgs84());
                pstmt.setString(11, hospitalList.get(i).getYPosWgs84());
                pstmt.setString(12, hospitalList.get(i).getYadmNm());
                pstmt.setString(13, hospitalList.get(i).getYkihoEnc());

                pstmt.executeUpdate();
            }
            // pstmt.executeUpdate();

            System.out.println("통신끝");

        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println("HospitalApp : " + e.getMessage());
        }

        // System.out.println(result);
    }
}

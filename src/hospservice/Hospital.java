package hospservice;

import lombok.Data;

@Data
public class Hospital {

    private String addr; // 의료기관 주소
    private String mgtStaDd; // 운영시작일자
    private String pcrPsblYn; // 구분코드(PCR 가능여부)
    private String ratPsblYn; // RAT(신속항원검사) 가능여부
    private String recuClCd; // 요양종별코드 11:종합병원, 21:병원, 31:의원
    private String rprtWorpClicFndtTgtYn; // 호흡기전담클리닉 여부
    private String sgguCdNm; // 시군구명
    private String sidoCdNm; // 시도명
    private String telno; // 전화번호
    private String XPosWgs84; // 세계지구 x좌표
    private String YPosWgs84; // 세계지구 y좌표
    private String yadmNm; // 요양기관명
    private String ykihoEnc; // 암호화된 요양기호

    public Hospital(String addr, String mgtStaDd,
            String pcrPsblYn, String ratPsblYn,
            String recuClCd, String rprtWorpClicFndtTgtYn,
            String sgguCdNm, String sidoCdNm, String telno,
            String XPosWgs84, String YPosWgs84,
            String yadmNm, String ykihoEnc) {

        this.addr = addr;
        this.mgtStaDd = mgtStaDd;
        this.pcrPsblYn = pcrPsblYn;
        this.ratPsblYn = ratPsblYn;
        this.recuClCd = recuClCd;
        this.rprtWorpClicFndtTgtYn = rprtWorpClicFndtTgtYn;
        this.sgguCdNm = sgguCdNm;
        this.sidoCdNm = sidoCdNm;
        this.telno = telno;
        this.XPosWgs84 = XPosWgs84;
        this.YPosWgs84 = YPosWgs84;
        this.yadmNm = yadmNm;
        this.ykihoEnc = ykihoEnc;

    }

}

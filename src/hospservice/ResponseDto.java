package hospservice;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ResponseDto {
    private Response response;

    @AllArgsConstructor
    @Data
    public class Response {
        private Header header;
        private Body body;

        @AllArgsConstructor
        @Data
        public class Header {
            private String resultCode;
            private String resultMsg;
        }

        @AllArgsConstructor
        @Data
        public class Body {
            private int numOfRows;
            private int pageNo;
            private int totalCount;
            private Items items;

            @AllArgsConstructor
            @Data
            public class Items {
                private List<Item> item;

                @AllArgsConstructor
                @Data
                public class Item {
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
                }
            }
        }
    }
}

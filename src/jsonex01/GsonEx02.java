package jsonex01;

import com.google.gson.Gson;

class SMSDto {
    private String grounpId;
    private int successCount;
    private int errorCount;
    
    public SMSDto(String grounpId, int successCount, int errorCount) {
        this.grounpId = grounpId;
        this.successCount = successCount;
        this.errorCount = errorCount;
    }

    public String getGrounpId() {
        return grounpId;
    }

    public void setGrounpId(String grounpId) {
        this.grounpId = grounpId;
    }

    public int getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(int successCount) {
        this.successCount = successCount;
    }

    public int getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(int errorCount) {
        this.errorCount = errorCount;
    }
}

public class GsonEx02 {
    public static void main(String[] args) {
        // {"group_id":"R2GdEONszq64lNB9","success_count":1,"error_count":0}
        // SMSDto smsDto = new SMSDto("R2GdEONszq64lNB9", 1, 0);
        Gson gson = new Gson();
        String smsReturn = "{\"groupId\":\"R2GdEONszq64lNB9\",\"successCount\":1,\"errorCount\":0}";
        SMSDto jsonSMSDto = gson.fromJson(smsReturn, SMSDto.class);

        System.out.println(jsonSMSDto.getErrorCount());
        System.out.println(jsonSMSDto.getSuccessCount());
        System.out.println(jsonSMSDto.getGrounpId());
    }
}

package ac.za.cput.cardealership.domain;

public class ResponseObject {

    private  String responseCode ,responseDesc;
    private Object response;

    public ResponseObject(String responseCode, String responseDesc) {
    }

    public String getResponseCode() {
        return responseCode;
    }

    public String getResponseDesc() {
        return responseDesc;
    }

    public Object getResponse() {
        return response;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public void setResponseDesc(String responseDesc) {
        this.responseDesc = responseDesc;
    }

    public void setResponse(Object response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "ResponseObject{" +
                "responseCode='" + responseCode + '\'' +
                ", responseDesc='" + responseDesc + '\'' +
                ", response=" + response +
                '}';
    }
}

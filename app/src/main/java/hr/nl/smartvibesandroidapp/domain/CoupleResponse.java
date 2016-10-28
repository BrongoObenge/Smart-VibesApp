package hr.nl.smartvibesandroidapp.domain;

/**
 * Created by j on 10/28/2016.
 */

public class CoupleResponse {

    private String deviceId;
    private String key;

    public CoupleResponse(String deviceId, String key) {
        this.deviceId = deviceId;
        this.key = key;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }


}

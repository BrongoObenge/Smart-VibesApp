package hr.nl.smartvibesandroidapp.domain;

/**
 * Created by j on 10/28/2016.
 */

public class CoupleRequest {

    private String deviceId;
    private String appId;

    public CoupleRequest(String deviceId, String key) {
        this.deviceId = deviceId;
        this.appId = key;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getKey() {
        return appId;
    }

    public void setKey(String key) {
        this.appId = key;
    }


}

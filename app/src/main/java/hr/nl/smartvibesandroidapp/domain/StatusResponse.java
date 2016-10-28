package hr.nl.smartvibesandroidapp.domain;

/**
 * Created by j on 10/28/2016.
 */

public class StatusResponse {
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public StatusResponse(String status) {
        this.status = status;
    }

    private String status;
}

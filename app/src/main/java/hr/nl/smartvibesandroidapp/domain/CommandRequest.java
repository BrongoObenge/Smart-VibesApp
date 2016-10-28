package hr.nl.smartvibesandroidapp.domain;

/**
 * Created by j on 10/28/2016.
 */

public class CommandRequest {
    private String deviceId;

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public CommandRequest(String deviceId, String command) {
        this.deviceId = deviceId;
        this.command = command;
    }

    private String command;
}

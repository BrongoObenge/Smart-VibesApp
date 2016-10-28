package hr.nl.smartvibesandroidapp;


import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import hr.nl.smartvibesandroidapp.domain.CommandRequest;
import hr.nl.smartvibesandroidapp.domain.CoupleRequest;
import hr.nl.smartvibesandroidapp.domain.CoupleResponse;
import hr.nl.smartvibesandroidapp.domain.StatusResponse;

/**
 * Created by j on 10/28/2016.
 */

public class RestHandler {
    // Create a new RestTemplate instance
    RestTemplate restTemplate = new RestTemplate();
    String appId = "";
    String deviceId = "";
    public RestHandler(String appId){
        restTemplate.getMessageConverters().add(new StringHttpMessageConverter());
        this.appId = appId;

    }
    public void coupleRequestDevice(String uuid){

        String urlDevice = "http://192.168.4.1/couple";
        String urlBend = "http://145.24.222.157:8080/couple/app";

        CoupleResponse response = restTemplate.getForEntity(urlDevice, CoupleResponse.class).getBody();
        this.deviceId = response.getDeviceId(); // Write to file
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        CoupleRequest req = new CoupleRequest(response.getDeviceId(), uuid);
        StatusResponse anotherResponse = restTemplate.postForEntity(urlBend, req, StatusResponse.class).getBody();
        System.out.println(anotherResponse);
    }

    public StatusResponse sendCommand(String command){
        String urlBend = "http://145.24.222.157:8080/couple/send";
        StatusResponse response = restTemplate.postForEntity(urlBend,new CommandRequest(deviceId, command), StatusResponse.class).getBody();
        return response;
    }
    public String sendOnOffline(){
        String urlDevice = "http://192.168.4.1/on";
        String response = restTemplate.getForObject(urlDevice, String.class);
        return response;
    }
    public String sendOffOffline(){
        String urlDevice = "http://192.168.4.1/off";
        String response = restTemplate.getForEntity(urlDevice, String.class).getBody();
        return response;
    }
}

package com.cloud.eurekaclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@RestController
@RequestMapping("/rest/eureka/client")
public class Controller {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public String callEurekaServer(){

        String url = "http://eureka-server/rest/eureka/server";
        String response = restTemplate.getForObject(url, String.class);

        return response;
    }


}

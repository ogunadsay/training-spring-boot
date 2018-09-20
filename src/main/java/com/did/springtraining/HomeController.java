package com.did.springtraining;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${homeController.msg}")
    private String homeControllerMsg;

    @Value("${app.description}")
    private String appName;

    @Value("${my.secret}")
    private String UUID;

    @Value("${spring.profiles.active}")
    private String environment;

    @RequestMapping("/")
    public String home(){
        return homeControllerMsg;
    }
}

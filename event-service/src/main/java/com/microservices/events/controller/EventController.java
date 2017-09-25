package com.microservices.events.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class EventController {
    @Value("${feature.x.enable}")
    String featureXEnable;

    @RequestMapping("/index")
    public String index() {
        if (featureXEnable.equals("true")) {
            return "feature.x.enable = true";
        }

        return "no enable feature";
    }
}

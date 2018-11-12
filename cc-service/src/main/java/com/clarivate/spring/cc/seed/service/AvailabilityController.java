package com.clarivate.spring.cc.seed.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AvailabilityController {

    @RequestMapping(value = "/ping", method = RequestMethod.GET)
    public Map ping() {
        Map<String, String> pingResponse = new HashMap<>();
        pingResponse.put("ping", "Availability Service Alive!");
        return pingResponse;
    }
}

package com.klu.discoveryservice;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DriverController {

    @Value("${local.server.port:${server.port}}")
    private String port;

    @GetMapping("/drivers")
    public Map<String, Object> getDrivers() {

        return Map.of(
            "message", "Driver service is running",
            "service", "Driver Service",
            "port", port
        );
    }
}
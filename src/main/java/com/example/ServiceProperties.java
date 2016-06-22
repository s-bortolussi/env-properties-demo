package com.example;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author Sebastien Bortolussi
 */
@Component
@ConfigurationProperties
public class ServiceProperties {

    private Map<String,Service> services;

    public Map<String, Service> getServices() {
        return services;
    }

    public void setServices(Map<String, Service> services) {
        this.services = services;
    }

}

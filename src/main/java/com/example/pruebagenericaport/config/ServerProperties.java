package com.example.pruebagenericaport.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "server")
@Getter
@Setter
public class ServerProperties {

    private Map<String, String> application;
    private Map<String, List<String>> config;
    private Map<String, Credential> users;

    // getters and setters
    @Getter
    @Setter
    public static class Credential {

        private String username;
        private String password;

        // getters and setters

    }
}
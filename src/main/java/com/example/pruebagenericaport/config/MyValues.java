package com.example.pruebagenericaport.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class MyValues {
    private String username;
    private String password;
}

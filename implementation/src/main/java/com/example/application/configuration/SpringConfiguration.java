package com.example.application.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan({
    "com.example.application",
    "com.jlupin.servlet.monitor.configuration"
})
public class SpringConfiguration {
}
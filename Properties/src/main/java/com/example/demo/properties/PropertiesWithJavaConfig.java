package com.example.demo.properties;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:setting.properties")
public class PropertiesWithJavaConfig {

}

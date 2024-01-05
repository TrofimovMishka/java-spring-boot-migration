package com.example.migration.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebConfiguration implements WebMvcConfigurer {

//    @Override
//    public void configurePathMatch(PathMatchConfigurer configurer) {
//        configurer.setUseTrailingSlashMatch(true);
//    }

}
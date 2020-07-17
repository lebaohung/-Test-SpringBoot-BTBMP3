package com.codegym.btb.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan("com.codegym.btb.controller")
public class AppConfig implements WebMvcConfigurer, ApplicationContextAware {
    private ApplicationContext appContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) {
        appContext = applicationContext;
    }
}

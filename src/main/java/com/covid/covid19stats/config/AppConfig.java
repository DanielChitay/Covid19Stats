/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.covid.covid19stats.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
/**
 *
 * @author rodol
 */
@Configuration
public class AppConfig {
            @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
    
}

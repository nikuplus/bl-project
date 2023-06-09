package com.example.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

@Configuration
public class CommonConfig {
  @Bean
  public CharacterEncodingFilter characterEncodingFilter() {
    return new SJISCharacterEncodingFilter();
  }
}

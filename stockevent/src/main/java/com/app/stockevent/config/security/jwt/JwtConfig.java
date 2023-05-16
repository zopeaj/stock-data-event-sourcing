package com.app.stockevent.config.security.jwt;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class JwtConfig {

  @Bean
  public JwtProperties jwtProperties() {
    return new JwtProperties();
  }

}

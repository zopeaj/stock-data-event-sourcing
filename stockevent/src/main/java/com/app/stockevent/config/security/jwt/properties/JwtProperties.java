package com.app.stockevent.config.security.jwt.properties;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.properties.ConfigurationProperties;


@Configuration
@ConfigurationProperties(prefix="app.jwt")
public class JwtProperties {

  private String secretKey;

  private Integer expirationDate;

  private String tokenPrefix;

  public String getSecretKey() {
    return secretKey;
  }

  public void setSecretKey(String secretKey){
    this.secretKey = secretKey;
  }

  public Integer getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(Integer expirationDate) {
    this.expirationDate = expirationDate;
  }

  public String getTokenPrefix() {
    return tokenPrefix;
  }

  public void setTokenPrefix(String tokenPrefix) {
    this.tokenPrefix = tokenPrefix;
  }
}


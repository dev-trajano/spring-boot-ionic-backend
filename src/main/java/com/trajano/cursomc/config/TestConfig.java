package com.trajano.cursomc.config;

import com.trajano.cursomc.services.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.text.ParseException;

@Configuration
@Profile("test")
public class TestConfig {

  @Autowired
  private DBService dbservice;

  @Bean
  public boolean instantieDataBase() throws ParseException {
    dbservice.instantiateTestDataBase();
    return true;
  }
}

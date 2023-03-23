package com.spring.cucumber.example.glue;

import com.spring.cucumber.example.Main;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = Main.class)
public class CucumberSpringConfiguration { }
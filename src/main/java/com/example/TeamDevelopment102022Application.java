package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "hoge.fuga") 
public class TeamDevelopment102022Application {

	public static void main(String[] args) {
		SpringApplication.run(TeamDevelopment102022Application.class, args);
	}

}

package com.example.config;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.form.NewRegisterForm;


@Configuration
public class JavaConfig {
	@Bean
	ModelMapper modelMapper(){
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper;
	}

		@Bean
		NewRegisterForm newRegisterForm(){
			NewRegisterForm newRegisterForm = new NewRegisterForm();
			return newRegisterForm;
			}
			
//		@Bean	
//		PasswordEncoder passwordEncoder(){
//			PasswordEncoder passwordEncoder = new PasswordEncoder();
//			return passwordEncoder;
//		}

		}
	


package com.example.config;

import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.formLogin(login -> login
                .loginProcessingUrl("/login")
                .loginPage("/login")
                .defaultSuccessUrl("/Mypage1",true)
                .failureUrl("/login?error")
                .usernameParameter("id")
                .passwordParameter("pass")
                .permitAll()
                
        ).authorizeHttpRequests(authz -> authz
                .requestMatchers(PathRequest.toStaticResources().atCommonLocations()).permitAll()
                .mvcMatchers("/shinki").permitAll()
                .mvcMatchers("/register_completion").permitAll()
                .anyRequest().authenticated()
        );
        return http.build();
    }

   
    
  
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    
    /** 認証の設定 
    @Override
    protected void configure(AuthenticationManegerBuilder auth) throws Exception{
    	
    	
    	
    	PasswordEncoder encoder = passwordEncoder();
        auth
        
            .userDetailsService(userDetailsService)
            .oasswordEncoder(encoder);
    
    }*/
}
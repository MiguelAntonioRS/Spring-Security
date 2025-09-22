package com.security.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebFluxSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        /*return httpSecurity
                .authorizeHttpRequests()
                .a("/s1/notSecured")
                    .permitAll()
                    .anyRequest().authenticated()
                .and()
                .build();*/

        return httpSecurity
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/s1/notSecured").permitAll()
                        .anyRequest().authenticated()
                )
                .build();
    }
}

package com.security.test.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;

@Configuration
@EnableWebFluxSecurity
@EnableMethodSecurity
public class SecurityConfig {

    /*@Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        /*return httpSecurity
                .authorizeHttpRequests()
                .a("/s1/notSecured")
                    .permitAll()
                    .anyRequest().authenticated()
                .and()
                .build();

        return httpSecurity
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/s1/notSecured").permitAll()
                        .anyRequest().authenticated()
                )
                .formLogin(Customizer.withDefaults())
                .logout(Customizer.withDefaults())
                .build();
    }*/
}

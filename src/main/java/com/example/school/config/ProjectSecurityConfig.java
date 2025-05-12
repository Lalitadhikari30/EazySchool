package com.example.school.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfig {

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {

                http.authorizeHttpRequests(authorizeRequests -> authorizeRequests
                .requestMatchers("/home").permitAll()
                .requestMatchers("/holidays/**").permitAll()
                .requestMatchers("/contact").permitAll()
                .requestMatchers("/courses").authenticated()
                .requestMatchers("/saveMsg").permitAll()
                .requestMatchers("/about").permitAll()
                .requestMatchers("/assets/**").permitAll()
                        .anyRequest().authenticated()
                        )
                        .formLogin(Customizer.withDefaults())
                        .httpBasic(Customizer.withDefaults());


//        http.authorizeHttpRequests(requests -> requests.anyRequest().denyAll())
//                .formLogin(Customizer.withDefaults())
//                .httpBasic(Customizer.withDefaults());

        return http.build();
    }

}

package com.bitiot.volga3_login.app.config;

import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.CsrfConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {

    // Aquí se define la configuración de seguridad
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {


        httpSecurity
                .cors(cors -> cors.configurationSource(request -> new CorsConfiguration().applyPermitDefaultValues()))
                .csrf(CsrfConfigurer::disable)
                .authorizeHttpRequests(auth -> auth // Aquí se da el acceso a las urls y a los endpoints
                        .requestMatchers("/auth/**").permitAll() // Se le permite a todos entrar a estos endpoints
                        .anyRequest().authenticated() // Cualquier otro endpoint, el usuario tiene que estar autenticado
                )
                .formLogin(Customizer.withDefaults())
                ;
        return httpSecurity.build();
    }

//    @Bean
//    public PasswordEncoder passwordEncoder(){
//        return new BCryptPasswordEncoder(); //Se define la política de encryptación con este algoritmo
//    }
//
//    @Bean
//    public AuthenticationManager authenticationManager(HttpSecurity http,PasswordEncoder passwordEncoder, UserDetailsService userDetailsService) throws Exception {
//        AuthenticationManagerBuilder auth = http.getSharedObject(AuthenticationManagerBuilder.class);
//        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder);
//        return auth.build();
//
//    }

}

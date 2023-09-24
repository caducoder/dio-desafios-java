package com.publicvote.api.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Bean
	public SecurityFilterChain configure(HttpSecurity http) throws Exception {
	    http
	    .csrf(csrf -> csrf.disable())
	    .authorizeHttpRequests( (authorize) -> authorize
	           .requestMatchers(HttpMethod.GET, "/polls" ).permitAll()
	           .anyRequest().authenticated()
	     )
	    .sessionManagement(sm -> sm.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
	    .httpBasic(withDefaults());
	    
	    http.headers(header -> header.frameOptions(t -> t.sameOrigin()));

	    return http.build();
	}
}

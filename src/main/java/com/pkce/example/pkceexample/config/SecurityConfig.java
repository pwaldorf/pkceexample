package com.pkce.example.pkceexample.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        logger.info("Inside configure");
        http
                .authorizeRequests(authz -> authz.mvcMatchers("/test**").authenticated())
                .oauth2ResourceServer(oauth2 -> oauth2.jwt());
    }


}

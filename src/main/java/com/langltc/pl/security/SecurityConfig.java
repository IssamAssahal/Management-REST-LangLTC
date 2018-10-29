package com.langltc.pl.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.sql.DataSource;

/**
 * @author Issam As-sahal ISA
 * @Created 2:58 PM
 **/
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    public final String[] PUBLIC_ENDPOINTS={
//            "/api/v1/admin/**",
//            "/api/v1/students"
    };

    @Autowired
    DataSource dataSource;

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder managerBuilder)throws Exception{
        managerBuilder.jdbcAuthentication().dataSource(dataSource)
                .passwordEncoder(new BCryptPasswordEncoder())
                .usersByUsernameQuery("select username,password,enabled from admin where username=?")
                .authoritiesByUsernameQuery("select username,role from user_roles where username=?");

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
             http
            .cors().and().csrf().disable()
            .sessionManagement()
                     .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
            .and()
            .authorizeRequests()
                     .antMatchers(PUBLIC_ENDPOINTS).permitAll()
                     .antMatchers("/api/v1/admin/**").hasRole("ADMIN")
                     .antMatchers("/api/v1/students/").hasRole("USER")
                     .anyRequest().hasRole("ADMIN")
            .and()
            .httpBasic();
    }
}

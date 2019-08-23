package com.ideas.aditya.customerApp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {


    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.inMemoryAuthentication()
        .passwordEncoder(passwordEncoder)
        .withUser("user1").password(passwordEncoder.encode("123")).roles("USER", "ADMIN")
        .and()
        .withUser("user2").password(passwordEncoder.encode("123")).roles("USER");
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.csrf().disable();
        http.authorizeRequests()
        .antMatchers("/login").permitAll()
        .antMatchers("/admin/**").hasRole("ADMIN")
        .antMatchers("/**").hasAnyRole("ADMIN", "USER")
        .and().formLogin()
        .and().logout().logoutSuccessUrl("/login").permitAll()
        .and()
        .exceptionHandling().accessDeniedPage("/accessdenied")
        .and().csrf().disable();
    }
}

package com.crminfo.crminfo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class DemoSecurityConfig {

    //add support for jdbc... no more hardcoded users :-)

//    @Bean
//    public UserDetailsManager userDetailsManager(DataSource dataSource){
//
//
//        return new JdbcUserDetailsManager(dataSource);
//
//    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{

        http.authorizeHttpRequests(configurer ->
                                configurer
//                        .requestMatchers("/").hasRole("ADMIN")
//                        .requestMatchers("/employees/toactive").hasRole("ADMIN")
                                        //                     .requestMatchers("/employees/list").hasRole("EMPLOYEE")
//                        .requestMatchers("/").hasRole("EMPLOYEE")
                                        .anyRequest().authenticated()
                )
                .formLogin(form ->
                        form
                                .loginPage("/showMyLoginPage")
                                .loginProcessingUrl("/authenticateTheUser")
                                .permitAll()
                )
                .logout(logout -> logout.permitAll())
                .exceptionHandling(configurer->
                        configurer.accessDeniedPage("/access-denied")
                );


        return http.build();

    }


    @Bean
    public InMemoryUserDetailsManager userDetailManager(){

        UserDetails john = User.builder()
                .username("john")
                .password("{noop}test123")
                .roles("EMPLOYEE")
                .build();

        UserDetails mary = User.builder()
                .username("mary")
                .password("{noop}test123")
                .roles("EMPLOYEE", "MANAGER")
                .build();


        UserDetails susan = User.builder()
                .username("susan")
                .password("{noop}test123")
                .roles("EMPLOYEE", "MANAGER1", "ADMIN")
                .build();

        UserDetails sam = User.builder()
                .username("sam")
                .password("{noop}test123")
                .roles("EMPLOYEE", "MANAGER2", "ADMIN")
                .build();


        UserDetails khalil = User.builder()
                .username("khalil")
                .password("{noop}khalil")
                .roles("ADMIN", "EMPLOYEE")
                .build();

        UserDetails hicham = User.builder()
                .username("hicham")
                .password("{noop}hicham")
                .roles("ADMIN", "EMPLOYEE")
                .build();
        UserDetails ahmed = User.builder()
                .username("ahmed")
                .password("{noop}ahmed")
                .roles("EMPLOYEE")
                .build();

        UserDetails lamiaa = User.builder()
                .username("lamiaa")
                .password("{noop}lamiaa")
                .roles("EMPLOYEE")
                .build();

        return new InMemoryUserDetailsManager(john, mary, susan, sam, khalil, lamiaa, hicham, ahmed);
    }

}

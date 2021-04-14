package com.myfarm.auth2;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                //.antMatchers("/auth2/**" ).permitAll() //all urls here are based on server.servlet.contextPath defined in application.properties
                //.antMatchers(HttpMethod.DELETE, "/auth2/**").hasAnyAuthority(Constants.UserRole.admin.getName())
                //.antMatchers("/oauth/**", "/login/**", "/logout/**")
                //.permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .requestMatchers()
                .antMatchers("/auth2/**");//配置需要保护的资源路径
    }
}

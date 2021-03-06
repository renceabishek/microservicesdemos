package com.app.gateway.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;

@Configuration
@EnableResourceServer
public class GatewayResourceServer extends ResourceServerConfigurerAdapter {

	
	private static final String RESOURCE_ID = "my_users_rest_api";
	
	@Override
	public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
	
		resources.resourceId(RESOURCE_ID).stateless(false);
	}
	
	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("users-ms/users/details")
		.access("hasRole('ADMIN')")
		.anyRequest().authenticated();
	}
}

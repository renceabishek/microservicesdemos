package com.users.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
//@EnableDiscoveryClient
@EnableFeignClients
public class UserAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserAppApplication.class, args);
	}

	//Annotation to mark a RestTemplate bean to be configured to use a 
	//LoadBalancerClient
	/*
	 * @Bean
	 * 
	 * @LoadBalanced public RestTemplate getRestTemplate() { return new
	 * RestTemplate(); }
	 */
}

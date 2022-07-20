package com.example.springhateoas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
@EnableCaching
public class SpringHateoasApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringHateoasApplication.class, args);
	}

}

package com.springboot.rest.initializer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.springboot.rest")
@SpringBootApplication
public class ApplicationStartup extends SpringBootServletInitializer
{
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application)
	{
		return application.sources(ApplicationStartup.class);
	}

	public static void main(String[] args)
	{
		SpringApplication.run(ApplicationStartup.class, args);
	}
}

package com.studentmanagement.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.studentmanagement"})
public class StudentAppConfig {
	
	@Bean
	public InternalResourceViewResolver viewResolver()
	{
		InternalResourceViewResolver viewResolve = new InternalResourceViewResolver();
		
		viewResolve.setPrefix("/WEB-INF/view");
	    viewResolve.setSuffix(".jsp");
		
		return viewResolve ;
	}

}

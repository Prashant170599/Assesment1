package com.fulcrum.MvcDemo3;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"com.fulcrum"})
public class Myconfig
{
	@Bean
	public InternalResourceViewResolver viewResource(){
		
		org.springframework.web.servlet.view.InternalResourceViewResolver vr=new InternalResourceViewResolver();
		vr.setPrefix("/views/");
		vr.setSuffix(".jsp");
		return vr;
		
	}
	

}

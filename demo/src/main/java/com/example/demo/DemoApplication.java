package com.example.demo;
 
 
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
 


@MapperScan(basePackageClasses = DemoApplication.class)
@SpringBootApplication
public class DemoApplication {
     public static void main(String[] args) {
    	 SpringApplication.run(DemoApplication.class, args);
    }
 
     
 
    @Bean
    public InternalResourceViewResolver setupViewResolver() {
 
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
 
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
}
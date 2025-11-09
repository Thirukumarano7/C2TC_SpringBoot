package com.tnsif.SpringBoot_DI_ioc_Scope_5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DiIocScopeProject5Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext var = SpringApplication.run(DiIocScopeProject5Application.class, args);
	
		Customer1 c1 = var.getBean(Customer1.class);
		c1.show();
		Customer1 c2 = var.getBean(Customer1.class);
		c2.show();
	
	}
}

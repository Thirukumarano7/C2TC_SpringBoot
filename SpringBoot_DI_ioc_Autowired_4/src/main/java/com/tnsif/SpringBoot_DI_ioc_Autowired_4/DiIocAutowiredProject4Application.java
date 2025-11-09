package com.tnsif.SpringBoot_DI_ioc_Autowired_4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DiIocAutowiredProject4Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext var = SpringApplication.run(DiIocAutowiredProject4Application.class, args);
		
		Customer1 c1 = var.getBean(Customer1.class);
		c1.show();
	}

}

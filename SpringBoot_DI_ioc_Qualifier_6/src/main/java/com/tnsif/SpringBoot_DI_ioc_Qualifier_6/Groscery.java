package com.tnsif.SpringBoot_DI_ioc_Qualifier_6;

import org.springframework.stereotype.Component;

@Component
public class Groscery implements Ordering {
	
	public void order() {
		System.out.println("Ordering grocery Products...");
	}
	

}

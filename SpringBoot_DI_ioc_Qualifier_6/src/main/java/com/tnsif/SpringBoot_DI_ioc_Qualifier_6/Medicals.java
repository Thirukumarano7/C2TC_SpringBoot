package com.tnsif.SpringBoot_DI_ioc_Qualifier_6;

import org.springframework.stereotype.Component;

@Component
public class Medicals implements Ordering {

	public void order() {
		System.out.println("Ordering Medical Products");
	}

}

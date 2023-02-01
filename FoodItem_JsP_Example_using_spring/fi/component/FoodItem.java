package com.xworkz.fi.component;

import org.jboss.logging.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/taste")
public class FoodItem {
	public FoodItem() {

		System.out.println("Created: " + this.getClass().getSimpleName());
	}
	
	@PostMapping
	public String onTaste(@RequestParam String fname,@RequestParam String ftype,@RequestParam int fquantity,@RequestParam double fprice)
	{
		
		System.out.println("Food Name: "+fname);
		System.out.println("Food Type: "+ftype);
		System.out.println("Food Quantity: "+fquantity);
		System.out.println("Food Name: "+fprice);
		return "index.jsp";
	}

}

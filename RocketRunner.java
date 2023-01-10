package com.xworkz.springbeans.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springbeans.beans.Rocket;
import com.xworkz.springbeans.configuration.RocketConfiguration;

public class RocketRunner {

	public static void main(String[] args) {

	ApplicationContext container1=new AnnotationConfigApplicationContext(RocketConfiguration.class);
	System.out.println("===========================================================================");
	Rocket rkt=container1.getBean("rocket",Rocket.class);
	System.out.println(rkt.getName());
	System.out.println(rkt.getCountry());
	System.out.println(rkt.getPrice());
	System.out.println("===========================================================================");
	Rocket rkt2=container1.getBean("launched",Rocket.class);
	System.out.println(rkt2.getName());
	System.out.println(rkt2.getCountry());
	System.out.println(rkt2.getPrice());
	}

}

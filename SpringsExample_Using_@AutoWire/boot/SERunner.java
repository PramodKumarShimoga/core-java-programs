package com.xworkz.springAutowire.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springAutowire.bean.SoftwareEngineer;
import com.xworkz.springAutowire.configuration.SEConfiguration;

public class SERunner {

	public static void main(String[] args) {
		
		ApplicationContext container=new AnnotationConfigApplicationContext(SEConfiguration.class);
		SoftwareEngineer e=container.getBean(SoftwareEngineer.class);
		System.out.println(e);
	}

}
